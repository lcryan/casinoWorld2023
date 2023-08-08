package org.example.BlackJack;

import java.util.Random;
import java.util.Stack;

public class Deck {

    private Stack<Card> cards = new Stack<>();


    public Deck() {
//TODO : do I have to add something here ?!? TBD. //
    }

    public void shuffle() {
        }


    public Card getNextCard() {
        return cards.pop(); // the pop method on cards removes and returns the top element from the stack //
    }

    public boolean isEmpty() {
        return true; // why is this true here ??? //
    }
}
