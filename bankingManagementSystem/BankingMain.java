package bankingManagementSystem;

public class BankingMain {
    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(101, "Alice", 5000, 4.0);
        CurrentAccount ca = new CurrentAccount(202, "Bob", 2000, 1000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.deposit(1500);
        sa.withdraw(2000);
        System.out.println("Interest Earned: " + sa.calculateIntrest());

        ca.withdraw(2500); // overdraft
        ca.deposit(500);

        sa.showHistory();
        ca.showHistory();
    }
}
