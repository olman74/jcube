package jcube;

import org.w3c.dom.Element;

public class SVGDocument 
{
	public  static XMLDocument fromCube(Cube cube) throws Exception 
	{
		XMLDocument doc = (new XMLDocument()).loadXMLFile("templates/cube.svg");
		Element blocNodeTitle = doc.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNodeTitle.setTextContent(cube.face.title);
		Element blocNodeCheatTitle = doc.getFirstNodeFromXPath("//text[contains(text(), \"$text1\")]");
		blocNodeCheatTitle.setTextContent(cube.face.cheats.get(0).title);
		Element blocNodeCheatDescription = doc.getFirstNodeFromXPath("//tspan[contains(text(), \"$help1\")]");
		blocNodeCheatDescription.setTextContent(cube.face.cheats.get(0).description);
		System.out.println(doc);
		return doc;
	}

}
