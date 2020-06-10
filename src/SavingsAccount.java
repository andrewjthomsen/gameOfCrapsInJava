public class SavingsAccount {
    // class variable
    private static double annualInterestRate;
    // Inststance variable
    private double savingsBalance;

    // Constructor
    public SavingsAccount(double balance) {
        savingsBalance = balance;

    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double rate) {
        // Set annualinterestrate
        annualInterestRate = rate;
    }

    public void calculateMonthlyInterest() {
        // multiplies savings balance by annualinterestrate / 12
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

}
