package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankingSystem {
    Map<Integer,BankUser> idAndUser=new HashMap<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    Map<Integer,List<Transaction>>idAndStatement=new HashMap<>();
    Scanner scanner=new Scanner(System.in);


    public void addUser(){
        System.out.println("enter the name to create a account::");
        String name=scanner.nextLine();
        Integer accNo=idAndUser.size()+1;
        System.out.println("your account number is::"+accNo);
        System.out.println();
        BankUser newUser=new BankUser(accNo,name,0);
        idAndUser.put(accNo,newUser);
        System.out.println("to add amount press 1 or continue with 0 balance account press 0 :");
        int val=scanner.nextInt();
        if(val==1)
            depositer(accNo);
    }
    public void depositer(Integer accNo){
       BankUser user=idAndUser.get(accNo);
        List<Transaction> listOfTransaction =new ArrayList<>();
       if(user!=null){
           System.out.println("enter the amount to deposit::");
           int amount=scanner.nextInt();
           user.setBalance(user.getBalance()+amount);
           System.out.println("successfully deposited");
           checkBalance(accNo);
           Transaction st=new Transaction(accNo,amount,"deposit",String.valueOf(dtf.format(now)),user.getBalance());
           if (idAndStatement.containsKey(accNo)){
               listOfTransaction =idAndStatement.get(accNo);
               listOfTransaction.add(st);
           }
           else
               listOfTransaction.add(st);
           idAndStatement.put(accNo, listOfTransaction);
       }
       else
           System.out.println("invalid acc_no please check");
    }
    public void withDrawal(Integer accNo){
        BankUser user=idAndUser.get(accNo);
        List<Transaction> listOfTransaction =new ArrayList<>();
        if(user!=null) {
            System.out.println("enter the amount to withdrawal::");
            int amount = scanner.nextInt();
            if (user.getBalance() - amount >= 0) {
                user.setBalance(user.getBalance() - amount);
                System.out.println("take your cash thank you for visiting");
                checkBalance(accNo);
                Transaction st = new Transaction(accNo, amount, "withdrawal", String.valueOf(dtf.format(now)), user.getBalance());
                if (idAndStatement.containsKey(accNo)) {
                    listOfTransaction = idAndStatement.get(accNo);
                    listOfTransaction.add(st);
                } else
                    listOfTransaction.add(st);
                idAndStatement.put(accNo, listOfTransaction);
            }
            else
                System.out.println("invalid amount");
        }
        else
            System.out.println("invalid acc_no please check");
    }
    public void checkBalance(Integer accNo){
        BankUser user=idAndUser.get(accNo);
        if(user!=null){
            System.out.println("your balance amount is::"+user.getBalance());
            System.out.println("thank you for visiting");
        }
        else
            System.out.println("invalid acc_no please check");
    }
    public void showStatement(Integer accNo){
        System.out.println(idAndStatement.get(accNo));
    }

}
