

import java.util.ArrayList;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		layout l= new layout();
		
		ArrayList<String> vd =new ArrayList();
		vd.add( "You find yourself in a village filled with happyness. You have been resting here for ");
		vd.add( "a couple of days, regaining your strenght to fight Dr. Big Bad. There is a path that leads north.");
				
		Room village = new Room("village", vd);
		ArrayList<String> ff=new ArrayList();
		ff.add("so pretty");
		Room fairyForest = new Room("Fairy Forest",ff);
//		Room secCave = new Room("Secret Cave", "spooky damp cave");
//		Room work = new Room("Work","It's very boring.");
//		Room merLake = new Room("Mermaids Lake", "Wet lake with cute hunnies");
//		Room ghostHouse = new Room("Ghost House", "Spooky ghosts want to eat you");
//		Room meadow = new Room("Meadow of Frollicking", "a peacefull meadow");
//		Room dragonCave = new Room("The Dragon's Cave", "A giant lizard is here.");
//		Room lichHouse = new Room("The lair of the Lich", "A spooky skeleton watches you. And he has magic.");
//		Room farm = new Room ("The farm of eternal despair", "It's smelly and the cows look mean");
//		Room badLair = new Room("Dr. Big Bad's Lair", "Dr. Big Bad sits in his chair, judging you");
//		Door Door1 = new Door(1, fairyForest, secCave, work);
//		Door Door2 = new Door(1, merLake, ghostHouse, meadow);
//		Door Door3 = new Door(1, dragonCave, lichHouse, farm);
//		Door Door4 = new Door(1, badLair, badLair, badLair);
//		village.addDoor(Door1);
//		fairyForest.addDoor(Door2);
//		secCave.addDoor(Door2);
//		work.addDoor(Door2);
//		merLake.addDoor(Door3);
//		ghostHouse.addDoor(Door3);
//		meadow.addDoor(Door3);
//		dragonCave.addDoor(Door4);
//		lichHouse.addDoor(Door4);
//		farm.addDoor(Door4);
		
		instances.setCurrentRoom(village);
		
		while (true) {
			l.render();
			instances.changeDisplay(instances.getCurrentRoom().getDescription());
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		l.clearGui(null);
		}
	}
}
	