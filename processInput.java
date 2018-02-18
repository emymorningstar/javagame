

public class processInput {
	
	static void doInput(String s) {
		s.toLowerCase();
		if(s.contains("north")) {
			Door d = instances.getCurrentRoom().getDoors();
			instances.setCurrentRoom(d.getLeadsTo());
		}
	}

}
