package jcube;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromTwoLinesTextFile {
	private Cube actualCube;
	
	
	@Before
	public void loadCubeFromTextFile() throws IOException
	{
		this.actualCube = Cube.fromTextFile("templates/two-line-cube.txt");	
	}
	
	@Test
	public void cubeShouldBeOneFaceWithTitleAndAstuce() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot", "S esquiver en cachette");
		assertEquals(expectedCube, actualCube);
	}
	
	@Test
	public void cubeShouldNotBeOneFaceWithTitleAndAstuce() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot", "S'esdddddtte");
		assertFalse(expectedCube.equals( actualCube));
	}
	
	@Test
	public void theCheatTitleInTheFileTextShouldBeInSVGFile()throws Exception
	{
		XMLDocument doc = (new SVGDocument()).fromCube(actualCube);
		assertTrue(doc.match("//text[contains(text(), \"S esquiver en cachette\")]"));
	}

	
	
	

}
