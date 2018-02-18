

import java.util.Random;
public class door 
{
	// assigns directions to numbers
	public static final int UNDEFINED = 0;
	public static final int NORTH = 1;
	public static final int SOUTH = 2;
	public static final int EAST  = 3;
	public static final int WEST  = 4;
	public static final int UP    = 5;
	public static final int DOWN  = 6;
	public static final int NORTHEAST = 7;
	public static final int NORTHWEST = 8;
	public static final int SOUTHEAST = 9;
	public static final int SOUTHWEST = 10;
	public static final int IN = 11;
	public static final int OUT = 12;

	// String codes	
	public static final String[] dirName = 
	{ 
		"UNDEFINED",
		"NORTH",
		"SOUTH",
		"EAST",
		"WEST",
		"UP",
		"DOWN",
		"NORTHEAST",
		"NORTHWEST",
		"SOUTHEAST",
		"SOUTHWEST",
		"IN",
		"OUT"
	};

	public static final String[] shortDirName = 
	{
		"NULL",
		"N",
		"S",
		"E",
		"W",
		"U",
		"D",
		"NE",
		"NW",
		"SE",
		"SW",
		"I",
		"O"		
	};

	private room leadsTo = null;
	private int direction;

	// full direction names
	private String directionName;

	// short direction names
	private String shortDirectionName;

	public door()
	{
		direction = door.UNDEFINED;
		leadsTo = null;
		directionName = dirName[UNDEFINED];
		shortDirectionName = shortDirName[UNDEFINED];
	}

	public door( int d, room to1, room to2, room to3 )
	{
		direction = d;

		// Assign direction names
		if (direction <= dirName.length )
			directionName = dirName[direction];
		if (direction <= shortDirName.length )
			shortDirectionName = shortDirName[direction];

		Random r = new Random();
		int n = r.nextInt(2)+1;
		
		if(n == 1){
			leadsTo = to1;
		}
		else if (n== 2){
			leadsTo = to2;
		}
		else{
			leadsTo = to3;
		}
	}

	public String toString()
	{
		return directionName;
	}

	public void setDirectionName( String dirname )
	{
		directionName = dirname;
	}

	public String getDirectionName()
	{
		return directionName;
	}

	public void setShortDirectionName ( String shortName )
	{
		shortDirectionName = shortName;
	}

	public String getShortDirectionName ()
	{
		return shortDirectionName;
	}

	public void setLeadsTo ( room to )
	{
		leadsTo = to;
	}

	public room getLeadsTo (  )
	{
		return leadsTo;
	}

}