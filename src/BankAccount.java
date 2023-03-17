public class BankAccount {
    private int bankAccount;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(int bankAccount, int balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccount=" + bankAccount +
                ", balance=" + balance +
                '}';
    }
}
