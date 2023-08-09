package org.example.BlackJack;

public class Player {
    public Hand hand;
    private boolean staying;

    public Player() {
        this.hand = new Hand();
    }

    public void performMove(Deck deck, String move) {

    }

    public void addCardsToHand(Card[] cards) {

    }

    public boolean isStaying() {
        return staying; // who do we have to call on here ? Usually it is supposed to be the player / dealer//
    }

    public boolean isBust() {
        return isBust(); // can we work with an if else statement here -- does do we have to add this to the main method??? //
    }

    public int getHandValue() {
        return hand.getTotalValue();//getting total value of hand - referring to method in deck //
    }

    public String renderHand() {
        return hand.render(); // rendering worth of hand into a string //
    }

}
