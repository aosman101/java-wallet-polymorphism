package two;

/**
 * This class represents a CallingCard, which is a type of Card.
 * It introduces instance variables such as the cardNumber, and pin.
 * @author Adil Osman.
 */
public class CallingCard extends Card {
    private int cardNumber;
    private int pin;

    /**
     * Constructs a new CallingCard constructor with 3 specified
     * parameters cardNumber, pin, name.
     *
     * @param cardNumber is the number of the CallingCard.
     * @param pin is the pin of the CallingCard.
     * @param name is the name of the card holder.
     * @author Adil Osman.
     */
    public CallingCard(int cardNumber, int pin, String name) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    /**
     * formats the cards information as a string.
     *
     * @return a formatted string including the card holder's name,
     * card number, and the pin.
     * @author Adil Osman.
     */
    @Override
    public String format() {
        return super.format() + " Card Number: " + cardNumber + " Pin: " + pin;
    }
}
