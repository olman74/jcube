package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cube {
	private String filePath;

	public static Cube fromTextFile(String filepath) {
		Cube cube = new Cube();
		return cube.setFilePath(filepath);
	}

	private Cube setFilePath(String filepath) {
		this.filePath = filepath;
		return this;
	}


	public Integer numberOfFaces() {
		return 1;
	}

	public String titreFace(int i) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.filePath)));
		String line = reader.readLine();
		reader.close();
		
		return line.substring(2);
	}

}
