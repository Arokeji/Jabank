package accounts;

public class CheckingAccount extends Account{

    public int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints){
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost){
        if (cost > balance){
            return false;
        }

        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public int calculateRewardPoints(double cost) {
        return (int)(cost*10);
    }

    @Override
    public void status() {
        System.out.printf("Checking Account\n\tBalance: %.2f\n\tReward Points: %d\n", balance, rewardPoints);
    }
}
