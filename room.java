
package adventurePath;
import java.util.Vector;

public class Room 
{
	// Member variables
	private String roomTitle;
	private String roomDescription;
	private Vector door;

	// Blank constructor
	public Room()
	{
		// Blank title + description
		roomTitle = new String ();
		roomDescription = new String();
		door = new Vector();
	}

	// Partial constructor
	public Room( String title )
	{
		// Assign title
		roomTitle = title;

		// Blank description
		roomDescription = new String();

		// Blank exits
		door = new Vector();
	}

	// Full constructor
	public Room( String title, String description )
	{
		roomTitle = title;
		roomDescription = description;

		door = new Vector();
	}

	public void addDoor ( Door exit )
	{
		door.addElement (exit);
	}

	public void removeExit ( Door exit )
	{
		if (door.contains (exit))
		{
			door.removeElement (exit);
		}
	}

	public Vector getExits ()
	{
		return (Vector) door.clone();
	}
	
	public String getTitle()
	{
		return roomTitle;
	}

	public void setTitle( String title )
	{
		roomTitle = title;
	}

	public String getDescription()
	{
		return roomDescription;
	}

	public void setDescription( String description )
	{
		roomDescription = description;
	}
}