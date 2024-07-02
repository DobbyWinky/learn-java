public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void withdraw(double amnt) {
        if (amnt<this.balance) {
            this.balance -= amnt;
        }
    }

    public void deposit(double amnt) {
        if (amnt>0) {
            this.balance += amnt;
        }

    }
}
