package in.co.nmsworks.week4.day2;

public class AccountHolder {
    private int accountNumber;
    private String name;
    private long balance = 0;

    public AccountHolder() {
    }

    public AccountHolder(int accountNumber, String name, long balance) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
                "AccountNo : " + accountNumber +
                ", Name : '" + name + '\'' +
                ", Balance : " + balance +
                '}';
    }
}
