package org.example;

import org.example.HigherLower.HigherLowerGame;
import org.example.BlackJack.BlackJackGame;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(inputScanner);
        BlackJackGame blackJack = new BlackJackGame(inputScanner);
        game.playGame();
        blackJack.playJackGame();
    }
}