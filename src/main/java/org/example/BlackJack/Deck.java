package org.example.BlackJack;

import java.util.*;

public class Deck {

    private Stack<Card> cards = new Stack<>();


    public Deck() {
        int[] numbers = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] names = new String[]{"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        CardSuit[] suits = new CardSuit[]{
                new CardSuit("diamonds", '\u2666', "red"),
                new CardSuit("spades", '\u2660', "black"),
                new CardSuit("hearts", '\u2665', "red"),
                new CardSuit("clubs", '\u2663', "black")
        };
        ArrayList<CardValue> values = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            values.add(new CardValue(names[i], numbers[i]));
        }
        for (CardSuit suit : suits) {
            for (CardValue value : values) {
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards); // this is a method within Java ? //
    }


    public Card getNextCard() {
        return cards.pop(); // the pop method on cards removes and returns the top element from the stack //
    }

    public boolean isEmpty() {
        return true; // why is this true here ??? //
    }
}
