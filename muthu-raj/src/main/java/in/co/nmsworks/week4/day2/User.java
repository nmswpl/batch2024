package in.co.nmsworks.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long accountNo;
    private String name;
    private Long balance = 0L;
    private List<String> history = new ArrayList<>();
    private static Long accNoIncrementer = 1L;

    public User(String name) {
        this.name = name;
        setAccountNo();
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history.add(history);
    }

    public Long getAccountNo() {
        return accountNo;
    }

    private void setAccountNo() {
        this.accountNo = accNoIncrementer++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBalance() {
        return balance;
    }

    private void setBalance(Long balance) {

        this.balance = balance <= 0 ? 0 : balance;
    }

    public void withdraw(Long amount)
    {
        setBalance(getBalance() - amount);
    }

    public void deposit(Long amount)
    {
        setBalance(getBalance() + amount);
    }

    @Override
    public String toString() {
        return "User{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
