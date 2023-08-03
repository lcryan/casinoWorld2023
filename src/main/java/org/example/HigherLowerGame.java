package org.example;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    private int randomNumberCasino;
    private int numberOfGames;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        randomNumberCasino = new Random().nextInt(100); // creates a new random number up to 100 //
        numberOfGames = 0; // variable to count the number of Games - set to zero to start //

        while (gameIsRunning) {
            System.out.println("Make a guess");
            int guess = inputScanner.nextInt(); // input guess ?? // not quite sure about this one...//
            makeAGuess(guess); // see makeAGuess to see performance of guess
        }
    }

    private void makeAGuess(int guess) {
        numberOfGames++; // every time this run +1 is added to the number of games until the player has guessed the number right//
        if (randomNumberCasino == guess) {
            gameIsRunning = false;
            System.out.println("Great news! You have guessed right!" + "You needed " + numberOfGames + " rounds to guess the right number." + "Well done!");
        } else if (guess < randomNumberCasino) {
            System.out.println("Snap! Your number is lower than expected!");
        } else {
            System.out.println("Your number is higher than expected!");
        }
    }
}
