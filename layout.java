import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class layout {
//based drawing class on a prevous assignment I did -emy
	
	JFrame frame;
	Canvas canvas;
	public static final int WIDTH = 700;
	public static final int HEIGHT = 500;
	BufferStrategy bufferStrategy;

	public layout() {
		frame = new JFrame("Adventure Path: A Trail of Adventure");
		JButton b = new JButton("submit");
		JTextField t=new JTextField("");
		t.setBounds(480, 415, 100, 40);
		b.setBounds(580, 415, 100, 40);
		frame.add(b);
		frame.add(t);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("click");
			Scanner sc=new Scanner(t.getText());
			if(sc.hasNext()) {
			String cmd=sc.next();
			System.out.println(cmd);
			t.setText("");}
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
		Color c=new Color(66, 241, 120);
		canvas.setBackground(c);
		
	}
	
	void render() {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, WIDTH, HEIGHT);
		render(g);
		g.dispose();
		bufferStrategy.show();
	}
	
	void render(Graphics2D g) {
	renderString("LINK STARTO!");
		
	}
	void renderString(String string) {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, HEIGHT/2-100, WIDTH, 200);
		g.setColor(Color.WHITE);
		g.drawString( string, 20, 175);
		g.dispose();
	}
	void clearGui(String string) {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, WIDTH, HEIGHT);
		g.dispose();
	}
}
