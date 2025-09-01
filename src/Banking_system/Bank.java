package Banking_system;

//use custom exception
public class Bank {
    private int balance=50000;
    public void withdraw(int amount) {
        if(amount>balance)
            throw new InsufficientBalanceException("Not enough balance");

        else
            balance -= amount;
        System.out.println("Withdrawal successful, Remaining balance: " + balance);
    }
}
