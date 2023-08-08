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
// this is the textual representation of all cards in the deck :  1. the StringBuilder is used to efficiently construct a string by appending smaller pieces to it
    // 2. we loop through all the cards in the deck - for each card object we call the render method - this generates a string representation of the card. We then append this string representation followed by a new line character ('\n') to the StringBuilder
    //3. sb.toString(); we return the final concatenated String representation of all cards in the deck! //
}
