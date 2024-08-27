package in.co.nmsworks.week4.day1.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingSystem {
    Map<Integer,BankUser> bankUsers = new HashMap<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    List<String> statement = new ArrayList<>();

    public static void main(String[] args) {


        BankingSystem bankingSystem = new BankingSystem();

        bankingSystem.addUser(bankingSystem.createUser().size()+1, new BankUser("Hari", bankingSystem.createUser().size()+1,0 ) );
        bankingSystem.deposit(1,100);
        bankingSystem.withdraw(1,50);
        bankingSystem.checkBalance(1);
        bankingSystem.showStatement(1);
        bankingSystem.withdraw(1,20);
        bankingSystem.checkBalance(1);
        bankingSystem.showStatement(1);


    }
    public  Map<Integer,BankUser> createUser(){


        BankUser bankUser1 = new BankUser("Siva",1,0);
        BankUser bankUser2 = new BankUser("Arun",2,0);
        BankUser bankUser3 = new BankUser("Deepack",3,0);
        bankUsers.put(bankUser1.getAccNo(),bankUser1);
        bankUsers.put(bankUser2.getAccNo(),bankUser2);
        bankUsers.put(bankUser3.getAccNo(),bankUser3);
        return bankUsers;
    }
    public void addUser(int accNo,BankUser bankUser){
        bankUsers.put(accNo,bankUser );
        System.out.println("User added");
        System.out.println(createUser());


    }
    public void deposit(int accNo, int amount) {
        BankUser user = bankUsers.get(accNo);
        if (user != null) {
            user.setBalance(user.getBalance() + amount);
            System.out.println("Deposited " + amount + " Rupees into account " + accNo);
        } else {
            System.out.println("Account not found");
        }
        statement.add(dtf.format(LocalDateTime.now())+" "+accNo+" deposite rs "+amount);
        System.out.println(bankUsers);
    }
    public void withdraw(int accNo,int amount){
        BankUser user = bankUsers.get(accNo);
        if (user != null) {
            user.setBalance(user.getBalance() - amount);
            System.out.println("Withdraw " + amount + " Rupees into account " + accNo);
        } else {
            System.out.println("Account not found");
        }
        statement.add(dtf.format(LocalDateTime.now())+" "+accNo+" withdraw rs "+amount);
        System.out.println(bankUsers);

    }
    public void checkBalance(int accNo){
        BankUser user = bankUsers.get(accNo);
        if(user != null){
            System.out.println("Balanece :: "+user.getBalance());
        }
        else {
            System.out.println("Account not found");
        }
    }
    public void showStatement(int accNo){
        LocalDateTime now = LocalDateTime.now();
        BankUser user = bankUsers.get(accNo);
        if(user != null){
            System.out.println("Statement for account " + accNo + " as of " + dtf.format(now) + ":");
            System.out.println("Name: " + user.getName());
            System.out.println("Balance: " + user.getBalance());
            for (String s : statement) {
                System.out.println(s);

            }
        } else {
            System.out.println("Account not found");
        }

        }
    }

