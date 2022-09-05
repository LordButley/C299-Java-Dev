package demo;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean keepPlaying = true;
		do {
			int rounds = chooseRounds();
			play(rounds);
			System.out.println("Would you like to play again? Enter 1 for Yes, 2 for No");
			if(inputChoice(1,2) == 2) {
				keepPlaying = false;
				System.out.println("Thanks for playing!");
			}
		}while(keepPlaying);
	}
	
	public static int chooseRounds() {
		
		System.out.println("How many rounds would you like to play? Answers between 1 - 10");
		return inputChoice(1, 10);
	}
	
	public static void play(int rounds) {
		
		int wins = 0;
		int losses = 0;
		int draws = 0;
		for (int i = 0; i < rounds; i ++) {
			System.out.println("Choose 1 for Rock, 2 for Paper, 3 for Scissors");
			int choice = inputChoice(1, 3);			
			Random rng = new Random();
			int computerChoice = rng.nextInt(3) + 1;
		
			switch (computerChoice) {
			case 1:
				System.out.println("Computer has selected Rock");
				switch(choice) {
				case 1: 
					System.out.println("Draw!");
					draws ++;
					break;
				case 2:
					System.out.println("You win!");
					wins ++;
					break;
				case 3:
					System.out.println("Computer wins!");
					losses ++;
					break;
				}
				break;
				
			case 2:
				System.out.println("Computer has selected Paper");
				switch(choice) {
				case 1: 
					System.out.println("Computer wins!");
					losses ++;
					break;
				case 2:
					System.out.println("Draw!");
					draws ++;
					break;
				case 3:
					System.out.println("You win!");
					wins ++;
					break;
				}
				break;
				
			case 3:
				System.out.println("Computer has selected Scissors");
				switch(choice) {
				case 1: 
					System.out.println("You win!");
					wins ++;
					break;
				case 2:
					System.out.println("Computer wins!");
					losses ++;
					break;
				case 3:
					System.out.println("Draw!");
					draws ++;
					break;
				}
				break;
			
		}				
		}
		showScore(wins, losses, draws);
		wins = 0;
		losses = 0;
		draws = 0;
	}
	
	
	public static void showScore (int wins, int losses, int draws) {
		System.out.println("You won "+wins+ " games, lost "+losses+" games and drew "+draws+" games");
		if (wins > losses) {
			System.out.println("Congratulations, You Won!");
		} else if (wins < losses) {
			System.out.println("Sorry, you lost!");
		} else {
			System.out.println("You drew");
		
		}
	}
	
	public static int inputChoice (int minNum, int maxNum) {
		
		boolean isValid = false;
		int inputChoice = 0;
		do {
			try {
				Scanner roundScanner = new Scanner(System.in);
				inputChoice = Integer.parseInt(roundScanner.nextLine());
				
				if (inputChoice >= minNum && inputChoice <= maxNum) {
					isValid = true;
//					roundScanner.close();
				} else {
					System.out.println("Please enter a number between "+minNum+" and "+maxNum);
				}
			} catch (NumberFormatException e) {
				System.out.println("You didn't enter a number. Please enter a number between "+minNum+" and "+maxNum);
			}		
		} while(!isValid);
		return inputChoice;
	}
	
}
