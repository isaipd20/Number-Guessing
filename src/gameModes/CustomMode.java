package gameModes;

import java.util.Random;

public class CustomMode {
	private static boolean winner = false;
	
	public static int randomNumberInt(int min, int max) {
		int randNum = (int)(Math.random()*(max - min + 1) + min); 

		return randNum;
	}
	
	public static void winnerInt(int actualNum, int num, int counter,int numGuess, int hint) {
		if(counter != numGuess) {
			if(actualNum == num) {
				System.out.println("You win!!!");
				setWinner(true);
			}
			else {
				System.out.println("Try again");
				System.out.println("Your number is between: " + lowerHint(actualNum, hint) + " & " + upperHint(actualNum, hint) + '\n');
			}
		}
		else {
			System.out.println("You lose, actual number: " + actualNum);
			setWinner(true);
		}
	}
	
	public static int upperHint (int randNum, int hint) {
		int upperHint = randNum + randomNumberHint(randNum, hint);
		
		return upperHint;
	}
	
	public static int lowerHint (int randNum, int hint) {
		int lowerHint = randNum - randomNumberHint(randNum, hint);

		return lowerHint;
	}
	
	public static int randomNumberHint(int actualNum, int hint) {
		Random hintNum = new Random();
		int randNum = hintNum.nextInt(hint);

		return randNum;
	}
	
	public static void setWinner(boolean temp) {
		winner = temp;
	}
	
	public static boolean getWinner() {
		return winner;
	}
}
