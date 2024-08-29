package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankingSystem {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private Map<Long, User> userDetails = new HashMap<>();

    public void addUser(String userName, long accountNo) {
        User user = new User(userName, accountNo);
        userDetails.put(accountNo, user);
        System.out.println("User added successfully.");
    }

    public void deposit(long accountNo, long amount) {
        User user = userDetails.get(accountNo);
        if (user != null) {
            long balanceAmount = user.getBalance() + amount;
            user.setBalance(balanceAmount);
            user.setLastTransaction("deposit");
            user.setLastTransactionAmount(amount);
            LocalDateTime now = LocalDateTime.now();
            String statement = "Deposited Rs." + amount + " at " + dtf.format(now);
            user.addStatement(statement);
            System.out.println("Successfully deposited.");
        } else {
            System.out.println("Check the Account number");
        }
    }

    public void withdraw(long accountNo, long amount) {
        User user = userDetails.get(accountNo);
        if (user != null) {
            long balanceAmount = user.getBalance() - amount;
            if (balanceAmount >= 0) {
                user.setBalance(balanceAmount);
                user.setLastTransaction("withdraw");
                user.setLastTransactionAmount(amount);
                LocalDateTime now = LocalDateTime.now();
                String statement = "Withdrawn Rs." + amount + " at " + dtf.format(now);
                user.addStatement(statement);
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Check the Account number");
        }
    }

    public void checkBalance(long accountNo) {
        User user = userDetails.get(accountNo);
        if (user != null) {
            long balanceAmount = user.getBalance();
            System.out.println("Your Bank Account balance is " + balanceAmount);
        } else {
            System.out.println("Check the Account number");
        }
    }

    public void showStatement(long accountNo) {
        User user = userDetails.get(accountNo);
        if (user != null) {
            if (user.getStatements().isEmpty()) {
                System.out.println("No transactions found.");
            } else {
                System.out.println("Transaction History:");
                for (String statement : user.getStatements()) {
                    System.out.println(statement);
                }
            }
        } else {
            System.out.println("Check the Account number");
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n***********************************************\n Welcome to the Banking System");
            System.out.println("1. Add User");
            System.out.println("2. Make Deposit");
            System.out.println("3. Make Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Show Statement");
            System.out.println("6. Quit \n");
            System.out.print("Enter Your Choice (1-6) :: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    long accountNumber = scanner.nextLong();
                    bankingSystem.addUser(userName, accountNumber);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLong();
                    System.out.print("Enter amount to Deposit: ");
                    long amount = scanner.nextLong();
                    bankingSystem.deposit(accountNumber, amount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLong();
                    System.out.print("Enter amount to Withdraw: ");
                    amount = scanner.nextLong();
                    bankingSystem.withdraw(accountNumber, amount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLong();
                    bankingSystem.checkBalance(accountNumber);
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLong();
                    bankingSystem.showStatement(accountNumber);
                    break;

                case 6:
                    System.out.println("Thank You for using the Banking System");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Option !!");
            }
        }
    }
}