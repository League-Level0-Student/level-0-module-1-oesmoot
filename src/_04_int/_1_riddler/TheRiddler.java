package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("what tastes better than it smells?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle1.equals("a tounge")) {
			JOptionPane.showMessageDialog(null, "right!");
			score ++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "WRONG!");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

