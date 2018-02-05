
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel(
				"<html>Which is not a real animal? <br> A: Flubber Monkey <br> B: Pink Fairy Armadillo <br> C: Dumbo Octopus</html>");
		question2 = new JLabel(
				"<html>Which is not a real animal? <br> A:  Monkey <br> B:Fairy Armadillo <br> C: Dead Octopus</html>");
		question3 = new JLabel("<html>Which is not a real ? <br> A: life <br> B:ourselves <br> C: dreams</html>");
		question4 = new JLabel("<html>Which is real ? <br> A: life <br> B. myths <br> C: dreams</html>");
		question5 = new JLabel("<html>Which is near ? <br> A: la jolla <br> B. disenyland <br> C: paris</html>");
		// 11. Make another question called "question2"

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
		System.out.println(keyCode);

		// 2. Make 3 variables that hold the key codes for apple, banana and
		// carrot
		int A = 65;
		int B = 66;
		int C = 67;

		if (question1.isShowing()) {
			System.out.println("Q1");
			// 3. If they touched the right fruit, do steps 4 and 7
			if (keyCode == A) {
				correct();
				

			} else {
				incorrect();

			}
nextQuestion(question2);
return;
		} // 4. Call the correct() method

		if (question2.isShowing()) {
			System.out.println("Q2");
			// 3. If they touched the right fruit, do steps 4 and 7
			if (keyCode == C) {
				correct();
				
			} else {
				incorrect();

			}
nextQuestion(question3);
return;
		}

		if (question3.isShowing()) {
			// 3. If they touched the right fruit, do steps 4 and 7
			System.out.println("Q3");
			if (keyCode == C) {
				correct();
				
			} else {
				incorrect();

			}
nextQuestion(question4);
return;
		}
	

	
	if (question4.isShowing()) {
		// 3. If they touched the right fruit, do steps 4 and 7
		System.out.println("Q4");
		if (keyCode == A) {
			correct();
			
		} else {
			incorrect();

		}
nextQuestion(question5);
return;
	}


	
	
	
	
	if (question5.isShowing()) {
		// 3. If they touched the right fruit, do steps 4 and 7
		System.out.println("Q5");
		if (keyCode == A) {
			correct();
			
		} else {
			incorrect();

		}
	}

}


	
	// 7. Use the nextQuestion() method to go to question2

	// 8. else (if they touched something else)

	// 9. Call the incorrect() method

	// 12. If question2 is showing,

	// 13. check if it is right or wrong like you did for question1

	private void correct() {
		playSound("correct.wav");

		// 5. Find a sound for when they get a question right, and drag it into
		// the default package. It must be a .wav file.
		// There are lots on freesound.org
		// 6. Use the playSound method to play your sound

	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package.
		// Use the playSound method to play it.

		playSound("wrong.wav");

	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}
