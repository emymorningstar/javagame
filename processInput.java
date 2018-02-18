import java.util.Vector;

public class processInput {
	
	static void doInput(String s) {
		s.toLowerCase();
		if(s.contains("door")) {
			Door d = instances.getCurrentRoom().getDoors();
			instances.setCurrentRoom(d.getLeadsTo());
		}
	}

}
