package in.co.nmsworks.week4;

public class BankDetails {

    private Integer accountNumber;
    private String userName;
    private Integer balance;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "BankDetails{" +
                "accountNumber=" + accountNumber +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BankDetails() {

    }

    public BankDetails(Integer accountNumber, String userName, Integer balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;

    }
    public BankDetails(Integer accountNumber, String userName){
        this.accountNumber = accountNumber;
        this.userName = userName;

    }
}

