package org.example.BlackJack;

import java.util.Random;
import java.util.Stack;

public class Deck {

    protected Stack<Card> cards;


    public Deck() {
//TODO : do I have to add something here ?!? TBD. //
    }

    public void shuffle() {
        Random setOfCards = new Random(); // creating a new instance of the Random class - which is used to generate random numbers - here a random set of cards 0 - each time nextInt is being called - it returns a random integer. //
        for (int i = 0; i < setOfCards.nextInt(); i++) { // for-loop : iterating through the cards and shuffling them  // // an idea would be to maybe iterate a certain amount of times ??? //
            int shuffledCards = setOfCards.nextInt(cards.size()); // this line generates a random index within the range of the current number of cards in the deck (here: cards.size()). This index will be used to select a random card to swap with the card at the current index ('i') during shuffling //
            Card hold = cards.get(i); //this line temporarily stores the card at the current index (i) in a variable named "hold". This is done  to make the swapping process possible;
            cards.set(i, cards.get(shuffledCards)); // this line swaps the card at index 'i' with the card at index 'shuffledCards'; ergo:  It moves a randomly selected card to the current position in the iteration//
            cards.set(shuffledCards, hold); // this line then places the card that was originally at index 'i' (stored in the 'hold' variable) into the position of the randomly selected card index (index "shuffledCards"). This completes the swapping process. //
        }
    }

    public Card getNextCard() {
        return cards.pop(); // the pop method pon cards removes and returns the top element from the stack //
    }

    public boolean isEmpty() {
        return cards.isEmpty(); // will be true / false depending on each case // //testing if pushing works out
    }
}
