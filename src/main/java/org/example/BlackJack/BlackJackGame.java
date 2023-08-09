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
            renderAllHands(); //referring to method above//
            if (!player.isStaying() && !dealer.isStaying()) {
                System.out.println("Hello player! Do you want to HIT or STAY ?");
                String hitOrStay = inputScanner.nextLine();
                if (hitOrStay.equals("hit") || hitOrStay.equals("stay")) {
                    player.performMove(deck, hitOrStay); //performMove from player method //

                    if (player.isBust()) {
                        System.out.println("Oh no! You have lost!");
                        System.out.println("Your total points were " + player.getHandValue() + "." + " Try again!");
                        gameIsRunning = false;
                    }
                    dealer.performMove(deck, hitOrStay);
                    if (dealer.isBust()) {
                        System.out.println("You have won!");
                        System.out.println("The dealer's cards worth is " + dealer.getHandValue() + ".");
                        renderAllHands();
                    } else {
                        System.out.println("Sorry, but you seem to have chosen an invalid option.");
                    }
                } else {
                    if (player.getHandValue() <= dealer.getHandValue()) {
                        System.out.println("Boohoo! You have lost!");
                    }
                    if (dealer.getHandValue() < player.getHandValue()) {
                        System.out.println("You have won!!!");
                        renderAllHands();
                    }
                    gameIsRunning = false;
                }
            }
        }
    }
}
