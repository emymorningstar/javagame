import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class layout {
	
	public layout(JFrame frame) {
	frame.setLayout(null);
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 50, 700, 500);
	frame.setVisible(true);
	
}}
