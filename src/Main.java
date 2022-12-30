import accounts.*;


public class Main {

    public static void main(String[] args) {
        DiamondCheckingAccount dca = new DiamondCheckingAccount(1000, 0.025, 1000);
        GoldCheckingAccount gca = new GoldCheckingAccount(1000, 0.025, 1000);
        SilverCheckingAccount sca = new SilverCheckingAccount(1000, 0.025, 1000);
        SavingsAccount sa = new SavingsAccount(100, 0.045);

        dca.status();
        gca.status();
        sca.status();
        sa.status();

        dca.purchase(1000);
        gca.purchase(1000);
        sca.purchase(1000);

        dca.status();
        gca.status();
        sca.status();
        sa.status();

    }
}