public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";
    
    /** contructor. */
    Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /** get op. */
    public String getOperation() {
        return operation;
    }

    /** set op. */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /** get amount. */
    public double getAmount() {
        return amount;
    }

    /** set amount. */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /** get balance. */
    public double getBalance() {
        return balance;
    }

    /** set balance. */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
}
