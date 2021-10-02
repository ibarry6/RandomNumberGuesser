import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*class: CMSC203
		 * Instructor: Prof. Ahmed
		 * Due:9/27/2021
		 * Description: Writting a code that will receive a guess and report if your guess
		 * is the random number that was generated.
		 * Platform/ compiler:
		 * I pledge that I have completed the programming assignment indepently.
		 * I have not copied the code from a student or any source.
		 * I have not given my code to any student.
		 * Iburahima Barry
		 */
		// Declare the variable
	RNG guinea= new RNG();
	Scanner scan =new Scanner (System.in);
	int randInt= guinea.rand();
	int count=0;
	int nextGuess, lowGuess=0, highGuess=100;
	String again;
	
	// Start the with the do while 
	do {
		System.out.println("Enter your fist guess ");
		nextGuess= scan.nextInt();
		System.out.println("Number of guesses is "+(count+1));
		
		// Use if statement to pose another statemnt
		
		if ( nextGuess != randInt) {
			
			if (nextGuess<randInt) {
				lowGuess=nextGuess;
				System.out.println("Your guess is too low");
			}
		
		else {
			highGuess=nextGuess;
		System.out.println("Your guess is to high");
		}
			// call the function in the RNG file
		guinea.inputValidation(nextGuess, lowGuess, highGuess);
		
		// Use for to print how many time i want it to be asking question
		
		for ( count=1; count<4; count++) {
			
			nextGuess=scan.nextInt();
			System.out.println("Number of guesses is "+ (count+1));
			
			if (nextGuess != randInt) {
				
				if ( nextGuess<randInt) {
					lowGuess= nextGuess;
					System.out.println("Your guess is too high");
				}
				else {
					highGuess= nextGuess;
					System.out.println("Your guess is too high");
				}
				guinea.inputValidation(nextGuess, lowGuess, highGuess);
			}
			else {
				System.out.println("Congratulations, your guessed is right");
				count=5;
			}
		}
	}
	
	else {
		System.out.println("Congratulation, your guessed is right");
	}
	System.out.println("Do you want to try again again");
	again=scan.nextLine();
	again=scan.nextLine();
	}while (again.equals("y"));
	System.out.println("Thank you for playing");
}
}
		
			
	