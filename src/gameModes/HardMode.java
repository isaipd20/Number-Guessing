package gameModes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class HardMode {
	private static boolean winner;
	
	public static double randomNumber() {
		Random rad = new Random();
		double upperbound = 1000.0;
		double randNum = rad.nextDouble(upperbound);

		return randNum;
	}
	
	public static void winner(double actualNum, double temp, int counter) {
		if(counter != 2) {
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
	
	public static double upperHint (double randNum) {
		double upperHint = randNum + randomNumberHint(randNum);
		
		return upperHint;
	}
	
	public static double lowerHint (double randNum) {
		double lowerHint = randNum - randomNumberHint(randNum);

		return lowerHint;
	}
	
	public static double randomNumberHint(double actualNum) {
		Random hintNum = new Random();
		double bound = 20.0;
		double num = hintNum.nextDouble(bound);
		BigDecimal bd = new BigDecimal(num).setScale(2, RoundingMode.HALF_UP);
		double newInput = bd.doubleValue();

		return newInput;
	}
	
	public static void setWinner(boolean temp) {
		winner = temp;
	}
	
	public static boolean getWinner() {
		return winner;
	}
}
