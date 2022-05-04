import java.util.Random;

public class Functions {
	private static boolean winner;
	
	public static int randomNumber() {
		Random rad = new Random();
		int upperbound = 100;
		int randNum = rad.nextInt(upperbound);

		return randNum;
	}
	
	public static void winner(int randNum, int temp, int counter) {
		if(counter != 2) {
			if(randNum == temp) {
				System.out.println("You win!!!");
				setWinner(true);
			}
			else {
				System.out.println("Try again");
			}
		}
		else {
			System.out.println("You lose, actual number: " + randNum);
			setWinner(true);
		}
	}
	
	public static void setWinner(boolean temp) {
		winner = temp;
	}
	
	public static boolean getWinner() {
		return winner;
	}
	
	
}
