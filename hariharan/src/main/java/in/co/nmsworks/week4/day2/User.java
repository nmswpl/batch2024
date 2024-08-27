package in.co.nmsworks.week4.day2;

import java.util.*;

public class User {
    private int accountNumber;
    private String userName;

    public User(int accountNumber, String userName, int balance, List<String> statement) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
        this.statement = statement;
    }

    protected int balance;

    public List<String> getStatement() {
        return statement;
    }

    public void setStatement(List<String> statement) {
        this.statement = statement;
    }

    List<String> statement = new ArrayList<>();

    public User(int accountNumber, String userName, int balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
