
package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromOneLineTextFile {	
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot");
		
		Cube actualCube = Cube.fromTextFile("templates/one-line-cube.txt");		
		assertEquals(expectedCube, actualCube);
	}
}
