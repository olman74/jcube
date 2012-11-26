package jcube;

public class Face 
{
	public String title = "";
	public String astuce = "";
	public String description = "";
	
	public static Face créerFace(String title, String astuce, String description)
	{
		Face face = new Face();
		face.title = title;
		face.astuce = astuce;
		face.description = description;
		return face;
	}
	
	public static Face créerFace(String title, String astuce)
	{
		Face face = new Face();
		face.title = title;
		face.astuce = astuce;
		return face;
	}
	
	public static Face créerFace(String title)
	{
		Face face = new Face();
		face.title = title;
		face.astuce = "";
		return face;
	}
	
	public boolean equals(Object other) {
		Face otherFace = (Face)other;
		return this.title.equals(otherFace.title) && this.astuce.equals(otherFace.astuce);
	}
}
