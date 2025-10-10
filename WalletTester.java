package two;

/**
 * WalletTester is a class used to test functionality of a wallet.
 */
public class WalletTester {

    /**
     * The test method creates instances of CallingCard and DriverLicense,
     * adds them to the wallet. Also, prints the formatted details of the
     * cards in the Wallet.
     * @author Adil Osman.
     */
    public void test() {
        CallingCard callingCard = new CallingCard(12258018, 1892, "Jamal");
        DriverLicense driverLicense = new DriverLicense(2025, "Micheal", 1017);
        Wallet wallet = new Wallet();
        wallet.addCard(callingCard);
        wallet.addCard(driverLicense);
        System.out.println(wallet.formatCards());
    }
}
