package org.example.BlackJack;

import java.util.Stack;

public class Deck {

    protected Stack<Card> cards;


    public Deck() {

    }

    public void shuffle() {

    }

    public Card getNextCard() {
        return null;
    }

    public boolean isEmpty() {

        return cards.isEmpty(); //calling the method within cards; //
    }
}
