package in.co.nmsworks.week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banking {
    Map<Integer, BankDetails> accountHolders = new HashMap<>();
    List<String> statement = new ArrayList<>();

    public static void main(String[] args) {
        Banking user = new Banking();
        user.addUser();
        user.depositAmount(2024101, 105);
        user.withdrawl(2024101, 20);
        user.depositAmount(2024101, 20);
        user.checkBalance(2024101);
    }

    public void addUser() {
        BankDetails bankUser1 = new BankDetails(2024100, "Madhu", 0);
        BankDetails bankUser2 = new BankDetails(2024101, "Aarthi", 0);
        BankDetails bankUser3 = new BankDetails(2024102, "Pavithra", 0);
        BankDetails bankUser4 = new BankDetails(2024103, "Priya", 0);
        accountHolders.put(2024100, bankUser1);
        accountHolders.put(2024101, bankUser2);
        accountHolders.put(2024102, bankUser3);
        accountHolders.put(2024103, bankUser4);
    }

    public void depositAmount(Integer accNum, Integer amount) {
        BankDetails user2 = accountHolders.get(accNum);
        if (user2 == null) {
            System.out.println("No such account exists");
        } else {
            user2.setBalance(user2.getBalance() + amount);
        }
        System.out.println("Amount deposited");

    }

    public void withdrawl(Integer accNum, Integer amount) {
        BankDetails user1 = accountHolders.get(accNum);
        if (user1 == null) {
            System.out.println("No such account exists");
        } else {
            user1.setBalance(user1.getBalance() - amount);
        }
        System.out.println("Amount withdrawn");
    }


    public void checkBalance(Integer accNum) {
        BankDetails user3 = accountHolders.get(accNum);
        if (user3 == null) {
            System.out.println("No such account exists");
        } else {
            user3.setBalance(user3.getBalance());
        }
        System.out.println("your balance is : " + user3.getBalance());
    }

    public void statement(){

    }
}




