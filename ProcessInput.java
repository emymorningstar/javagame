import java.util.ArrayList;

public class ProcessInput {
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
		if (Instances.getGame()) {
			if (s.contains("north") && Instances.currentRoom
					.getTitle() != "Dr. Big Bad's Lair") {
				if (Instances.currentRoom.getTitle() != "Mermaids Lake"
						|| (Instances.currentRoom.getTitle() == "Mermaids Lake"
								&& Instances.currentRoom.getCreature()
										.getHealth() <= 0)) {
					if (Instances.currentRoom.getTitle() != "Work"
							|| (Instances.currentRoom.getTitle() == "Work"
									&& Instances.currentRoom.getCreature()
											.getHealth() <= 0)) {
						if (Instances.currentRoom.getTitle() != "Ghost House"
								|| (Instances.currentRoom
										.getTitle() == "Ghost House"
										&& Instances.currentRoom.getCreature()
												.getHealth() <= 0)) {
							Door d = Instances.getCurrentRoom().getDoors();
							Instances.setCurrentRoom(d.getLeadsTo());
						}
					}
				}
			}

			/*
			 * commands for Work room
			 */
			
			/*
			 * Checks work command
			 */
			else if (Instances.currentRoom.getTitle() == "Work"
					&& (s.contains("work") || s.contains("cubicle"))) {
				ArrayList<String> working = new ArrayList<String>();
				working.add(
						"You start to work. The day goes on, and you can feel the boredom kick in.");
				working.add("You gain 5 work dollars.");

				Instances.changeDisplay(working);
			} else if (Instances.currentRoom.getTitle() == "Work"
					&& s.contains("office")) {
				ArrayList<String> office = new ArrayList<String>();
				office.add(
						"In the office you can see the manager: a giant troll with a nametage that says Bob.");
				office.add(
						"Bob gives you a stern look and tells you to get back to work.");
				Instances.changeDisplay(office);
			} else if (Instances.currentRoom.getTitle() == "Work"
					&& (s.contains("talk bob") || s.contains("talk to bob"))) {
				ArrayList<String> tBob = new ArrayList<String>();
				tBob.add("Get back to work, work Monkey!");

				Instances.setfight(true);

				Instances.changeDisplay(tBob);
			}

			/*
			 * commands for Fairy Forest
			 */
			else if (Instances.currentRoom.getTitle() == "Fairy Forest"
					&& s.contains("look tree")) {
				ArrayList<String> lTree = new ArrayList<String>();
				lTree.add("In the tree you see a glowing helmet.");
				lTree.add("(get helmet)");
				Instances.changeDisplay(lTree);
			} else if (Instances.currentRoom.getTitle() == "Fairy Forest"
					&& s.contains("get helmet")) {
				ArrayList<String> gfHelm = new ArrayList<String>();
				gfHelm.add(
						"You got the fairy helmet! Your defense goes up by 3!");
				gfHelm.add("(north)");
				Instances.changeDisplay(gfHelm);
				Instances.getPlayer()
						.setArmor(3 + Instances.getPlayer().getArmor());
			} else if (Instances.currentRoom.getTitle() == "Fairy Forest"
					&& s.contains("talk fairy")) {
				ArrayList<String> tFairy = new ArrayList<String>();
				tFairy.add(
						"The fairy says she lost her helmet. If you can find it, she will give it to you!");
				tFairy.add("She’s nice like that.");
				tFairy.add("(room)");
				Instances.changeDisplay(tFairy);
			} else if (Instances.currentRoom.getTitle() == "Fairy Forest"
					&& s.contains("look pond")) {
				ArrayList<String> lpond = new ArrayList<String>();
				lpond.add("the pond seems wet.");
				lpond.add("(room)");
				Instances.changeDisplay(lpond);
			}

			/*
			 * commands for The Secret Cave
			 */
			else if (Instances.currentRoom.getTitle() == "Secret Cave"
					&& s.contains("get helmet")) {
				ArrayList<String> gsHelm = new ArrayList<String>();
				gsHelm.add(
						"You got the helmet of +2 beating. Your defense goes up by 1, but your attack ");
				gsHelm.add("goes up by 2!");
				gsHelm.add("(north)");
				Instances.changeDisplay(gsHelm);
				Instances.getPlayer()
						.setArmor(1 + Instances.getPlayer().getArmor());
				Instances.getPlayer()
						.setAttack(2 + Instances.getPlayer().getAttack());
			}

			/*
			 * commands for Mermaid Lake
			 */
			else if (Instances.currentRoom.getTitle() == "Mermaids Lake"
					&& s.contains("island")
					&& Instances.currentRoom.getCreature().getHealth() > 0) {
				ArrayList<String> mIsle = new ArrayList<String>();
				mIsle.add(
						"you try to swim to the island, but before you can a giant monster comes out of the");
				mIsle.add("water.");
				mIsle.add("(attack)");
				Instances.setfight(true);
				Instances.changeDisplay(mIsle);
			} else if (Instances.currentRoom.getTitle() == "Mermaids Lake"
					&& s.contains("island")
					&& Instances.currentRoom.getCreature().getHealth() <= 0) {
				ArrayList<String> mIsle2 = new ArrayList<String>();
				mIsle2.add(
						"With the monster dead, you swim to the island and find the armor of seashells! Your");
				mIsle2.add("armor and health go up by 2.");
				mIsle2.add("(north)");
				Instances.changeDisplay(mIsle2);
				Instances.getPlayer()
						.setMaxHealth(2 + Instances.getPlayer().getMaxHealth());
				Instances.getPlayer()
						.setHealth(2 + Instances.getPlayer().getHealth());
				Instances.getPlayer()
						.setArmor(2 + Instances.getPlayer().getArmor());
			}
			/*
			 * commands for Ghost House
			 */
			else if (Instances.currentRoom.getTitle() == "Ghost House"
					&& s.contains("look") && Instances.getCurrentRoom()
							.getCreature().getHealth() > 0) {
				ArrayList<String> lArm = new ArrayList<String>();
				lArm.add(
						"As you look at the armor, something crawls out of it. It’s a ghost! The specter");
				lArm.add("hisses at you and attacks!");
				lArm.add("(attack)");
				Instances.setfight(true);
				Instances.getPlayer()
						.setHealth(Instances.getPlayer().getHealth() - 5);
				Instances.changeDisplay(lArm);
			} else if (Instances.currentRoom.getTitle() == "Ghost House"
					&& s.contains("look") && Instances.getCurrentRoom()
							.getCreature().getHealth() <= 0) {
				ArrayList<String> l2Arm = new ArrayList<String>();
				l2Arm.add(
						"The ghost dies… somehow. You now have the armor of Sir. Spookington! Your armor goes ");
				l2Arm.add(
						"up by 5, but your health goes down by 2. You see the door to the north swing open.");
				l2Arm.add("(north)");
				Instances.changeDisplay(l2Arm);
				Instances.getPlayer()
						.setArmor(5 + Instances.getPlayer().getArmor());
				Instances.getPlayer()
						.setHealth(Instances.getPlayer().getHealth() - 2);// should
																			// this
																			// be
																			// max
																			// health?

			}
			/*
			 * commands for meadow
			 */
			else if (Instances.currentRoom.getTitle() == "Meadow of Frollicking"
					&& s.contains("get armor")) {
				ArrayList<String> gmArm = new ArrayList<String>();
				gmArm.add(
						"This is the armor of the noble knight. Your armor goes up by 3.");
				gmArm.add("(north)");
				Instances.getPlayer()
						.setArmor(3 + Instances.getPlayer().getArmor());

				Instances.changeDisplay(gmArm);
			}
			/*
			 * commands for dragons lair
			 */
			else if (Instances.currentRoom.getTitle() == "The Dragon's Cave"
					&& s.contains("look")
					&& Instances.currentRoom.getCreature().getHealth() > 0) {
				ArrayList<String> aDrag = new ArrayList<String>();
				aDrag.add("The dragon wakes up! Prepare yourself!");
				aDrag.add("(attack)");
				Instances.setfight(true);

				Instances.changeDisplay(aDrag);
			} else if (Instances.currentRoom.getTitle() == "The Dragon's Cave"
					&& s.contains("look")
					&& Instances.currentRoom.getCreature().getHealth() <= 0) {
				ArrayList<String> lDrag = new ArrayList<String>();
				lDrag.add(
						"The dragon dies, leaving the sword. The sword is the sword of dragon slaying. You");
				lDrag.add("get +5 to attack and +2 to health.");
				lDrag.add("(north)");
				Instances.changeDisplay(lDrag);

				Instances.getPlayer()
						.setAttack(5 + Instances.getPlayer().getAttack());
				Instances.getPlayer()
						.setHealth(Instances.getPlayer().getHealth() + 2);
				Instances.getPlayer()
						.setMaxHealth(Instances.getPlayer().getMaxHealth() + 2);
			}
			/*
			 * commands for Lich room
			 */
			else if (Instances.currentRoom.getTitle() == "The lair of the Lich"
					&& s.contains("look")
					&& Instances.currentRoom.getCreature().getHealth() <= 0) {
				ArrayList<String> lLich = new ArrayList<String>();
				lLich.add(
						"The skeleton falls. In his chest, you find the hammer of bone crushing. +3 to attack ");
				lLich.add("and +3 to health.");
				lLich.add("(north)");
				Instances.changeDisplay(lLich);

				Instances.getPlayer()
						.setAttack(3 + Instances.getPlayer().getAttack());
				Instances.getPlayer()
						.setHealth(Instances.getPlayer().getHealth() + 3);
				Instances.getPlayer()
						.setMaxHealth(Instances.getPlayer().getMaxHealth() + 3);
			} else if (Instances.currentRoom
					.getTitle() == "The lair of the Lich"
					&& s.contains("open")) {
				ArrayList<String> cLich = new ArrayList<String>();
				cLich.add(
						"The skeleton jumps up, his bones rattling. He announces that he will be attacking ");
				cLich.add("now.");
				cLich.add("(attack)");
				Instances.setfight(true);

				Instances.changeDisplay(cLich);
			}
			/*
			 * commands for Farm
			 */
			else if (Instances.currentRoom
					.getTitle() == "The farm of eternal despair"
					&& (s.contains("no") || s.contains("refuse"))) {
				ArrayList<String> noF = new ArrayList<String>();
				noF.add("The man is enraged! He raises his arms and a swarm of chickens descends. They band");
				noF.add("together to form what looks to be a giant chicken man! In his hand he holds a ");
				noF.add("pitchfork.");
				Instances.changeDisplay(noF);

				Instances.setfight(true);

				Creature chickMan = new Creature("Chicken Man", 10, 10, 10, 10);
				Instances.currentRoom.setCreature(chickMan);
			}

			else if (Instances.currentRoom
					.getTitle() == "The farm of eternal despair"
					&& (s.contains("yes") || s.contains("accept"))) {
				ArrayList<String> yesF = new ArrayList<String>();
				yesF.add(
						"The old man treats you to dinner. You feel energized by his meal. +1 to attack and ");
				yesF.add("+1 to health!");
				Instances.changeDisplay(yesF);

				Instances.getPlayer()
						.setAttack(Instances.getPlayer().getAttack() + 1);
				Instances.getPlayer()
						.setHealth(Instances.getPlayer().getHealth() + 1);
				Instances.getPlayer()
						.setMaxHealth(Instances.getPlayer().getMaxHealth() + 1);
			}

			else if (Instances.currentRoom
					.getTitle() == "The farm of eternal despair"
					&& (s.contains("look") && Instances.currentRoom
							.getCreature().getHealth() <= 0)) {
				ArrayList<String> chickDie = new ArrayList<String>();
				chickDie.add(
						"the chicken swarm disperses and the old man runs into his house, locking his door. ");
				chickDie.add(
						"You now have the pitchfork of chicken anger! +7 to attack!");

				Instances.getPlayer()
						.setAttack(7 + Instances.getPlayer().getAttack());
				Instances.changeDisplay(chickDie);
			}

			else if (Instances.currentRoom.getTitle() == "Dr. Big Bad's Lair"
					&& Instances.currentRoom.getCreature().getHealth() <= 0) {
				ArrayList<String> end = new ArrayList<String>();
				end.add("Dr. Big Bad falls before you. You hear birds start to sing and the sky turns a ");
				end.add("beautiful blue. A tear comes to your eye as you realize that your journey is now ");
				end.add("over. Thanks for playing!");
				Instances.changeDisplay(end);
			}

			else if (Instances.currentRoom.getTitle() == "Dr. Big Bad's Lair"
					&& s.contains("attack") && Instances.getfight() == false) {
				Instances.setfight(true);
			}

			else if (Instances.getfight() == true && s.contains("attack")) {
				Instances.getPlayer()
						.attack(Instances.getCurrentRoom().getCreature());
				if (Instances.getCurrentRoom().getCreature().getHealth() > 0) {
					Instances.getCurrentRoom().getCreature()
							.attack(Instances.getPlayer());
				}
			} else if (s.contains("room")) {
				Instances.changeDisplay(Instances.currentRoom.getDescription());
			}

			else if (s.contains("stats")) {
				ArrayList<String> health = new ArrayList<String>();
				health.add(
						"Player Health:" + Instances.getPlayer().getHealth());
				health.add(
						"Player Attack:" + Instances.getPlayer().getAttack());
				health.add("Player Armor:" + Instances.getPlayer().getArmor());

				Instances.changeDisplay(health);
			}

			else if (s.contains("help")) {
				ArrayList<String> help = new ArrayList<String>();
				help.add(
						"Adventure path is a game about collecting items in a fantasy world in order to ");
				help.add(
						"beat the bad guy at the end. Each room has different things to interact  with ");
				help.add(
						"that will change the environment or your stats. The commands will appear in ");
				help.add("perentheses at the bottom.");
				help.add("");
				help.add(
						"Type stats to display your stats, and room to show the room description.");

				Instances.changeDisplay(help);
			}

			else {
				ArrayList<String> error = new ArrayList<String>();
				error.add("I'm sorry. That's not a valid input.");
				Instances.changeDisplay(error);
			}

		} else {
			ArrayList<String> over = new ArrayList<String>();
			over.add("Your health has reached zero. Game over.");
			Instances.changeDisplay(over);
		}

	}
}
