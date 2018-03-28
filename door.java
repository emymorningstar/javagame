import java.util.Random;
public class Door {	

	private Room leadsTo = null;
	/**
	 *default room constructor.
	 * 
	 */
	public Door() {
		leadsTo = null;
	}
	/**
	 *room constructor sets leads to possibilities.
	 *
	 *@param 		Room to1, Room to2,Room to3
	 * 
	 */
	public Door(final Room to1, final Room to2, final Room to3) {
		Random r = new Random();
		int n = r.nextInt(2) +1;
		
		if(n == 1) {
			leadsTo = to1;
		}
		else if (n == 2) {
			leadsTo = to2;
		}
		else {
			leadsTo = to3;
		}
	}
	/**
	 *sets leads to for a room.
	 *
	 *@param 		Room to
	 * 
	 */
	public void setLeadsTo(final Room to) {
		leadsTo = to;
	}
	/**
	 *gets leads to for a room.
	 *
	 *@returns 		Room leadsto
	 * 
	 */
	public Room getLeadsTo() {
		return leadsTo;
	}
	
}