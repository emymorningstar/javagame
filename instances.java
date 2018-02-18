import java.util.ArrayList;

public class instances {
	String previous;
	static ArrayList<String> s= new ArrayList();
	static ArrayList<String> display = new ArrayList(); 
	static Room currentRoom= new Room();
	static creature player = new creature();
	
	public instances(){
		s.add("Welcome to Adventure Path! You are the great hero, on a quest to stop the evil Dr. Big Bad");
		s.add("Before you is a path, leading through the dangers of this world. At the end, Dr. Big Bad");
		s.add("awaits. The path leads north. ");
		display=s;
	}
	public static ArrayList<String> getDisplay() {
		return display;
	}
	public static void changeDisplay(ArrayList<String> a) {
		display=a;
	}
	public static Room getCurrentRoom() {
		return currentRoom;
		
	}	
	
	public static void setCurrentRoom(Room r) {
		currentRoom=r;
		instances.changeDisplay(instances.getCurrentRoom().getDescription());
	}
	
	public static creature getPlayer() {
		return player;
	}
			
}