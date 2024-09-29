import java.util.Scanner;
import java.util.Random;

public class numbergame{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            // Step 1: Generate random number between 1 and 100
            int number = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 10; // Step 5: Limit number of attempts
            boolean guessedCorrectly = false;

            System.out.println("New Round! Try to guess the number between 1 and 100");

            // Step 2, 3, 4: Guessing loop with feedback
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score += (maxAttempts - attempts + 1); // Increase score based on remaining attempts
                } else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + number);
            }

            // Step 7: Display score and ask for replay
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
            System.out.println();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();
    }
          
}

