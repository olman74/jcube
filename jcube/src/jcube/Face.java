package jcube;

public class Face 
{
	public String title;
	public String astuce;
	
	public static Face cr�erFace(String string)
	{
		Face face = new Face();
		face.title = string;
		return face;
	}
}
