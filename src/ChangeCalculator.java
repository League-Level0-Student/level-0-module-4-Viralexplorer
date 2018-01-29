//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String N=JOptionPane.showInputDialog(null,"How many nickels do you have");
		// Convert their answer to an "int" using Integer.parseInt()
int money=Integer.parseInt(N);
		// Ask the user how many dimes they have, and convert their answer
String D=JOptionPane.showInputDialog("How many Dimes do you have");
int coins=Integer.parseInt(D);		
// Ask the user how many quarters they have, and convert their answer
		String Q=JOptionPane.showInputDialog("How Many Quarters do you have");
		int quarts=Integer.parseInt(Q);

		// Calculate how much money the user has and save it in a double variable
		//0.05 * 5 = 0.25
		double totaln= money*0.05;
		double Totalm= coins*0.10;
		double totalq= quarts*0.25;
		double totalmoney= totaln+Totalm+totalq;
		
// Tell the user how much money they have
JOptionPane.showMessageDialog(null,"you money is " +totalmoney1);
	
	
	
	}

}

