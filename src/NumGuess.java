import java.util.Scanner;
import java.util.Random;

public class NumGuess {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 - 100");
		int num = input.nextInt();
		
		winner(randomNumber(), num);
	}
	
	public static int randomNumber() {
		Random rad = new Random();
		int upperbound = 100;
		int randNum = rad.nextInt(upperbound);

		return randNum;
	}
	
	public static void winner(int randNum, int temp) {
		if(temp == randNum) {
			System.out.println("You win!!!");
			return;
		}
		else {
			System.out.println("You lose, actual number: " + randNum);
			return;
		}
	}
}