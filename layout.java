import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Layout {
	// based drawing class on a prevous assignment I did -emy

	JFrame frame;
	Canvas canvas;
	public static final int WIDTH = 700;
	public static final int HEIGHT = 500;
	BufferStrategy bufferStrategy;
	Instances s = new Instances();
	
	/**
	 * creates jframe and sets up interface.
	 *
	 * @see interface in a new jframe window
	 */
	public Layout() {
		frame = new JFrame("Adventure Path: A Trail of Adventure");
		JButton b = new JButton("submit");
		JTextField t = new JTextField("");
		frame.getRootPane().setDefaultButton(b);
		t.setBounds(480, 415, 100, 40);
		b.setBounds(580, 415, 100, 40);
		frame.add(b);
		frame.add(t);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent arg0) {
				System.out.println("click");
				Scanner sc = new Scanner(t.getText());
				if (sc.hasNext()) {
					String cmd = sc.nextLine();
					ProcessInput.doInput(cmd);
					t.setText("");
				}
			}
		});
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		panel.setLayout(null);
		canvas = new Canvas();
		canvas.setBounds(0, 0, WIDTH, HEIGHT);
		canvas.setIgnoreRepaint(true);
		frame.pack();
		frame.setSize(WIDTH + 6, HEIGHT + 28);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		panel.add(canvas);
		canvas.createBufferStrategy(2);
		bufferStrategy = canvas.getBufferStrategy();
		canvas.requestFocus();
		Color c = new Color(66, 241, 120);
		canvas.setBackground(c);

	}

	/**
	 * clears the previous text calls render text.
	 *
	 * @see cleared
	 */
	void render() {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, WIDTH, HEIGHT);
		render(g);
		g.dispose();
		bufferStrategy.show();
	}

	/**
	 * calls renderString.
	 * 
	 * @param Graphics2D
	 *            g
	 */
	void render(final Graphics2D g) {
		renderString(Instances.getDisplay());

	}

	/**
	 * puts the strings on the screen.
	 * 
	 * @param Arraylist
	 *            string
	 * @see strings
	 */
	void renderString(final ArrayList<String> s) {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, HEIGHT / 2 - 100, WIDTH, 400);
		g.drawImage(Instances.getCurrentImage(), 0, 0, canvas);
		//System.out.println((WIDTH) + " width" + ((HEIGHT / 2 - 100) + " height"));
		//width 700 height 150
		g.setFont(new Font("Monospaced", Font.PLAIN, 14));
		g.setColor(Color.WHITE);
		for (int i = 0; i < s.size(); i++) {
			// System.out.println(s.get(i));
			g.drawString(s.get(i), 20, 200 + i * 20);
		}

	}

	/**
	 * clears the strings from the screen.
	 * 
	 * @param string
	 * @see Gui cleared
	 */
	void clearGui(final String string) {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, WIDTH, HEIGHT);
		g.dispose();
	}
}