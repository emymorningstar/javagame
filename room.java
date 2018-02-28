import java.util.ArrayList;

public class Room 
{
	// Member variables
	private String roomTitle;
	private ArrayList<String> roomDescription;
	private Door door;
	private creature character;

	
	/**
	 * Blank constructor
	 */
	public Room()
	{
		// Blank title + description
		roomTitle = new String ();
		roomDescription = new ArrayList<String>();
		door = new Door();
		character= null;
	}

	/**
	 * partial constructor
	 * 
	 * @param String title
	 * @param ArrayList<String> discription
	 */
	public Room( String title, ArrayList<String> d )
	{
		// Assign title
		roomTitle = title;

		// Blank description
		roomDescription = d;

		// Blank exits
		door = new Door();
		
		character = null;
	}

	/**
	 * full constructor
	 * 
	 * @param 		String title
	 * @param 		ArrayList<String> discription
	 * @param 		creature c
	 */
	public Room( String title, ArrayList<String> description, creature c )
	{
		roomTitle = title;
		roomDescription = description;
		door = new Door();
		character = c;
	}
	/**
	 *sets door to exit the room
	 *
	 *@param Door exit
	 * 
	 */
	public void setDoor ( Door exit )
	{
		door= exit;
	}
	/**
	 *gets room door
	 *
	 *@return Door door
	 * 
	 */
	public Door getDoors ()
	{
		return door;
	}
	/**
	 *gets room title
	 *
	 *@return String roomTitle
	 * 
	 */
	public String getTitle()
	{
		return roomTitle;
	}
	/**
	 *sets room title
	 *
	 *@param String title
	 * 
	 */
	public void setTitle( String title )
	{
		roomTitle = title;
	}
	/**
	 *gets room description
	 *
	 *@return ArrayList<String> roomDescription
	 * 
	 */
	public ArrayList<String> getDescription()
	{
		return roomDescription;
	}
	/**
	 *sets room description
	 *
	 *@param ArrayList<String> description 
	 * 
	 */
	public void setDescription( ArrayList<String> description )
	{
		roomDescription = description;
	}
	/**
	 *gets room creature
	 *
	 *@return Creature 
	 * 
	 */
	public creature getCreature(){
		return character;
	}
	/**
	 *sets room creature
	 *
	 *@param Creature c
	 * 
	 */
	public void setCreature(creature c){
		character = c;
	}
	
}