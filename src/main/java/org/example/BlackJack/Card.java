package org.example.BlackJack;

public class Card {
    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public String render() {
        return suit.getSymbol() + " " + value.getValue();
    }

    public CardValue getValue() {
        return value;
    }
}
