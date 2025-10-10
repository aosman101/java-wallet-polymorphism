package two;

public class IDCard extends Card {
    private int idNumber;

    public IDCard(int idNumber, String name) {
        super(name);
        this.idNumber = idNumber;
    }
    @Override
    public String format() {
        return super.format() + " ID Number:" + idNumber;
    }

}
