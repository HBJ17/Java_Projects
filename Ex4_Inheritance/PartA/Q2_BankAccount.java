class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected double interestRate;

    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal denied: minimum balance would be violated.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }
}

public class Q2_BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC100", 5000, 3.5);
        account.deposit(1500);

        SavingsAccount savings = new SavingsAccount("SAV200", 10000, 4.0, 2000);
        savings.deposit(2000);
        savings.withdraw(9000); // should be denied (violates minimum balance)
        savings.withdraw(3000); // should succeed
    }
}
