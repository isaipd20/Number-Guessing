package gameModes;

import java.util.Random;

public class MediumMode {
private static boolean winner;
	
	public static int randomNumber() {
		Random rad = new Random();
		int upperbound = 500;
		int randNum = rad.nextInt(upperbound);

		return randNum;
	}
	
	public static void winner(int randNum, int temp, int counter) {
		int actualNum = randNum;
		if(counter != 4) {
			if(actualNum == temp) {
				System.out.println("You win!!!");
				setWinner(true);
			}
			else {
				System.out.println("Try again");
				System.out.println("Your number is between: " + lowerHint(actualNum) + " & " + upperHint(actualNum) + '\n');
			}
		}
		else {
			System.out.println("You lose, actual number: " + actualNum);
			setWinner(true);
		}
	}
	
	public static int upperHint (int randNum) {
		int upperHint = randNum + randomNumberHint(randNum);
		
		return upperHint;
	}
	
	public static int lowerHint (int randNum) {
		int lowerHint = randNum - randomNumberHint(randNum);

		return lowerHint;
	}
	
	public static int randomNumberHint(int actualNum) {
		Random hintNum = new Random();
		int bound = 15;
		int randNum = hintNum .nextInt(bound);

		return randNum;
	}
	
	public static void setWinner(boolean temp) {
		winner = temp;
	}
	
	public static boolean getWinner() {
		return winner;
	}
}
