package jcube;

public class Face 
{
	public String title;
	public String astuce;
	
	public static Face créerFace(String string)
	{
		Face face = new Face();
		face.title = string;
		return face;
	}
}
