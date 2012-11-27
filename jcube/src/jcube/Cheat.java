package jcube;

public class Cheat 
{
	String title;
	String description;
	
	public static Cheat newCheat(String title, String description) {
		Cheat cheat = new Cheat();
		cheat.title = title;
		cheat.description = description;
		return cheat;
	}
}
