
package numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {

    // Function to play the number guessing game
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        
        // Generate a random number between 1 and 10
        int number = 1 + (int)(10 * Math.random());
        
        int K = 5; // Maximum number of attempts
        int i, guess;
        
        // Print game instructions to the player
        System.out.println("Choose a number between 1 and 10. Guess the number within " + K + " attempts.");
        
        // Loop for K number of attempts
        for (i = 0; i < K; i++) {
            System.out.println("Your guess:");
            
            guess = sc.nextInt(); // Read player's guess from input
            
            if (number == guess) { // Check if the guess is correct
                System.out.println("Congratulations! You guessed the number correctly.");
                break; // Exit the loop as the game is won
            }
            
            else if (number > guess && i != K - 1){
                System.out.println("The number is greater than " + guess); // Provide hint if the guessed number is lower
            }
            else if (number < guess && i != K -1){
                System.out.println("The number is less than " + guess); // Provide hint if the guessed number is higher
            }
        }
        
        // Check if the player couldn't guess the number within the allowed attempts
        if (i == K) {
            System.out.println("You have run out of attempts.");
            System.out.println("The number was " + number); // Display the correct number
        }
    }
    
    public static void main(String[] args) {
        guessingNumberGame(); // Start the number guessing game
    }  
}

