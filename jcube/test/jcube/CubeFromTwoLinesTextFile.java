package jcube;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromTwoLinesTextFile {
	private Cube actualCube;
	
	
	@Before
	public void loadCubeFromTextFile() throws IOException
	{
		this.actualCube = Cube.fromTextFile("templates/one-line-cube.txt");	
	}
	
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot");
		assertEquals(expectedCube, actualCube);
	}
	
	public void cubeShouldHaveSesquiverEnCachette()
	{
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot");
	}
	
	
	

}
