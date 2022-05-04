package gameModes;
import java.util.Random;

public class EasyMode {
	private static boolean winner;
	
	public static int randomNumber() {
		Random rad = new Random();
		int upperbound = 100;
		int randNum = rad.nextInt(upperbound);

		return randNum;
	}
	
	public static void winner(int randNum, int temp, int counter) {
		int actualNum = randNum;
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
	
	public static int upperHint (int randNum) {
		int upperHint = randNum + 10;
		
		return upperHint;
	}
	
	public static int lowerHint (int randNum) {
		int lowerHint = randNum - 10;

		return lowerHint;
	}
	
	public static void setWinner(boolean temp) {
		winner = temp;
	}
	
	public static boolean getWinner() {
		return winner;
	}	
}
