package accounts;

public class GoldCheckingAccount extends CheckingAccount{

    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        //Returns the lesser because there is a max of 4000 points, so cost*50 or 4000
        return (int)(Math.min(cost, 4000) * 50);
    }
}
