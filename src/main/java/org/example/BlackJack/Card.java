package org.example.BlackJack;

public class Card {
    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public String render () {

        return null; //TODO: still has to be filled with a real return statement //
    }

    public int getValue() {
        return value.getValue();
    }
}
