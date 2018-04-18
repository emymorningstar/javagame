package adventurePath;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
/**
 * all information for the game is stored here.
 * 
 */
public class Instances {
	/**
	 * previous displayed string.
	 * 
	 */
	private String previous;
	/**
	 * start string.
	 * 
	 */
	private static ArrayList<String> s = new ArrayList();
	/**
	 * current display string.
	 * 
	 */
	private static ArrayList<String> display = new ArrayList();
	/**
	 * current room.
	 * 
	 */
	private static Room currentRoom = new Room();
	/**
	 * stores player.
	 * 
	 */
	private static Creature player = new Creature();
	/**
	 * is in a fight.
	 * 
	 */
	private static boolean fight = false;
	/**
	 * is health above 0.
	 * 
	 */
	private static boolean game = true;
	/**
	 * what image to display.
	 * 
	 */
	private static BufferedImage currentImage = null;
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
	 * @param a list of strings
	 */
	public static void changeDisplay(final ArrayList<String> a) {
		display = a;
	}
	/**
	 * gets current room.
	 * 
	 * @return currentRoom 
	 */
	public static Room getCurrentRoom() {
		return currentRoom;

	}
	/**
	 * sets current room.
	 * 
	 * @param r 
	 */
	public static void setCurrentRoom(final Room r) {
		currentRoom = r;
		Instances.changeDisplay(Instances.getCurrentRoom().getDescription());
	}
	/**
	 * gets player.
	 * 
	 * @return player 
	 */
	public static Creature getPlayer() {
		return player;
	}
	/**
	 * checks if in a fight.
	 * 
	 * @return fight
	 */
	public static boolean getfight() {
		return fight;
	}
	/**
	 * sets if we are in a fight or not.
	 * 
	 * @param t 
	 */
	public static void setfight(final boolean t) {
		fight = t;
	}
	/**
	 * get game variable, see if we lost.
	 * 
	 * @return game
	 */
	public static boolean getGame() {
		return game;
	}
	/**
	 * sets game variable.
	 * 
	 * @param g the game variable
	 */
	public static void setGame(final boolean g) {
		game = g;
	}
	/**
	 *gets current image.
	 *
	 *@return currentImage
	 */
	public static BufferedImage getCurrentImage() {
		return currentImage;
	}
	/**
	 * sets current image.
	 * 
	 * @param i 
	 */
	public static void setCurrentImage(final BufferedImage i) {
		currentImage = i;
	}
}
