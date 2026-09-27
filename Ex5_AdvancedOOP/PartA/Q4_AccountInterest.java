abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: " + balance +
                " | Interest: " + calculateInterest());
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accNo, double balance) { super(accNo, balance); }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% for savings
    }
}

class FixedDepositAccount extends Account {
    public FixedDepositAccount(String accNo, double balance) { super(accNo, balance); }

    @Override
    public double calculateInterest() {
        return balance * 0.07; // 7% for fixed deposit
    }
}

public class Q4_AccountInterest {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("SAV001", 50000);
        Account a2 = new FixedDepositAccount("FD001", 100000);

        a1.displayBalance();
        a2.displayBalance();
    }
}
