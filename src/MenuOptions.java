import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

import gameModes.EasyMode;
import gameModes.MediumMode;
import gameModes.HardMode;

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
