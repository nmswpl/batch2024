package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankManagement {
    static Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

    public static void main(String[] args) {

        BankManagement bankManagement = new BankManagement();

        String[] accountHolderNames = {"Hari", "Suriya", "MSDhoni"};
        for (String accountHolderName : accountHolderNames) {
            bankManagement.addAccount(accountHolderName);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n***********************************************\n Welcome to Bank");
            System.out.println("1. Add account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrew");
            System.out.println("4. checkBalance");
            System.out.println("5. print Statement");
            System.out.println("6. Quit \n");
            System.out.print("Enter Your Choice (1/2/3/4/5/6) :: ");
            int choice = scanner.nextInt();
            int accountNumber = 0;
            switch (choice) {
                case 1:
                    System.out.print("\nEnter your name :  ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    bankManagement.addAccount(name);
                    break;
                case 2:
                    System.out.print("\nEnter your account number : ");
                    accountNumber = scanner.nextInt();
                    System.out.println("\nEnter the amount to deposit : ");
                    Integer depositAmount = scanner.nextInt();
                    bankManagement.depositAmount(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("\nEnter your account number : ");
                    accountNumber = scanner.nextInt();
                    System.out.println("\nEnter the amount to withdrew : ");
                    Integer withdrewAmount = scanner.nextInt();
                    bankManagement.withdrewAmount(accountNumber, withdrewAmount);
                    break;
                case 4:
                    System.out.print("\nEnter your account number : ");
                    accountNumber = scanner.nextInt();
                    System.out.println(bankManagement.getBalance(accountNumber));
                    break;
                case 5:
                    System.out.print("\nEnter your account number : ");
                    accountNumber = scanner.nextInt();
                    bankManagement.printStatement(accountNumber);
                    break;
                case 6:
                    System.out.println("Thank You for visiting Bank");
                    return;
                default:
                    System.out.println("Invalid Option !!");
            }
        }
    }

    private void printStatement(int accountNumber) {
        List<String> statementList = bankAccountMap.get(accountNumber).getStatement();
        System.out.println("Date & Time\t\t|\tAmount\t|\tTransactionType\t|\tCurrentBalance\t|");
        System.out.println("------------------------------------");
        for (String string : statementList) {
            System.out.println(string);
        }
        System.out.println("\n\nCurrent Balance \t: " + getBalance(accountNumber));
    }

    private void insertStatement(int accountNumber, int amount) {
        if (isValidAccount(accountNumber)) {
            if (amount > 0) {
                bankAccountMap.get(accountNumber).setStatement(getTime() + "\t|\t" + amount + " \t|\tDeposited\t|\t"+getBalance(accountNumber)+"\t|");
            } else if (amount < 0) {
                bankAccountMap.get(accountNumber).setStatement(getTime() + "\t|\t" + amount + " \t|\tWithdrew\t|\t"+getBalance(accountNumber)+"\t|");
            }
        }
    }

    private void withdrewAmount(int accountNumber, int amount) {
        if (amount > 0) {
            if (isValidAccount(accountNumber)) {
                int accountBalance = getBalance(accountNumber);
                if (accountBalance >= amount) {
                    bankAccountMap.get(accountNumber).setBalance(accountBalance - amount);
                    insertStatement(accountNumber, -amount);
                    System.out.println("Withdrew successfully");
                } else {
                    System.out.println("Insufficient Balance !!");
                }
            } else {
                System.out.println("Account not found !!!");
            }
        } else {
            System.out.println("invalid Amount");
        }
    }

    private void depositAmount(int accountNumber, int depositAmount) {
        if(depositAmount>0){
        if (isValidAccount(accountNumber)) {
            bankAccountMap.get(accountNumber).setBalance(getBalance(accountNumber) + depositAmount);
            System.out.println("Your updated account balance : " + getBalance(accountNumber));
            insertStatement(accountNumber, depositAmount);
        } else {
            System.out.println("Account not found !!!");
        }}
        else{
            System.out.println("invalid Amount");
        }
    }

    private Integer getBalance(int accountNumber) {
        if (isValidAccount(accountNumber)) {
            return bankAccountMap.get(accountNumber).getBalance();
        } else {
            System.out.println("Account number not found !!!");
            return 0;
        }
    }

    private void addAccount(String name) {
        BankAccount account = new BankAccount(name);
        bankAccountMap.put(account.getAccountNumber(), account);
        System.out.println("Account Created Succesfully !!");
        System.out.println("Your Account number :" + account.getAccountNumber());
    }

    private String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    private boolean isValidAccount(int accountNumber) {
        return bankAccountMap.containsKey(accountNumber);
    }
}
