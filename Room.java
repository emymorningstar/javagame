package adventurePath;
import java.util.ArrayList;
/**
 * class to make and manage rooms.
 */
public class Room {
	// Member variables
	/**
	 * door. 
	 */
	private Door door;
	/**
	 * room title.
	 */
	private String roomTitle;
	/**
	 * room discription for display.
	 */
	private ArrayList<String> roomDescription;
	/**
	 * creature to include in room.
	 */
	private Creature character;

	/**
	 * Blank constructor.
	 */
	public Room() {
		// Blank title + description
		roomTitle = new String();
		roomDescription = new ArrayList<String>();
		door = new Door();
		character = null;
	}

	/**
	 * partial constructor.
	 * 
	 * @param title 
	 * @param d 
	 */
	public Room(final String title, final ArrayList<String> d) {
		// Assign title
		roomTitle = title;

		// Blank description
		roomDescription = d;

		// Blank exits
		door = new Door();

		character = null;
	}

	/**
	 * full constructor.
	 * 
	 * @param title the room title
	 *            
	 * @param description room description
	 *           
	 * @param  c Creature
	 *            
	 */
	public Room(final String title, final ArrayList<String> description, final Creature c) {
		roomTitle = title;
		roomDescription = description;
		door = new Door();
		character = c;
	}

	/**
	 * sets door to exit the room.
	 *
	 * @param exit A Door that exits the room
	 * 
	 */
	public void setDoor(final Door exit) {
		door = exit;
	}

	/**
	 * gets room door.
	 *
	 * @return Door door
	 * 
	 */
	public Door getDoors() {
		return door;
	}

	/**
	 * gets room title.
	 *
	 * @return String roomTitle
	 * 
	 */
	public String getTitle() {
		return roomTitle;
	}

	/**
	 * sets room title.
	 *
	 * @param title the name of the room used for checking input
	 * 
	 */
	public void setTitle(final String title) {
		roomTitle = title;
	}

	/**
	 * gets room description.
	 *
	 * @return ArrayList<String> roomDescription
	 * 
	 */
	public ArrayList<String> getDescription() {
		return roomDescription;
	}

	/**
	 * sets room description.
	 *
	 * @param description ArrayList<String> has the description of the room
	 * 
	 */
	public void setDescription(final ArrayList<String> description) {
		roomDescription = description;
	}

	/**
	 * gets room creature.
	 *
	 * @return Creature
	 * 
	 */
	public Creature getCreature() {
		return character;
	}

	/**
	 * sets room creature.
	 *
	 * @param c creature
	 * 
	 */
	public void setCreature(final Creature c) {
		character = c;
	}

}
