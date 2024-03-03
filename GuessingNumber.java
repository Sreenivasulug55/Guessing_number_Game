import java.util.*;

public class GuessingNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Init Random Obj
		Random random = new Random();

		// this is Generated random Number
		int randomNumber = random.nextInt(100) + 1;
		// Init the Bounds of Guessing
		int Chances = 10;
		int Chance = 1;
		while (Chance <= Chances) {
			System.out.println("Enter Your guess: ");
			int guess = scanner.nextInt();

			if (guess == randomNumber) {
				System.out.printf("Congratulations! You gussed the number:%d\nCorrectly in:'%d' Attempts", randomNumber,
						Chance);
				break;
			} else if (randomNumber < guess) {
				System.out.println("Too High! Try Agin");
				Chance++;
			} else {
				System.out.println("Too low! Try Agin");
				Chance++;
			}
		}
		if (Chance == Chances) {
			System.out.println("Sorry, You have used all atempts. the Correct number was:" + randomNumber);
		}
		scanner.close();

	}

}
