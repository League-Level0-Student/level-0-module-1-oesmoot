package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String birthday = JOptionPane.showInputDialog(null,"what date is your birthday on? (mm/dd)");
		if (birthday.equals("03/25")) {
			JOptionPane.showMessageDialog(null, "happy birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "have a very merry UNbirthday!");
		}
	}

}