package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {
	
	public Cube cube;
	
	@Before
	public void createCubeTest()
	{
		this.cube = Cube.fromTextFile("templates/one-lineCube.txt");
	}

	@Test
	public void cubeShouldHaveAtLeastOneFace() 
	{
		assertEquals(new Integer(1), cube.numberOfFaces());
	}
	
	@Test
	public void titleFaceShouldBeUneLigne() throws IOException
	{
		assertEquals("une ligne", cube.titreFace(0));
	}
	

	
	
}
