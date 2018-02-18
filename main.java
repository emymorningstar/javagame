

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		layout l= new layout();
		
		
		
		
		room village = new room();
		room current = village;
		
		while (true) {
			l.render();
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		l.clearGui(null);
		}
	}
}