package demo;

import java.util.HashMap;
import java.util.Scanner;

public class CalorieCalculator {

	public static void main(String[] args) {
		
		HashMap<String, Integer> foodCalories = new HashMap<String, Integer>();
	    foodCalories.put("chicken", 300);
	    foodCalories.put("banana", 100);
	    foodCalories.put("egg", 150);
	    
		Scanner myObj = new Scanner(System.in) 
			User testUser = new User();

			System.out.println("Enter name, calorie limit and what you have eaten:");

			testUser.Name = myObj.nextLine();

			testUser.Calories = myObj.nextInt();
			testUser.CaloriesRemaining = testUser.Calories;
			while()
			String food = myObj.nextLine();
			
			boolean foodCheck = foodCalories.containsKey(food);
			
			if (foodCheck) { 
				int calories = foodCalories.get(food);
				testUser.CaloriesRemaining -= calories;
			}
		
	}
}