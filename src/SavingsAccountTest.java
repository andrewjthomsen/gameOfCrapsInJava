public class SavingsAccountTest {
    public static void main(String[] args) {
        // Savings Account objects
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        // modify interest rate
        SavingsAccount.modifyInterestRate(.04);
        // Calculate monthly interest for 12 months
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());
        // set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(.05);
        // recalculate monthly interest for one month
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        // print balances
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());
    }
}
