package org.example.BlackJack;

import java.util.Random;
import java.util.Scanner;

public class BlackJackGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;
    private Deck deck;
    private Player playerA;
    private Dealer dealer;

    public BlackJackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
        this.deck = new Deck();
    }

    public void playJackGame() {
        gameIsRunning = true;
        playerA = new Player();
        dealer = new Dealer();
// shuffle //
        //
    }
}
