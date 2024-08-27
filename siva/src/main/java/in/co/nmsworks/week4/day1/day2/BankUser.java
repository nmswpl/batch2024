package in.co.nmsworks.week4.day1.day2;



public class BankUser {
    private String name;
    private int accNo;
    private int balance;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public BankUser(String name, int accNo, int balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;



    }

    @Override
    public String toString() {
        return "BankUser{" +
                "name='" + name + '\'' +
                ", accNo=" + accNo +
                ", balance=" + balance +
                '}';
    }
}
