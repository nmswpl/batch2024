package in.co.nmsworks.week4.day2;

public class User {
    private String name;
    private long bankAccountNo;
    private long balance = 0;
    private String lastTransaction;
    private long lastTransactionAmount;

    public User() {
    }

    public User(String name, long bankAccountNo) {
        this.name = name;
        this.bankAccountNo = bankAccountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(long bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }


    public long getLastTransactionAmount() {
        return lastTransactionAmount;
    }

    public void setLastTransactionAmount(long lastTransactionAmount) {
        this.lastTransactionAmount = lastTransactionAmount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", bankAccountNo=" + bankAccountNo +
                ", balance=" + balance +
                '}';
    }
}