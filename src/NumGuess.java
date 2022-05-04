import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {
		int counter = 0;
		
		while(Functions.getWinner() == false) {
			Scanner input = new Scanner(System.in);
			System.out.println("Guess a number between 0 - 100");
			int num = input.nextInt();
			
			Functions.winner(Functions.randomNumber(), num, counter);
			counter++;
		}
	}
}