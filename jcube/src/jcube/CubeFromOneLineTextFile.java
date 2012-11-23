
package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class CubeFromOneLineTextFile {	
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot");
		
		Cube actualCube = Cube.fromTextFile("templates/one-line-cube.txt");		
		assertEquals(expectedCube, actualCube);
	}
	
	@Test
	public void theLineInTheFileTextShouldBeInSVGFile()throws Exception
	{
		Cube actualCube = Cube.fromTextFile("templates/one-line-cube.txt");
		XMLDocument doc = (XMLDocument) actualCube.toSVG("templates/cube.svg");
		assertTrue(doc.match("//tspan[contains(text(), \"Comment sortir du cours plus tot\")]"));
	}
}


