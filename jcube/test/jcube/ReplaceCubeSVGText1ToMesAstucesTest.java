package jcube;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.w3c.dom.Element;

public class ReplaceCubeSVGText1ToMesAstucesTest 
{
	 public void replaceNodeContentShouldBelaGrosseAstuceDuSiècle() throws Exception
	 {
		XMLDocument cubeSVG = (new XMLDocument()).loadXMLFile("templates/cube.svg");
		Element blocNode = cubeSVG.getFirstNodeFromXPath("//tspan[contains(text(), \"$text1\")]");
		blocNode.setTextContent("la grosse astuce du siècle");
		XMLDocument readCubeSVG = (new XMLDocument()).loadXMLString(cubeSVG.asXMLString());
		assertTrue(readCubeSVG.match("//tspan[contains(text(), \"la grosse astuce du siècle\")]"));
	 }
}
