import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int actualNum = Functions.randomNumber();
		
		while(Functions.getWinner() == false) {
			
			System.out.println("Guess a number between 0 - 100");
			int num = input.nextInt();
			
			Functions.winner(actualNum, num, counter);
			counter++;
		}	
		input.close();
	}
}