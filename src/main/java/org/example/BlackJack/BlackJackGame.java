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
        this.deck.shuffle();
        Card[] cardsForPlayers = new Card[]{deck.getNextCard(), deck.getNextCard()}; // step 1. player gets 2 cards //
        player.addCardsToHand(cardsForPlayers); //adding actual cards to players hand //
        Card[] cardsForDealer = new Card[]{deck.getNextCard()}; //2. dealer gets one card.
        dealer.addCardsToHand(cardsForDealer); // cards are being added to the hand of the dealer - implementation //
    }

    public void renderAllHands() {
        System.out.println("These are your cards!");
        System.out.println(player.renderHand());
        System.out.println("These are the dealer's cards!");
        System.out.println(dealer.renderHand());
    }


    public void playJackGame() {
        gameIsRunning = true;
        System.out.println("Welcome to a new game of Black Jack.");

    }
}
