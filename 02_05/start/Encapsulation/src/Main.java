public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount("Madhangi", 1000);
        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);
        System.out.println(myBankAccount.getOwner() + "'s balance is " + myBankAccount.getBalance());
    }
}
