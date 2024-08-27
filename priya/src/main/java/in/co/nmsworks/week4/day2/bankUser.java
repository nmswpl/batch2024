package in.co.nmsworks.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class bankUser {

        private Long AccNo;
        private  String name;
        private int balance=0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccNo() {
        return AccNo;
    }

    public void setAccNo(Long accNo) {
        AccNo = accNo;
    }

    public bankUser(Long accNo, String name) {
        AccNo = accNo;
        this.name = name;
    }
   private List<String> statements=new ArrayList<>();

    public List<String> getStatements() {
        return statements;
    }

    public void setStatements(List<String> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "AccNo=" + AccNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
