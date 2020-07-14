package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
			String input= JOptionPane.showInputDialog("Which month of the year has 28 days?");
				// 3.  Use an if statement to check if their answer is correct
				if(input.equals("All of them")) { JOptionPane.showMessageDialog(null,"Correct");
				score++;}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				input=JOptionPane.showInputDialog("You see a boat filled with people, yet there isn't a single person on board. How is that possible?");
		if(input.equals("All the people on the boat are married.")) {JOptionPane.showMessageDialog(null,"Correct");
		score++;}
		input=JOptionPane.showInputDialog("a man calls his dog from the opposite side of the river.\n" 
				+ "The dog crosses the river without getting wet, and without using a bridge or boat. How?");
		if(input.equals("The river was frozen")) {JOptionPane.showMessageDialog(null, "Correct");
		score++;}

		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your score is "+score);
	}
}
