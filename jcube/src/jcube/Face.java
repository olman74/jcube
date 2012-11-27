package jcube;

import java.util.ArrayList;

public class Face 
{
	public String title = "";
	public String astuce = "";
	public String description = "";
	public ArrayList <Cheat> cheats = new ArrayList<Cheat>();
	
	public static Face créerFace(String title, String astuce, String description)
	{
		Face face = new Face();
		face.title = title;
		Cheat cheat = Cheat.newCheat(astuce, description);
		face.cheats.add(cheat);
		return face;
	}
	
	public static Face créerFace(String title, String astuce)
	{
		Face face = new Face();
		face.title = title;
		Cheat cheat = Cheat.newCheat(astuce, "");
		face.cheats.add(cheat);
		return face;
	}
	
	public static Face créerFace(String title)
	{
		Face face = new Face();
		face.title = title;
		Cheat cheat = Cheat.newCheat("", "");
		face.cheats.add(cheat);
		return face;
	}
	
	public boolean equals(Object other) {
		Face otherFace = (Face)other;
		return this.title.equals(otherFace.title) && this.cheats.get(cheats.size()-1).title.equals(otherFace.cheats.get(cheats.size()-1).title);
	}
}
