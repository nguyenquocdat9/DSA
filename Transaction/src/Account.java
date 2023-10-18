import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /** nap tien. */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance = balance + amount;
        }    
    }

    /** rut tien. */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance = balance - amount;
        }
    }

    /** them giao dich. */
    public void addTransaction(double amount, String operation) {
        if (operation.equals("deposit")) {
            deposit(amount);
            Transaction newTran = new Transaction(operation, amount, this.balance);
            transitionList.add(newTran);
        } else if (operation.equals("withdraw")) {
            withdraw(amount);
            Transaction newTran = new Transaction(operation, amount, this.balance);
            transitionList.add(newTran);

        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /** lish su giao dich. */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String op = transitionList.get(i).getOperation();
            if (op.equals("deposit")) {
                op = " Nap tien $";
            } else if (op.equals("withdraw")) {
                op = " Rut tien $";
            }
            String amount = String.format("%.2f", transitionList.get(i).getAmount());
            String balance = String.format("%.2f", transitionList.get(i).getBalance());
            System.out.println("Giao dich " + (i + 1) + ":" + op + amount 
                               + ". So du luc nay: $" + balance + ".");
        }
    }

    /** main. */
    public static void main(String[] args) {
        Account acc = new Account();  
        acc.addTransaction(2000.255, "deposit");  
        acc.addTransaction(1000, "withdraw");  
        acc.printTransaction();
    }
}
