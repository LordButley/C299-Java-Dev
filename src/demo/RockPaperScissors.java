package demo;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = chooseRounds();
		System.out.println(x);
	}
	
	public static int chooseRounds() {
		
		
		boolean isValid = false;
		int rounds = 0;
		
		System.out.println("How many rounds would you like to play? Answers between 1 - 10");
		do {
			try {
				Scanner roundScanner = new Scanner(System.in);
				rounds = Integer.parseInt(roundScanner.nextLine());
				
				if (rounds >= 1 && rounds <= 10) {
					isValid = true;
				} else {
					System.out.println("Please enter a number between 1 and 10");
				}
			} catch (NumberFormatException e) {
				System.out.println("You didn't enter a number. Please enter a number between 1 and 10");
			}		
		} while(!isValid);
		return rounds;
	}
}
