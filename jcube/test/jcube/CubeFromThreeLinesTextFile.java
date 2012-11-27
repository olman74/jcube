package jcube;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromThreeLinesTextFile {
	private Cube actualCube;
	
	
	@Before
	public void loadCubeFromTextFile() throws IOException
	{
		this.actualCube = Cube.fromTextFile("templates/three-line-cube.txt");	
	}
	
	@Test
	public void cubeShouldBeOneFaceWithTitleAndAstuce() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot", "S esquiver en cachette", "Partir sur la pointe des pieds");
		assertEquals(expectedCube, actualCube);
	}
	
	@Test
	public void cubeShouldNotBeOneFaceWithTitleAndAstuce() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot", "Sesdddddtte","dtfrdgf");
		assertFalse(expectedCube.equals( actualCube));
	}
	
	

	
	
}
