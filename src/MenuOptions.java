import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

import gameModes.EasyMode;
import gameModes.MediumMode;
import gameModes.HardMode;
import gameModes.CustomMode;

public class MenuOptions {
	static boolean temp = true;
	
	public static void easyMenu() {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int actualNum = EasyMode.randomNumber();
		
		while(EasyMode.getWinner() == false) {
			
			System.out.println("Guess a number between 0 - 100");
			int num = input.nextInt();
			
			EasyMode.winner(actualNum, num, counter);
			counter++;
		}	
		input.close();
	}
	
	public static void mediumMenu() {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int actualNum = MediumMode.randomNumber();
		
		while(MediumMode.getWinner() == false) {
			
			System.out.println("Guess a number between 0 - 500");
			int num = input.nextInt();
			
			MediumMode.winner(actualNum, num, counter);
			counter++;
		}	
		input.close();
	}
	
	public static void hardMenu() {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		
		double actualNum = HardMode.randomNumber();
		BigDecimal bd = new BigDecimal(actualNum).setScale(2, RoundingMode.HALF_UP);
		double newInput = bd.doubleValue();
		
		while(HardMode.getWinner() == false) {
			
			System.out.println("Guess a number between 0.0 - 1000.0");
			double num = input.nextDouble();
			
			HardMode.winner(newInput, num, counter);
			counter++;
		}	
		input.close();
	}
	
	public static void customMenu() {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		int counter = 0;
		
		System.out.println("What kind of gamemode do you want: " + '\n' + "int || double");
		String var = input.nextLine();
		
		if(var == "double") {
			System.out.println("Input lower bound, input example: 0.15 or 5.25");
			double lower = input1.nextDouble();
			
			System.out.println("Input upper bound, input example: 100.0 or 250.0");
			double upper = input2.nextDouble();
			
			System.out.println("Input number of guesses");
			int numGuess = input3.nextInt();
		}
		
		else {
			System.out.println("Input lower bound, input example: 0 or 5");
			int lower = input1.nextInt();
			
			System.out.println("Input upper bound, input example: 100 or 500");
			int upper = input2.nextInt();
			
			System.out.println("Input number of guesses");
			int numGuess = input3.nextInt();
			
			System.out.println("Input max/min bound of hints");
			int hint = input5.nextInt();
			
			int actualNum = CustomMode.randomNumberInt(lower, upper);
			
			while(CustomMode.getWinner() == false) {
				System.out.println("Guess a number between " + lower + " & " + upper);
				int num = input4.nextInt();
				
				CustomMode.winnerInt(actualNum, num, counter, numGuess, hint);
				counter++;
			}	
			input.close();
			input1.close();
			input2.close();
			input3.close();
			input4.close();
			input5.close();
		}			
	}
	
	public static void options(String select) {
		switch(select) {
		case "easy":
			easyMenu();
			setQuit(false);
			break;
			
		case "medium":
			mediumMenu();
			setQuit(false);
			break;
			
		case "hard":
			hardMenu();
			setQuit(false);
			break;

		case "custom":
			customMenu();
			setQuit(false);
			break;
			
		case "quit":
			System.out.println("Thanks for playing");
			setQuit(false);
			break;
			
		default:
			System.out.println("Choose a valid option");
		}	
	}
	
	public static void setQuit(boolean quit) {
		temp = quit;
	}
	
	public static boolean getQuit() {
		return temp;
	}
}
