package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class CubeTextFile {
	
	private String filepath;
	String title;
	String astuce;
	String description;


	public CubeTextFile(String filepath)
	{
		this.filepath = filepath;
	}
	
	
	public Cube newCube() throws IOException {
	Cube cube = new Cube();
	BufferedReader reader = new BufferedReader(new FileReader(new File(this.filepath)));
	String line;

	while ((line = reader.readLine()) != null) 
	{
		if(line.substring(0,1).equals("*"))
		{
			if(line.substring(1,2).equals("*"))
			{
				astuce = line.substring(3);
				
				if(line.substring(2,3).equals("*"))
				{
					description = line.substring(4);
				}
				else
				{
					description = "";
				}
			}
			else
			{
			title = line.substring(2);
			astuce = "";
			}
		}
	}
	reader.close();
	cube.addFace(title, astuce);
	reader.close();
	return cube;
	
	}

}
