package jcube;

import java.io.IOException;
import java.util.ArrayList;

public class Cube {
	public Face face = new Face();

	public static Cube fromTextFile(String filepath) throws IOException {
		return (new CubeTextFile(filepath)).newCube();
	}

	public Cube addFace(String title) {
		Face f = Face.créerFace(title);
		this.face.title = title;  
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		return this.face.title.equals(otherCube.face.title);
	}
}
