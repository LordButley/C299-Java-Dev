package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		requestName();
		dnaGenerator();
		System.out.println("WOW, that's QUITE the dog");
		
		
	}
	
	public static void requestName() {
		boolean isValid = false;
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		do {
				System.out.println("What is your dog's name?");
				name = myScanner.nextLine();
				if(name.matches("[A-Za-z|\s]*") && !name.trim().isEmpty()) {
					System.out.println("Well then, I have this highly reliable report on "+name+"'s prestigious backround right here");
					System.out.println(name+" is:");
					isValid = true;
				} else {
					System.out.println("Only alphabet characters are accepted for names. Please try again");
				}
		}while(!isValid);
	}
	
	public static void dnaGenerator() {

		ArrayList<String> dogBreeds = new ArrayList<String>(Arrays.asList(
				"English Springer Spaniel",
				"Cocker Spaniel", 
				"Staffordshire Bull Terrier", 
				"Pug", 
				"Corgi", 
				"Collie", 
				"Shiba", 
				"Red Setter", 
				"Yorkshire Terrier", 
				"Golden Retriever", 
				"Bassett Hound"));
		
		Collections.shuffle(dogBreeds);
		
		Random rngPercentage = new Random();
		int counter = 0;
		int total = 100;
		while(counter < 4 && total != 0) {
			int breedPercentage = rngPercentage.nextInt(total)+1;
			total -= breedPercentage;
			System.out.println(breedPercentage + "% " + dogBreeds.get(counter));
			counter ++;
		}
		if(total != 0) {
			System.out.println(total +"% " + dogBreeds.get(counter));
		}
		
	}

}
