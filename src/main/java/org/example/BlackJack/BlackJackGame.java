package org.example.BlackJack;
import java.util.Scanner;

public class BlackJackGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;
    private Deck deck;
    private Player player;
    private Dealer dealer;

    public BlackJackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
        this.deck = new Deck();
        gameIsRunning = true;
        player = new Player();
        dealer = new Dealer();
    }

    public void playJackGame() {

// shuffle //
        //
    }
}
