public class BankAccount {
    public String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to deposit must be greater than 0!");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("The amount to deposit must be greater than 0 " +
                    "and less than your balance.");
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
