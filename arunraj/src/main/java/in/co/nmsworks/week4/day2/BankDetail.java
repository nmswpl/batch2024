package in.co.nmsworks.week4.day2;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankDetail {
    Map<Integer,AccountHolder> listOfAccountHolders = new HashMap<>();

    public static void main(String[] args) {
        BankDetail bd = new BankDetail();
        bd.addUser(1,"Arun",5000);
        bd.addUser(2,"Messi",10000);
        bd.addUser(3,"Rono",9000);
        bd.addUser(4,"Neymar",8000);
        bd.addUser(5,"Kane",7500);
        bd.checkBalance(5);
        bd.deposit(1,2000);
        bd.checkBalance(1);
        bd.withDraw(1,2000);
        for (Map.Entry<Integer,AccountHolder> entry : bd.listOfAccountHolders.entrySet()){
            System.out.println(entry);
        }

    }

    private void addUser(int accountNo ,String name, long balance){
        AccountHolder ac = new AccountHolder(accountNo,name,balance);
        listOfAccountHolders.put(accountNo,ac);
    }

    private void deposit(int accontNo, long amount){
        listOfAccountHolders.get(accontNo).setBalance(checkBalance(accontNo) + amount);
    }

    private void withDraw(int accountNo ,long amount){
        listOfAccountHolders.get(accountNo).setBalance(checkBalance(accountNo) - amount);
    }

    private long checkBalance(int accountNo){
        long bal = 0;
        bal  = listOfAccountHolders.get(accountNo).getBalance();
        System.out.println("The account balance : "+bal);
        return bal;
    }

    private List<String> showStatus(int accountNo){
        List<String> transactions = new ArrayList<>();
        String transaction = String.valueOf((DateTimeFormatter.ISO_LOCAL_DATE));
        transactions.add(transaction);
        return transactions;
    }
}
