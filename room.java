import java.util.ArrayList;

public class Room 
{
	// Member variables
	private String roomTitle;
	private ArrayList<String> roomDescription;
	private Door door;
	private creature character;

	// Blank constructor
	public Room()
	{
		// Blank title + description
		roomTitle = new String ();
		roomDescription = new ArrayList<String>();
		door = new Door();
		character= null;
	}

	// Partial constructor
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

	// Full constructor
	public Room( String title, ArrayList<String> description, creature c )
	{
		roomTitle = title;
		roomDescription = description;
		door = new Door();
		character = c;
	}

	public void setDoor ( Door exit )
	{
		door= exit;
	}

	public Door getDoors ()
	{
		return door;
	}
	
	public String getTitle()
	{
		return roomTitle;
	}

	public void setTitle( String title )
	{
		roomTitle = title;
	}

	public ArrayList<String> getDescription()
	{
		return roomDescription;
	}

	public void setDescription( ArrayList<String> description )
	{
		roomDescription = description;
	}
}