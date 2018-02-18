
package adventurePath;

import java.util.Random;
public class Door 
{	

	private Room leadsTo = null;

	public Door()
	{
		leadsTo = null;
	}

	public Door(Room to1, Room to2, Room to3 )
	{
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

	public void setLeadsTo ( Room to )
	{
		leadsTo = to;
	}

	public Room getLeadsTo (  )
	{
		return leadsTo;
	}
	
}