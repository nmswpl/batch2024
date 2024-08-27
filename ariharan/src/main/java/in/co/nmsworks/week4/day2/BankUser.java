package in.co.nmsworks.week4.day2;

public class BankUser {
    private Integer accountNo;
    private String userName;
    private Integer balance;

    public BankUser(Integer accountNo, String userName, Integer balance){
        this.accountNo = accountNo;
        this.userName = userName;
        this.balance = balance;
    }

    public Integer getAccountNo(){
        return accountNo;
    }

    public void setAccountNo(Integer accountNo){
        this.accountNo = accountNo;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public Integer getBalance(){
        return balance;
    }

    public void setBalance(Integer balance){
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "BankUser{" +
                "accountNo=" + accountNo +
                ", userName=" + userName +
                ", balance=" + balance +
                '}';
    }
}
