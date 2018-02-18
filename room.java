

import java.util.Vector;

public class room 
{
	// Member variables
	private String roomTitle;
	private String roomDescription;
	private Vector door;

	// Blank constructor
	public room()
	{
		// Blank title + description
		roomTitle = new String ();
		roomDescription = new String();
		door = new Vector();
	}

	// Partial constructor
	public room( String title )
	{
		// Assign title
		roomTitle = title;

		// Blank description
		roomDescription = new String();

		// Blank exits
		door = new Vector();
	}

	// Full constructor
	public room( String title, String description )
	{
		roomTitle = title;
		roomDescription = description;

		door = new Vector();
	}

	public void addDoor ( door exit )
	{
		door.addElement (exit);
	}

	public void removeExit ( door exit )
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