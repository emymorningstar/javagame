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
			}
			try {
				instances.setCurrentImage(
						ImageIO.read(new File("res/villageroom.png")));
			} catch (IOException e) {
			}
		}
	}
}
