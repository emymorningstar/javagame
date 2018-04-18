import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Instances {
	String previous;
	static ArrayList<String> s = new ArrayList();
	static ArrayList<String> display = new ArrayList();
	static Room currentRoom = new Room();
	static Creature player = new Creature();
	static boolean fight = false;
	static boolean game = true;
	static BufferedImage currentImage= null;
	/**
	 * sets initial display string array.
	 * 
	 */
	public Instances() {
		s.add("Welcome to Adventure Path! You are the great hero, on a quest to stop the evil Dr. Big Bad");
		s.add("Before you is a path, leading through the dangers of this world. At the end, Dr. Big Bad");
		s.add("awaits. The path leads north. ");
		display = s;
	}

	/**
	 * Retrieves the current display string.
	 * 
	 * @return current display string array
	 */
	public static ArrayList<String> getDisplay() {
		return display;
	}

	/**
	 * sets the current display string array.
	 * 
	 * @param Araylist
	 *            of strings
	 */
	public static void changeDisplay(final ArrayList<String> a) {
		display = a;
	}

	public static Room getCurrentRoom() {
		return currentRoom;

	}

	public static void setCurrentRoom(final Room r) {
		currentRoom = r;
		Instances.changeDisplay(Instances.getCurrentRoom().getDescription());
	}

	public static Creature getPlayer() {
		return player;
	}

	public static boolean getfight() {
		return fight;
	}

	public static void setfight(final boolean t) {
		fight = t;
	}
	
	public static boolean getGame() {
		return game;
	}
	
	public static void setGame(final boolean g) {
		game = g;
	}
	public static BufferedImage getCurrentImage() {
		return currentImage;
	}

	public static void setCurrentImage(final BufferedImage i) {
		currentImage = i;
	}
}
