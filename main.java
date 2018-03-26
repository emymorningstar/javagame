import javax.swing.JFrame;
import java.util.ArrayList;

public class main {
	/**
	 * declares all the rooms and runs the gameloop. as well as combat loop.
	 * 
	 */
	public static void main(final String[] args) {
		layout l = new layout();
		creature Bob = new creature("Bob", 10, 10, 2, 2);
		creature cMonster = new creature("Lake Monster", 10, 10, 5, 5);
		creature ghost = new creature("Ghost", 15, 15, 3, 4);
		creature dragon = new creature("Dragon", 15, 15, 15, 3);
		creature lich = new creature("Lich", 6, 6, 10, 8);
		creature chickMan = new creature("Chicken Man", 10, 10, 10, 10);
		creature drBigBad = new creature("Big bad", 10, 10, 10, 10);
		ArrayList<String> start = new ArrayList<String>();
		start.add(
				"Welcome to Adventure Path! You are the great hero, on a quest to stop the evil Dr.");
		start.add(
				"Big Bad Before you is a path, leading through the dangers of this world. At the");
		start.add("end, Dr. Big Bad awaits. The path leads north. ");
		

		ArrayList<String> vd = new ArrayList<String>();
		vd.add("You find yourself in a village filled with happiness. You have been resting ");
		vd.add("here for a couple of days, regaining your strength to fight Dr. Big Bad. There is a ");
		vd.add("path that leads north.");
		vd.add("(north)");
		ArrayList<String> ffd = new ArrayList<String>();
		ffd.add("You are now in the fairy forest. All around you trees are buzzing with the sound of");
		ffd.add("thousands of wings. You can see a pond, a giant glowing tree, and a fairy.”");
		ffd.add("(north, talk fairy, look tree, look pond)");
		ArrayList<String> secC = new ArrayList<String>();
		secC.add(
				"You find yourself navigating a strange cave. The walls glow a luminescent green,");
		secC.add("allowing you to see. In the middle of the cave is a pond.");
		secC.add("(north)");
		ArrayList<String> wd = new ArrayList<String>();
		wd.add("You are now in a concrete building filled with cubicles. The doors behind you and too");
		wd.add("the north are locked. You can see a cubicle with your name on it. In the back you");
		wd.add("can see an office.");
		wd.add("(work, cubicle, office)");
		ArrayList<String> merd = new ArrayList<String>();
		merd.add(
				"You are now in front of a gorgeous lake. You hear singing coming from it, luring you ");
		merd.add(
				"in. Beautiful women with fish tails for legs swim around. In the middle of the lake, ");
		merd.add("you can see a tiny island with something shiny on it.");
		merd.add("(island)");
		ArrayList<String> ghd = new ArrayList<String>();
		ghd.add("You enter a big mansion on top of the hill. All around you are strange whispers and ");
		ghd.add("moans. On the north side of the room is a locked door. In the middle of the room is ");
		ghd.add("an old set of armor");

		ArrayList<String> medD = new ArrayList<String>();
		medD.add(
				"You are in a grassy meadow. Butterflies flutter around you. In the middle of the ");
		medD.add(
				"meadow, on a hill, there is an old, yet beautiful suit of armor.");
		medD.add("");

		ArrayList<String> dragD = new ArrayList<String>();
		dragD.add(
				"You enter a cave. To the left and to the right are piles of useless junk. In front ");
		dragD.add(
				"of you there is a giant dragon. He is fast asleep, but in his claws you see a sword. ");
		dragD.add("Behind him to the north the path continues.");

		ArrayList<String> lichD = new ArrayList<String>();
		lichD.add(
				"You are now in a strange dungeon. You wonder how you got in here. In the middle of");
		lichD.add(
				"the dungeon you see a skeleton holding a chest. To the north the path continues.");
		lichD.add("");

		ArrayList<String> farmD = new ArrayList<String>();
		farmD.add(
				"You find yourself on a little farm. It’s quite and piece full. An old man sits on ");
		farmD.add(
				"the porch and asks you to join him for dinner. The path continues north.");
		farmD.add("");

		ArrayList<String> bigD = new ArrayList<String>();
		bigD.add(
				"You have made it to the end of your journey. Dr. Big Bad stands in front of you. He");
		bigD.add(
				"starts monologuing, but you can’t really hear him through his helmet.");
		bigD.add("");

		Room village = new Room("village", vd);
		Room fairyForest = new Room("Fairy Forest", ffd);
		Room secCave = new Room("Secret Cave", secC);
		Room work = new Room("Work", wd, Bob);// Monster
		Room merLake = new Room("Mermaids Lake", merd, cMonster);// Monster
		Room ghostHouse = new Room("Ghost House", ghd, ghost);// Monster
		Room meadow = new Room("Meadow of Frollicking", medD);
		Room dragonCave = new Room("The Dragon's Cave", dragD, dragon);// Monster
		Room lichHouse = new Room("The lair of the Lich", lichD, lich);// Monster
		Room farm = new Room("The farm of eternal despair", farmD, chickMan);// Monster
		Room badLair = new Room("Dr. Big Bad's Lair", bigD,drBigBad);// Monster????
		Door door1 = new Door(fairyForest, secCave, work);
		Door door2 = new Door(merLake, ghostHouse, meadow);
		Door door3 = new Door(dragonCave, lichHouse, farm);
		Door door4 = new Door(badLair, badLair, badLair);
		village.setDoor(door1);
		fairyForest.setDoor(door2);
		secCave.setDoor(door2);
		work.setDoor(door2);
		merLake.setDoor(door3);
		ghostHouse.setDoor(door3);
		meadow.setDoor(door3);
		dragonCave.setDoor(door4);
		lichHouse.setDoor(door4);
		farm.setDoor(door4);

		instances.setCurrentRoom(village);

		while (true) {
			l.render();

			if (instances.getfight() == true) {
				System.out.println("start fight");
				while (instances.getCurrentRoom().getCreature()
						.getHealth() > 0) {
					l.render();

				}
				System.out.println("end fight");
				instances.setfight(false);
			}
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			l.clearGui(null);
		}
	}
}
