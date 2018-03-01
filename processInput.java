import java.util.ArrayList;

public class processInput {
	// write mermaid lake stuff
	/**
	 * checks input and changes the current display string. checks for valid
	 * input.
	 * 
	 * @param String
	 *            s input
	 * 
	 */
	static void doInput(String s) {
		s = s.toLowerCase();
		if (s.contains("north")
				&& instances.currentRoom.getTitle() != "Dr. Big Bad's Lair") {
			if (instances.currentRoom.getTitle() != "Mermaids Lake"
					|| (instances.currentRoom.getTitle() == "Mermaids Lake"
							&& instances.currentRoom.getCreature()
									.getHealth() <= 0)) {
				if (instances.currentRoom.getTitle() != "Work"
						|| (instances.currentRoom.getTitle() == "Work"
								&& instances.currentRoom.getCreature()
										.getHealth() <= 0)) {
					if (instances.currentRoom.getTitle() != "Ghost House"
							|| (instances.currentRoom
									.getTitle() == "Ghost House"
									&& instances.currentRoom.getCreature()
											.getHealth() <= 0)) {
						Door d = instances.getCurrentRoom().getDoors();
						instances.setCurrentRoom(d.getLeadsTo());
					}
				}
			}
		}

		/*
		 * commands for Work room
		 */
		else if (instances.currentRoom.getTitle() == "Work"
				&& (s.contains("work") || s.contains("cubicle"))) {
			ArrayList<String> working = new ArrayList<String>();
			working.add(
					"You start to work. The day goes on, and you can feel the boredom kick in.");
			working.add("You gain 5 work dollars.");

			instances.changeDisplay(working);
		} else if (instances.currentRoom.getTitle() == "Work"
				&& s.contains("office")) {
			ArrayList<String> office = new ArrayList<String>();
			office.add(
					"In the office you can see the manager: a giant troll with a nametage that says Bob.");
			office.add(
					"Bob gives you a stern look and tells you to get back to work.");
			instances.changeDisplay(office);
		} else if (instances.currentRoom.getTitle() == "Work"
				&& (s.contains("talk bob") || s.contains("talk to bob"))) {
			ArrayList<String> tBob = new ArrayList<String>();
			tBob.add("Get back to work, work Monkey!");

			instances.setfight(true);

			instances.changeDisplay(tBob);
		}

		/*
		 * commands for Fairy Forest
		 */
		else if (instances.currentRoom.getTitle() == "Fairy Forest"
				&& s.contains("look tree")) {
			ArrayList<String> lTree = new ArrayList<String>();
			lTree.add("In the tree you see a glowing helmet.");
			instances.changeDisplay(lTree);
		} else if (instances.currentRoom.getTitle() == "Fairy Forest"
				&& s.contains("get helmet")) {
			ArrayList<String> gfHelm = new ArrayList<String>();
			gfHelm.add("You got the fairy helmet! Your defense goes up by 3!");
			instances.changeDisplay(gfHelm);
			instances.getPlayer()
					.setArmor(3 + instances.getPlayer().getArmor());
		} else if (instances.currentRoom.getTitle() == "Fairy Forest"
				&& s.contains("talk fairy")) {
			ArrayList<String> tFairy = new ArrayList<String>();
			tFairy.add(
					"The fairy says she lost her helmet. If you can find it, she will give it to you!");
			tFairy.add("She�s nice like that.");
			instances.changeDisplay(tFairy);
		} else if (instances.currentRoom.getTitle() == "Fairy Forest"
				&& s.contains("look pond")) {
			ArrayList<String> lpond = new ArrayList<String>();
			lpond.add("the pond seems wet.");
			instances.changeDisplay(lpond);
		}

		/*
		 * commands for The Secret Cave
		 */
		else if (instances.currentRoom.getTitle() == "Secret Cave"
				&& s.contains("get helmet")) {
			ArrayList<String> gsHelm = new ArrayList<String>();
			gsHelm.add(
					"You got the helmet of +2 beating. Your defense goes up by 1, but your attack ");
			gsHelm.add("goes up by 2!");
			instances.changeDisplay(gsHelm);
			instances.getPlayer()
					.setArmor(1 + instances.getPlayer().getArmor());
			instances.getPlayer()
					.setAttack(2 + instances.getPlayer().getAttack());
		}

		/*
		 * commands for Mermaid Lake 
		 */
		else if (instances.currentRoom.getTitle() == "Mermaids Lake"
				&& s.contains("island") && instances.currentRoom.getCreature().getHealth()>0){
			ArrayList<String> mIsle = new ArrayList<String>();
			mIsle.add("you try to swim to the island, but before you can a giant monster comes out of the");
			mIsle.add("water.");
			instances.setfight(true);
			instances.changeDisplay(mIsle);
		}
		else if (instances.currentRoom.getTitle() == "Mermaids Lake"
				&& s.contains("island") && instances.currentRoom.getCreature().getHealth()<=0){
			ArrayList<String> mIsle2 = new ArrayList<String>();
			mIsle2.add("With the monster dead, you swim to the island and find the armor of seashells! Your");
			mIsle2.add("armor and health go up by 2.");
			instances.changeDisplay(mIsle2);
			instances.getPlayer().setMaxHealth(2 + instances.getPlayer().getMaxHealth());
			instances.getPlayer().setHealth(2 + instances.getPlayer().getHealth());
			instances.getPlayer().setArmor(2 + instances.getPlayer().getArmor());
		}
		/*
		 * commands for Ghost House
		 */
		else if (instances.currentRoom.getTitle() == "Ghost House"
				&& s.contains("look armor")) {
			ArrayList<String> lArm = new ArrayList<String>();
			lArm.add(
					"As you look at the armor, something crawls out of it. It�s a ghost! The specter");
			lArm.add("hisses at you and attacks!");

			instances.setfight(true);
			instances.getPlayer()
					.setHealth(instances.getPlayer().getHealth() - 5);
			instances.changeDisplay(lArm);
		} else if (instances.currentRoom.getTitle() == "Ghost House"
				&& s.contains("look")
				&& instances.getCurrentRoom().getCreature().getHealth() < 0) {
			ArrayList<String> l2Arm = new ArrayList<String>();
			l2Arm.add(
					"The ghost dies� somehow. You now have the armor of Sir. Spookington! Your armor goes ");
			l2Arm.add(
					"up by 5, but your health goes down by 2. You see the door to the north swing open.");

			instances.getPlayer()
					.setArmor(5 + instances.getPlayer().getArmor());
			instances.getPlayer()
					.setHealth(instances.getPlayer().getHealth() - 2);// should
																		// this
																		// be
																		// max
																		// health?
			instances.changeDisplay(l2Arm);
		}
		/*
		 * commands for meadow
		 */
		else if (instances.currentRoom.getTitle() == "Meadow of Frollicking"
				&& s.contains("get armor")) {
			ArrayList<String> gmArm = new ArrayList<String>();

			instances.getPlayer()
					.setArmor(3 + instances.getPlayer().getArmor());

			instances.changeDisplay(gmArm);
		}
		/*
		 * commands for dragons lair
		 */
		else if (instances.currentRoom.getTitle() == "The Dragon's Cave"
				&& s.contains("attack dragon")) {
			ArrayList<String> aDrag = new ArrayList<String>();
			aDrag.add("The dragon wakes up! Prepare yourself!");

			instances.setfight(true);

			instances.changeDisplay(aDrag);
		} else if (instances.currentRoom.getTitle() == "The Dragon's Cave"
				&& s.contains("look")
				&& instances.currentRoom.getCreature().getHealth() <= 0) {
			ArrayList<String> lDrag = new ArrayList<String>();
			lDrag.add(
					"The dragon dies, leaving the sword. The sword is the sword of dragon slaying. You");
			lDrag.add("get +5 to attack and +2 to health.");
			instances.changeDisplay(lDrag);

			instances.getPlayer()
					.setAttack(5 + instances.getPlayer().getAttack());
			instances.getPlayer()
					.setHealth(instances.getPlayer().getHealth() + 2);
			instances.getPlayer()
					.setMaxHealth(instances.getPlayer().getMaxHealth() + 2);
		}
		/*
		 * commands for Lich room
		 */
		else if (instances.currentRoom.getTitle() == "The lair of the Lich"
				&& s.contains("look")
				&& instances.currentRoom.getCreature().getHealth() <= 0) {
			ArrayList<String> lLich = new ArrayList<String>();
			lLich.add(
					"The skeleton falls. In his chest, you find the hammer of bone crushing. +3 to attack ");
			lLich.add("and +3 to health.");
			instances.changeDisplay(lLich);

			instances.getPlayer()
					.setAttack(3 + instances.getPlayer().getAttack());
			instances.getPlayer()
					.setHealth(instances.getPlayer().getHealth() + 3);
			instances.getPlayer()
					.setMaxHealth(instances.getPlayer().getMaxHealth() + 3);
		} else if (instances.currentRoom.getTitle() == "The lair of the Lich"
				&& s.contains("open")) {
			ArrayList<String> cLich = new ArrayList<String>();
			cLich.add(
					"The skeleton jumps up, his bones rattling. He announces that he will be attacking ");
			cLich.add("now.");

			instances.setfight(true);

			instances.changeDisplay(cLich);
		}
		/*
		 * commands for Farm
		 */
		else if (instances.currentRoom
				.getTitle() == "The farm of eternal despair"
				&& (s.contains("no") || s.contains("refuse"))) {
			ArrayList<String> noF = new ArrayList<String>();
			noF.add("The man is enraged! He raises his arms and a swarm of chickens descends. They band");
			noF.add("together to form what looks to be a giant chicken man! In his hand he holds a ");
			noF.add("pitchfork.");
			instances.changeDisplay(noF);

			instances.setfight(true);

			creature chickMan = new creature("Chicken Man", 10, 10, 10, 10);
			instances.currentRoom.setCreature(chickMan);
		}

		else if (instances.currentRoom
				.getTitle() == "The farm of eternal despair"
				&& (s.contains("yes") || s.contains("accept"))) {
			ArrayList<String> yesF = new ArrayList<String>();
			yesF.add(
					"The old man treats you to dinner. You feel energized by his meal. +1 to attack and ");
			yesF.add("+1 to health!");
			instances.changeDisplay(yesF);

			instances.getPlayer()
					.setAttack(instances.getPlayer().getAttack() + 1);
			instances.getPlayer()
					.setHealth(instances.getPlayer().getHealth() + 1);
			instances.getPlayer()
					.setMaxHealth(instances.getPlayer().getMaxHealth() + 1);
		}

		else if (instances.currentRoom
				.getTitle() == "The farm of eternal despair"
				&& (s.contains("look") && instances.currentRoom.getCreature()
						.getHealth() <= 0)) {
			ArrayList<String> chickDie = new ArrayList<String>();
			chickDie.add(
					"the chicken swarm disperses and the old man runs into his house, locking his door. ");
			chickDie.add(
					"You now have the pitchfork of chicken anger! +7 to attack!");

			instances.getPlayer()
					.setAttack(7 + instances.getPlayer().getAttack());
			instances.changeDisplay(chickDie);
		}

		else if (instances.currentRoom.getTitle() == "Dr. Big Bad's Lair"
				&& instances.currentRoom.getCreature().getHealth() <= 0) {
			ArrayList<String> end = new ArrayList<String>();
			end.add("Dr. Big Bad falls before you. You hear birds start to sing and the sky turns a ");
			end.add("beautiful blue. A tear comes to your eye as you realize that your journey is now ");
			end.add("over. Thanks for playing!");
			instances.changeDisplay(end);
		}

		else if (instances.getfight() == true && s.contains("attack")) {
			instances.getPlayer()
					.attack(instances.getCurrentRoom().getCreature());
			if (instances.getCurrentRoom().getCreature().getHealth() > 0) {
				instances.getCurrentRoom().getCreature()
						.attack(instances.getPlayer());
			}
		}

		else {
			ArrayList<String> error = new ArrayList<String>();
			error.add("I'm sorry. That's not a valid input.");
			instances.changeDisplay(error);
		}

	}
}