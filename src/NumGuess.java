import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String select = "";
		
		while(MenuOptions.getQuit() != false) {
			System.out.println("Welcome to Number Guessing!!" + '\n' + 
					   "Select a difficulty: easy || medium || hard || quit");
			select = input.next();

			MenuOptions.options(select);
		}	
		input.close();
	}
}