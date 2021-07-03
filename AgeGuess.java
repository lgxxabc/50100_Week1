package Week1;

import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
//		Declares two variables
		String name;
		int ageGuess;
		
//		Creates a new Scanner object
		Scanner scan = new Scanner(System.in);
		
//		Prompt the user for each value.
		System.out.print("Please enter your name: ");
		name = scan.nextLine();
		System.out.println("Your name is: " + name);

		System.out.println();
		
//		Prompt the user for each value.
		System.out.print("Please enter your age: ");
		ageGuess = scan.nextInt();
		System.out.println("Your age is: " + ageGuess);
	}

}
