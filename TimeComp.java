package Week1;

import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		long inputSecs, hrs, mins, secs;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total time in seconds: ");
		
		inputSecs = scan.nextInt();
		
		if(inputSecs < 0) {
			System.out.print("Invalid input. Please enter a positive integer.");
		} else {
			hrs = inputSecs / 3600;
			secs = inputSecs % 3600;
			mins = secs / 60;
			secs = secs % 60;
			
			System.out.print(inputSecs + " is equivalent to "
			+ hrs + " hours " + mins + " minutes " + secs + " seconds.");
			
		}
	}
}
