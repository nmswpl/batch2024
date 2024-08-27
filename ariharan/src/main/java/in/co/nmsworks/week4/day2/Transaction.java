package in.co.nmsworks.week4.day2;

public class Transaction {
    private int accNo;
    private int amount;
    private String function;
    private String dateAndTime;
    private int balance;

    public Transaction(int accNo, int amount, String function, String dateAndTime, int balance){
        this.accNo = accNo;
        this.amount = amount;
        this.function = function;
        this.dateAndTime = dateAndTime;
        this.balance = balance;
    }


    public int getAccNo(){
        return accNo;
    }

    public void setAccNo(int accNo){
        this.accNo = accNo;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public String getFunction(){
        return function;
    }

    public void setFunction(String function){
        this.function = function;
    }

    public String getDateAndTime(){
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime){
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString(){
        return "Statement{\n" +
                "accNo=" + accNo +
                ", amount=" + amount +
                ", function='" + function + '\'' +
                ", DateAndTime='" + dateAndTime + '\'' +
                ", balance=" + balance +
                "}\n";
    }
}
