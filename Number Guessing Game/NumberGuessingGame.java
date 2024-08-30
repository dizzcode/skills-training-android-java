import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Function to read user input
    public static String readInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    // Function to play the guessing game
    public static void playGuessingGame() {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Integer guess = null;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        while (guess == null || guess != targetNumber) {
            String input = readInput("Enter your guess");
            try {
                guess = Integer.parseInt(input);
                attempts++;
                
                if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else if (guess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        playGuessingGame();
    }
}