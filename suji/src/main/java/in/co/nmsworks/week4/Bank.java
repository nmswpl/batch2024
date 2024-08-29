package in.co.nmsworks.week4;

import com.mysql.cj.util.DnsSrv;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Bank
{
    String name;
    long AccNo;
    float balance;
    List<String> statementList=new ArrayList<>();;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccNo() {
        return AccNo;
    }

    public Bank(String name, long accNo, float balance) {
        this.name = name;
        AccNo = accNo;
        this.balance = balance;
    }

    public void setAccNo(long accNo) {
        AccNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", AccNo=" + AccNo +
                ", balance=" + balance +
                '}';
    }
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    // dtf.format(now)
}

class BankSystem
{
    float amount;
List<Bank> listOfBanks=new ArrayList<>();
  //  List<String> statementList=new ArrayList<>();
Map<Long,List<String>> mapStatement=new HashMap<>();

//Map<Long,Map<String,String>> statement=new HashMap<>();


    public void addUser(String name,long AccNo)
    {
        Bank ob=new Bank(name,AccNo,0);
        listOfBanks.add(ob);
        System.out.println(" New user added");
    }

    public void deposit(long Accno, float amount, String date)
    {
        float balance=0;
        for (Bank listOfBank : listOfBanks)
        {
           if(listOfBank.getAccNo()==Accno)
           {
               listOfBank.balance= listOfBank.balance+amount;
               balance=listOfBank.balance;
            //   statement.put(listOfBank.getAccNo(),mapStatement);
               (listOfBank.statementList).add(date+" \t +"+amount+"\t "+listOfBank.balance+"\n");
               mapStatement.put(listOfBank.getAccNo(), listOfBank.statementList);

           }

        }System.out.println("The amount "+amount+" has been deposited. Your currect balnce is "+balance);
    }

    public void withdraw(long Accno, float amount, String date)
    {
        float balance=0;
        for (Bank listOfBank : listOfBanks)
        {
            if(listOfBank.getAccNo()==Accno)
            {
                listOfBank.balance= listOfBank.balance-amount;
                balance=listOfBank.balance;
               // statement.put(listOfBank.getAccNo(),mapStatement);
                //mapStatement.put(date," +"+amount);
                listOfBank.statementList.add(date+" \t"+" -"+amount+"\t "+listOfBank.balance+"\n");
                mapStatement.put(listOfBank.getAccNo(), listOfBank.statementList);
            }
        } System.out.println("The amount "+amount+" has been deposited. Your currect balnce is "+balance);
    }

    public void checkBalance(long AccNo)
    {
        for (Bank listOfBank : listOfBanks)
        {
            if (listOfBank.getAccNo()==AccNo)
            {
                System.out.println(" Hello "+listOfBank.getName()+" !! Your balance "+listOfBank.balance+"  for  AccountNumber "+AccNo);
            }
        }
    }

    public void displayBankUsers()
    {
        for (Bank listOfBank : listOfBanks)
        {
            System.out.println(listOfBank.getName()+" "+listOfBank.getAccNo());
        }
    }

    public void statement(Long Accno)
    {

                for (Map.Entry<Long, List<String>> e : mapStatement.entrySet())
                {
                    if (Objects.equals(e.getKey(), Accno))
                    {
                        System.out.println("AccNo. "+e.getKey() + "\n " + e.getValue().toString());
                    }
                }

    }

    public static void main(String[] args)
    {


        BankSystem ob=new BankSystem();
       ob.addUser("SUji",8758L);
       ob.addUser("Rapenzel",54336L);
       ob.deposit(54336L,900,"06/12/2002");
        ob.withdraw(54336L,600,"13/12/2002");
       ob.deposit(8758L,500,"12/11/2002");
        ob.withdraw(8758L,200,"14/11/2002");

        ob.checkBalance(54336L);
         ob.displayBankUsers();
       ob.statement(54336L);


    }
}
