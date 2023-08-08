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
        ArrayList<CardValue> values = new ArrayList<>(); // we store the Card Value objects here - Card Value represents the name and numeric value of each card - see Card Value class //

        for (int i = 0; i < numbers.length; i++) {
            values.add(new CardValue(names[i], numbers[i])); // the loop iterates through the numbers array from above and creates CardValue objects for each value-name pair. These objects are added to the 'values' ArrayList - see above!!!
        }
        for (CardSuit suit : suits) {
            for (CardValue value : values) {
                Card card = new Card(suit, value);
                cards.add(card);
            } // these nested loops iterate through each 'CardSuit' and each 'CardValue' creating 'Card' objects by combining the suit and the value! The 'Card' objects are then added to the 'cards stack' see above! - which then effectively creates a full deck of cards! "
        }
    }

    public void shuffle() {
        Collections.shuffle(cards); // the shuffle method is a part of the Java standard library - here it shuffles the elements in the 'cards' collection - the deck of cards effectively. the card stack will be shuffled randomly when this method is called - changing the order of the cards.//
    }


    public Card getNextCard() {
        return cards.pop();
    }

    public boolean isEmpty() {
        return true; // maybe has to be called only on cards here ?
    }
}
