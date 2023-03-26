package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String owen = "gamer";
		String nick = "programmer";
		String mike = "programmer";
		String dibideh = "random human";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog(null,"enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (name.equals ("owen")) {
			JOptionPane.showMessageDialog(null, owen);
		}
		if (name.equals("nick")) {
			JOptionPane.showMessageDialog(null, nick);
		}
		if (name.equals("mike")) {
			JOptionPane.showMessageDialog(null, mike);
		}
		if (name.equals("dibideh")) {
			JOptionPane.showMessageDialog(null, dibideh);
		}
	}
}

