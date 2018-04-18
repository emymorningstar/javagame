package adventurePath;
import java.util.Random;
/**
 *Door class, handles traveling between rooms.
 * 
 */
public class Door {	
	/**
	 *room variable to be used later in class.
	 * 
	 */
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
	 * @param to1 first option for next room
	 * @param to2 second option for next room 
	 * @param to3 third option for next room
	 */
	public Door(final Room to1, final Room to2, final Room to3) {
		Random r = new Random();
		int n = r.nextInt(2) + 1;
		
		if (n == 1) {
			leadsTo = to1;
		} else if (n == 2) {
			leadsTo = to2;
		} else {
			leadsTo = to3;
		}
	}
	/**
	 *sets leads to for a room.
	 *
	 * @param to another room that can be connect to the current one
	 * 
	 */
	public void setLeadsTo(final Room to) {
		leadsTo = to;
	}
	/**
	 *gets leads to for a room.
	 *
	 *@return 		Room leadsto
	 * 
	 */
	public Room getLeadsTo() {
		return leadsTo;
	}
	
}
