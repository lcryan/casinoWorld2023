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
        return isBust(); // can we work with an if else statement here ?? //
    }

    public int getHandValue() {
        return getHandValue();//TODO: still has to be amended here!!! //
    }

    public String renderHand() {
        return renderHand(); // TODO : return still has to be amended here;
    }

}
