package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankOperations
{
    Scanner sc= new Scanner(System.in);
    Map<Integer, User> userDetails = new HashMap<>();
    List<String> statementList = new ArrayList<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    public static void main(String[] args) {
        BankOperations bankOperations = new BankOperations();
        Scanner sc= new Scanner(System.in);

        int option=0;
        do{
            System.out.println("1.Add new user 2.Withdraw 3.Deposit 4 check Balance 5.show statement");
            System.out.println("Enter your option :");
            option = sc.nextInt();
            switch (option){

                case 1:
                    System.out.println("Enter the Account Number: ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter the initial amoount:");
                    int amount = sc.nextInt();
                    bankOperations.addUser(accountNumber,name,amount);
                    break;

                case 2:
                    System.out.println("Enter the Account Number:");
                    int accountNumberToBeChecked = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name:");
                    String userName = sc.nextLine();
                    bankOperations.withdraw(accountNumberToBeChecked,userName);
                    break;
                case 3:
                    System.out.println("Enter the Account Number:");
                    int depositAccountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Name:");
                    String nameForDeposit = sc.nextLine();
                    bankOperations.deposit(depositAccountNumber, nameForDeposit);
                    break;
                case 4:
                    System.out.println("Enter the Account Number:");
                    int accountNumberBalanceCheck = sc.nextInt();
                    System.out.println("Enter the Name:");
                    String nameBalanceCheck = sc.nextLine();
                    System.out.println("balance: "+bankOperations.checkBalance(accountNumberBalanceCheck,nameBalanceCheck));
                    break;
                case 5:
                    System.out.println("Enter the Account Number:");
                    int accNumber = sc.nextInt();
                    System.out.println("Enter the Name:");
                    String nameforUser = sc.nextLine();
                    bankOperations.showStatement(accNumber,nameforUser);
                    break;
                default:
                    System.out.println("Invalid Option");

            }
        }while(option != 6 );

    }



    public   int checkBalance(int accountNumberBalanceCheck, String nameBalanceCheck) {
        int balance =0;
        balance = userDetails.get(accountNumberBalanceCheck).getBalance();
        return balance;
    }

    public   void deposit(int depositAccountNumber, String nameForDeposit) {

        System.out.println("Enter the amount to be deposited:");
        int amount = sc.nextInt();
        if(userDetails.get(depositAccountNumber).getUserName().equalsIgnoreCase(nameForDeposit)) {

           statementList.add(dtf.format(now) + "+"+amount);

            User modifiedUser = new User(depositAccountNumber,nameForDeposit, userDetails.get(depositAccountNumber).getBalance()+amount,statementList);
            userDetails.put(depositAccountNumber, modifiedUser);

        }else {
            System.out.println("Invalid account Number or User name");
        }
        System.out.println("After Deposit:" + userDetails.get(depositAccountNumber).getBalance());

    }


    public void withdraw(int accountNumberToBeChecked, String userName) {
        System.out.println("Enter the the amount to withdraw:");
        int amount = sc.nextInt();
        if(userDetails.get(accountNumberToBeChecked).getUserName().equalsIgnoreCase(userName) && checkBalance(accountNumberToBeChecked,userName) >= amount){
            System.out.println(amount+ " is withdrawed");
            statementList.add(dtf.format(now) + "+"+amount);


            User modifiedUser = new User(accountNumberToBeChecked,userName, userDetails.get(accountNumberToBeChecked).getBalance()-amount, statementList);
            userDetails.put(accountNumberToBeChecked, modifiedUser);


        }else {
            System.out.println("Invalid account Number or User name");
        }
        System.out.println("After withdraw remaining Balance:"+userDetails.get(accountNumberToBeChecked).getBalance());
    }

    public  void addUser(int accountNumber, String name, int balance){
        User newUser = new User(accountNumber, name,balance);
        userDetails.put(accountNumber,newUser);
        System.out.println(userDetails);
    }

    public void showStatement(int accountNumber, String Name){
        System.out.println(userDetails.get(accountNumber).getStatement());

    }
}
