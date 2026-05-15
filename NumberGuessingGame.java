import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("--- Welcome to the Number Guessing Game! ---");

        while (playAgain) {
            int randomNumber = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5; // Limited Attempts
            boolean guessedCorrectly = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too Low! Try again.");
                } else {
                    System.out.println("Too High! Try again.");
                }

                System.out.println("Remaining attempts: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("\nGame Over! You've used all attempts.");
                System.out.println("The correct number was: " + randomNumber);
            }

            // Replay Option
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! See you next time.");
        sc.close();
    }
}
    

