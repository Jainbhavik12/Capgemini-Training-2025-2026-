package bankingManagementSystem;
import java.time.LocalDateTime;

public class Transaction {
    private String type;       // Deposit / Withdraw / Transfer
    private double amount;
    private LocalDateTime date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    public void printDetails() {
        System.out.println(date + " | " + type + " | Amount: " + amount);
    }
}
