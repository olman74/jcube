package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {
	private Cube cube;

	@Before
	public void createCubeFromTextFile() {
		this.cube = Cube.fromTextFile("templates/one-line-cube.txt");		
	}
	
	
	@Test
	public void cubeShouldHaveOneFace() {
		assertEquals(new Integer(1), this.cube.numberOfFaces());	
	}

	@Test
	public void titreFaceShouldBeCommentSortirDuCoursPlusTot() throws IOException {
		assertEquals("Comment sortir du cours plus t™t", this.cube.titreFace(0));
	}
}
