//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	static int happy = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String pet= JOptionPane.showInputDialog("what kind of pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 4; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet", "Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "walk", "feed" }, null);
			
			System.out.println(task);
			if(task==0){
	          cuddle();
			}
	         if(task==1){
	        	 walk();
	         }
	         if(task==2){
	        	feed();
	         }
	         
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happy >= 10){
JOptionPane.showConfirmDialog(null, "You love your pet");
break;
}
}

	}
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
public static void cuddle(){
 System.out.println("Cat is happy and wants you to leave him alone");
happy +=3;
}	
public static void walk(){
	System.out.println("Cat is tired that you walked it and a bit angry");
happy +=1;
}
	public static void feed(){
System.out.println("Cat got fat and wants more food and is happy");
happy += 5;
}
}