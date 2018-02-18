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
				
		Room village = new Room();
		Room current = village;
		l.render();
		while (true) {
			l.renderString(display);
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}