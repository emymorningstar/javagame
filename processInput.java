import java.util.ArrayList;

public class processInput {

	static void doInput(String s) {
		
		s.toLowerCase();

		if (s.contains("north") && instances.currentRoom.getTitle() != "Dr. Big Bad's Lair") {
			if (instances.currentRoom.getTitle() != "Mermaids Lake" || (instances.currentRoom.getTitle() == "Mermaids Lake" && instances.currentRoom.getCreature().getHealth() <= 0)) {
				if (instances.currentRoom.getTitle() != "Work" || (instances.currentRoom.getTitle() == "Work" && instances.currentRoom.getCreature().getHealth() <= 0)) {
					if (instances.currentRoom.getTitle() != "Ghost House" || (instances.currentRoom.getTitle() == "GhostHouse" && instances.currentRoom.getCreature().getHealth() <= 0)) {
						Door d = instances.getCurrentRoom().getDoors();
						instances.setCurrentRoom(d.getLeadsTo());
					}
				}
			}

		}
		
		/*
		 * commands for Work room
		 */
		if (instances.currentRoom.getTitle() == "Work" && (s.contains("work") || s.contains("cubicle"))){
			ArrayList<String> working = new ArrayList<String>();
			working.add("You start to work. The day goes on, and you can feel the boredom kick in.");
			working.add("You gain 5 work dollars.");
			
			instances.changeDisplay(working);
		}
		if (instances.currentRoom.getTitle() == "Work" && s.contains("office")){
			ArrayList<String> office = new ArrayList<String>();
			office.add("In the office you can see the manager: a giant troll with a nametage that says Bob.");
			instances.changeDisplay(office);
		}
		
		/*
		 * commands for Fairy Forest
		 */
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("tree")){
			ArrayList<String> lTree = new ArrayList<String>();
			lTree.add("In the tree you see a glowing helmet.");
			instances.changeDisplay(lTree);
		}
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("helmet")){
			ArrayList<String> gfHelm = new ArrayList<String>();
			gfHelm.add("You got the fairy helmet! Your defense goes up by 3!");
			instances.changeDisplay(gfHelm);
			instances.getPlayer().setArmor(3);
		}
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("talk fairy")){
			ArrayList<String> tFairy = new ArrayList<String>();
			tFairy.add("The fairy says she lost her helmet. If you can find it, she will give it to you!");
			tFairy.add("She�s nice like that.");
			instances.changeDisplay(tFairy);
		}
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("look pond")){
			ArrayList<String> lpond = new ArrayList<String>();
			lpond.add("The fairy says she lost her helmet. If you can find it, she will give it to you! She�s nice like that.");
			instances.changeDisplay(lpond);
		}
		
		/*
		 * commands for The Secret Cave
		 */
		if (instances.currentRoom.getTitle() == "Secret Cave" && s.contains("look pond")){
			ArrayList<String> lcPond = new ArrayList<String>();
			lcPond.add("The pond is a deep blue. In the water you see a glowing helmet.");
			instances.changeDisplay(lcPond);
		}
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("get helmet")){
			ArrayList<String> gfHelm = new ArrayList<String>();
			gfHelm.add("You got the fairy helmet! Your defense goes up by 3!");
			instances.changeDisplay(gfHelm);
			instances.getPlayer().setArmor(3);
		}
		
		/*
		 * commands 
		 */
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("get helmet")){
			ArrayList<String> gfHelm = new ArrayList<String>();
			gfHelm.add("You got the fairy helmet! Your defense goes up by 3!");
			instances.changeDisplay(gfHelm);
			instances.getPlayer().setArmor(3);
		}
		if (instances.currentRoom.getTitle() == "Fairy Forest" && s.contains("get helmet")){
			ArrayList<String> gfHelm = new ArrayList<String>();
			gfHelm.add("You got the fairy helmet! Your defense goes up by 3!");
			instances.changeDisplay(gfHelm);
			instances.getPlayer().setArmor(3);
		}
	}	
}