import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageChecker {
	public static void checkImage() {
		{
			if (instances.getCurrentRoom().getTitle() == "The Dragon's Cave") {
				try {
					instances.setCurrentImage(
							ImageIO.read(new File("res/dragonroom.png")));
				} catch (IOException e) {
				}
			} else if (instances.getCurrentRoom().getTitle() == "Fairy Forest") {
				try {
					instances.setCurrentImage(
							ImageIO.read(new File("res/fairyroom.png")));
				} catch (IOException e) {
				}}
			else if (instances.getCurrentRoom().getTitle() == "Secret Cave") {
				try {
					instances.setCurrentImage(
							ImageIO.read(new File("res/secretcaveroom.png")));
				} catch (IOException e) {
				}
			}
			else if (instances.getCurrentRoom().getTitle() == "Work") {
				try {
					instances.setCurrentImage(
							ImageIO.read(new File("res/workroom.png")));
				} catch (IOException e) {
				}
			} else {
				try {
					instances.setCurrentImage(
							ImageIO.read(new File("res/villageroom.png")));
				} catch (IOException e) {
				}
			}
		}
	}
}
