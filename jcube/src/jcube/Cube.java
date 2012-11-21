package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cube {
	
	private String urlTextFile;
	
	public static Cube fromTextFile(String urlFile){
		Cube c =  new Cube();
		c.loadAttributesFromFile(urlFile);
		return c;
	}
	
	public Cube loadAttributesFromFile(String url)
	{
		this.urlTextFile = url;
		return this;
	}

	public Integer numberOfFaces(){
		return 1;
	}

	public String titreFace(int i) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.urlTextFile)));
		String line = reader.readLine();
		reader.close();
		return line.substring(2);
	}

}
