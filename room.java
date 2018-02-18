

package adventurePath;
import java.util.ArrayList;


public class room 
{
	// Member variables
	private String roomTitle;
	private ArrayList<String> roomDescription;
	private Door door;

	// Blank constructor
	public room()
	{
		// Blank title + description
		roomTitle = new String ();
		roomDescription = new ArrayList<String>();
		door = new Door();
	}

	// Partial constructor
	public room( String title )
	{
		// Assign title
		roomTitle = title;

		// Blank description
		roomDescription = new ArrayList<String>();

		// Blank exits
		door = new Door();
	}

	// Full constructor
	public Room( String title, ArrayList<String> description )

	{
		roomTitle = title;
		roomDescription = description;

		door = new Door();
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