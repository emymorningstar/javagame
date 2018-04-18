package adventurePath;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * image checking class. sets image based on room.
 */
public class ImageChecker {
	/**
	 * check image.
	 */
	public static void checkImage() {
		if (Instances.getCurrentRoom().getTitle() == "The Dragon's Cave") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/dragonroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom().getTitle() == "Fairy Forest") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/fairyroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom().getTitle() == "Secret Cave") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/secretcaveroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom().getTitle() == "Work") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/workroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom().getTitle() == "Mermaids Lake") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/mermaidlakeroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom().getTitle() == "Ghost House") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/ghostroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom()
				.getTitle() == "Meadow of Frollicking") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/meadowroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom()
				.getTitle() == "Dr. Big Bad's Lair") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/badroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom()
				.getTitle() == "The lair of the Lich") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/lichroom.png")));
			} catch (IOException e) {
			}
		} else if (Instances.getCurrentRoom()
				.getTitle() == "The farm of eternal despair") {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/farmroom.png")));
			} catch (IOException e) {
			}
		} else {
			try {
				Instances.setCurrentImage(
						ImageIO.read(new File("res/villageroom.png")));
			} catch (IOException e) {
			}
		}
	}
}
