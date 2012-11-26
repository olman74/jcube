package jcube;

import org.w3c.dom.Element;

public class SVGDocument 
{
	public  XMLDocument fromCube(Cube cube) throws Exception 
	{
		XMLDocument doc = (new XMLDocument()).loadXMLFile("templates/cube.svg");
		Element blocNode = doc.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNode.setTextContent(cube.face.title);
		return doc;
	}

}
