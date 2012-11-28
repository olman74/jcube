package jcube;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromTwoAstucesTest {
	private Cube actualCube;
	
	
	@Before
	public void loadCubeFromTextFile() throws IOException
	{
		this.actualCube = Cube.fromTextFile("templates/two-line-cube.txt");	
	}
	
	@Test
	public void CubeShouldHaveOneFaceWithOneTitleAndTwoAstuces()
	{
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot", "S esquiver en cachette");
		assertEquals(expectedCube, actualCube);
	}
	
}
