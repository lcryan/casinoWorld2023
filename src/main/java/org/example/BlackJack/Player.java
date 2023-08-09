package org.example.BlackJack;

public class Player {
    public Hand hand;
    private boolean isStaying = false;
    ]g// first set isStaying false to be able to move to true if player decides to NOT add any more cards //

    public Player() {
        this.hand = new Hand();
    }

    public void performMove(Deck deck, String move) {
        if (move.equals("hit me")) {
            Card card = deck.getNextCard();
            Card[] cardForPlayer = new Card[]{card}; // card from suit ?//
            this.addCardsToHand(cardForPlayer); // referring to method one below!! //
            System.out.println("You were hit with: " + card.render());
        } else {
            isStaying = true;
        }
    }

    public void addCardsToHand(Card[] cards) {
        for (Card card : cards) {
            hand.addCard(card); //referring to addCard method in Hand class //
        }
    }

    public boolean isStaying() {
        return isStaying;
    }

    public boolean isBust() {
        return hand.getTotalValue() > 21; // is this a shortened version of an if/ else statement ?//
    }

    public int getHandValue() {
        return hand.getTotalValue();//getting total value of hand - referring to method in deck //
    }

    public String renderHand() {
        return hand.render(); // rendering worth of hand into a string - referring to method in deck class //
    }

}
