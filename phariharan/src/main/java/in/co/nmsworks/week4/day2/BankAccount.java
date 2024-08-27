package in.co.nmsworks.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private Integer accountNumber;
    private String accountHolderName;
    private Integer balance;
    private List<String> statement = new ArrayList<>();

    private static int addAccountNumber = 0;

    public List<String> getStatement() {
        return statement;
    }

    public void setStatement(String statementEntry) {
        this.statement.add(statementEntry);
    }

    public BankAccount(String accountHolderName) {
        this.accountNumber = ++addAccountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

}
