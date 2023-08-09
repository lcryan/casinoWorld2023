package org.example.BlackJack;

public class Dealer {

    public Hand hand;
    private boolean isStaying = false;

    public Dealer() {
        this.hand = new Hand();
    }

    public void performMove(Deck deck, String move) {
        if (hand.getTotalValue() < 17) {
            Card[] cardForDealer = new Card[]{deck.getNextCard()}; // adding card to the suit of dealer //
            this.addCardsToHand(cardForDealer);
        } else {
            isStaying = true;
        }
    }

    public void addCardsToHand(Card[] cards) {
        for (Card card : cards) { //iterating through all cards of the suit //
            hand.addCard(card);
        }
        ;
    }

    public boolean isStaying() {
        return isStaying = true;
    }

    public boolean isBust() {
        return hand.getTotalValue() > 21; // equal to player is bust, if total worth above 21 then game is lost //
    }

    public int getHandValue() {
        return hand.getTotalValue();
    }

    public String renderHand() {
        return hand.render(); // TODO : return still has to be amended here;
    }

}

