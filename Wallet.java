package two;


/**
 * The Wallet class represents a wallet that can hold up to two cards.
 * It provides methods to add a card to the wallet and to format the details
 * of the cards in the wallet. Also, the class initialises two instance variables.
 * @author Adil Osman.
 */
public class Wallet {
    private Card card1;
    private Card card2;


    /**
     * Adds a card to the wallet.
     * If the wallet already has two cards, the card
     * will not be added.
     *
     * @param card The card to be added to the wallet.
     * @author Adil Osman.
     */
    public void addCard(Card card) {
        if (card1 == null) {
            card1 = card;
        }
        else if (card2 == null) {
            card2 = card;
        }
    }

    /**
     * Formats the details of the cards inside the wallet.
     * The details of the cards are enclosed by square brackets and
     * separated by a pipe character.
     * 
     * @return A string representing the formatted details of the cards in
     * the wallet.
     * @author Adil Osman.
     */
    public String formatCards() {
        return "[" + card1.format()  + "|"+ card2.format() + "]";
    }
}
