package demo;

import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your age?");
		int age = inputAge();
		System.out.println("Your maximum heart rate should be "+ (220 - age) +" beats per minute");
		System.out.println("Your target HR Zone is "+(age*0.5)+" - "+(Math.floor(age*0.85))+" beats per minute");	
	}
	
	public static int inputAge() {
		
		boolean isValid = false;
		int inputChoice = 0;
		do {
			try {
				Scanner roundScanner = new Scanner(System.in);
				inputChoice = Integer.parseInt(roundScanner.nextLine());
				
				if (inputChoice >= 18 && inputChoice <= 100) {
					isValid = true;
				} else {
					System.out.println("Please enter a number between 18 and 100");
				}
			} catch (NumberFormatException e) {
				System.out.println("You didn't enter a whole number. Please enter a number between 18 and 100");
			}		
		} while(!isValid);
		
		
		return inputChoice;
		
	}

}
