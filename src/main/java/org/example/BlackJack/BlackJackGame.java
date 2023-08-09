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
        player = new Player(); //making a new player instance - no cards have been added yet - hand empty//
        dealer = new Dealer(); // making a new dealer instance - no cards have been added yet - empty hand//
        this.deck.shuffle();
        Card[] cardsForPlayers = new Card[]{deck.getNextCard(), deck.getNextCard()}; // step 1. player gets 2 cards //
        player.addCardsToHand(cardsForPlayers); //adding actual cards to players hand //
        Card[] cardsForDealer = new Card[]{deck.getNextCard()}; //2. dealer gets one card.
        dealer.addCardsToHand(cardsForDealer); // cards are being added to the hand of the dealer - implementation //
    }

    public void renderAllHands() {
        System.out.println("Hey player! These are YOUR cards!"); // message to player //
        System.out.println(player.renderHand()); // here making card values into a string - referring to method in player class //
        System.out.println("These are the dealer's cards!"); // message to player about the dealer's cards //
        System.out.println(dealer.renderHand()); // making card values into a  string - referring to method in player class //
    }


    public void playJackGame() {
        gameIsRunning = true; // the game is afoot //
        System.out.println("Welcome to a new game of Black Jack."); // start message of game for player //
        while (gameIsRunning) {

        }
    }
}
