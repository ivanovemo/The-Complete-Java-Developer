import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int ourGuess;
        int computerNumber;
        int guessCount = 0;
        boolean guessedNumber = false;

        computerNumber = random.nextInt(100) + 1;

        while (!guessedNumber) {
            System.out.print("Enter your integer guess: ");
            ourGuess = keyboard.nextInt();
            guessCount++;

            if (ourGuess >= 1 && ourGuess <= 100) {
                if (ourGuess == computerNumber) {
                    System.out.println("Congrats! You guessed the number in "
                    + guessCount + " guesses! Thanks for playing!");

                    guessedNumber = true;
                } else if (ourGuess > computerNumber) {
                    System.out.println("Your guess was too high!");
                } else {
                    System.out.println("Your guess was too low!");
                }
            } else {
                System.out.println("That was a wasted guess! You must pick a number between 1 and 100, inclusive!");
            }
        }
    }
}
