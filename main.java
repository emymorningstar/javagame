

package adventurePath;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		layout l= new layout();
		
		
		

		String s = "Welcome to Adventure Path! You are the great hero, on a quest to stop the evil Dr. Big Bad"
				+ "Before you is a path, leading through the dangers of this world. At the end, Dr. Big Bad"
				+ "awaits. The path leads north. ";
		String display = s;
		String vd = "You find yourself in a village filled with happyness. You have been resting here for "
				+ "a couple of days, regaining your strenght to fight Dr. Big Bad. There is a path that leads north.";
				
		Room village = new Room("village", vd);
		Room fairyForest = new Room("Fairy Forest","so pretty");
		Room secCave = new Room("Secret Cave", "spooky damp cave");
		Room work = new Room("Work","It's very boring.");
		Room merLake = new Room("Mermaids Lake", "Wet lake with cute hunnies");
		Room ghostHouse = new Room("Ghost House", "Spooky ghosts want to eat you");
		Room meadow = new Room("Meadow of Frollicking", "a peacefull meadow");
		Room dragonCave = new Room("The Dragon's Cave", "A giant lizard is here.");
		Room lichHouse = new Room("The lair of the Lich", "A spooky skeleton watches you. And he has magic.");
		Room farm = new Room ("The farm of eternal despair", "It's smelly and the cows look mean");
		Room badLair = new Room("Dr. Big Bad's Lair", "Dr. Big Bad sits in his chair, judging you");
		Door door1 = new Door(1, fairyForest, secCave, work);
		Door door2 = new Door(1, merLake, ghostHouse, meadow);
		Door door3 = new Door(1, dragonCave, lichHouse, farm);
		Door door4 = new Door(1, badLair, badLair, badLair);
		village.addDoor(door1);
		fairyForest.addDoor(door2);
		secCave.addDoor(door2);
		work.addDoor(door2);
		merLake.addDoor(door3);
		ghostHouse.addDoor(door3);
		meadow.addDoor(door3);
		dragonCave.addDoor(door4);
		lichHouse.addDoor(door4);
		farm.addDoor(door4);
		
		Room current = village;
		
		while (true) {
			l.render();
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		l.clearGui(null);
		}
	}
}
	