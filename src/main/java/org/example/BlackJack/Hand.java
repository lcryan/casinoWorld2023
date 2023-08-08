package org.example.BlackJack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;

    public void addCard(Card card) {
        cards.add(card); // this adds a card to each hand of either player or dealer //
    }

    public int getTotalValue() {
        int total = 0;
        for (Card card : cards) {
            total += card.getValue().getValue(); // we are using the getValue twice, because: in the first attempt is will return the object of the CardValue (which could be also the name and not the numeric value!) - in the second method call we will get out the "real" numeric value of the card //
        }
        return total; // for all cards in the deck we are getting the value here : the getValue method is being derived from the CardValue class //
    }

    public String render() {
        StringBuilder sb = new StringBuilder(); // how were we supposed to know this ??? //
        for (Card card : cards) {
            sb.append(card.render());
            sb.append("\n");
        }
        return sb.toString();
    }

}
