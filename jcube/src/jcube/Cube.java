package jcube;

import java.io.IOException;
import java.util.ArrayList;

public class Cube {
	public Face face = new Face();

	public static Cube fromTextFile(String filepath) throws IOException {
		return (new CubeTextFile(filepath)).newCube();
	}

	public Cube addFace(String title, String astuce, String description) {
		Face f = Face.créerFace(title, astuce, description);
		this.face = f;  
		return this;
	}
	
	public Cube addFace(String title, String astuce) {
		Face f = Face.créerFace(title, astuce);
		this.face = f;  
		return this;
	}
	
	public Cube addFace(String title) {
		Face f = Face.créerFace(title);
		this.face = f;  
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		return this.face.equals(otherCube.face);
	}
	
	
}
