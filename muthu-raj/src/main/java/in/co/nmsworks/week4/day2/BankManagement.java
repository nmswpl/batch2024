package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankManagement {

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    Map<Long, User> usersList = null;


    public BankManagement() {
        usersList = getSampleUsers();
    }

    private Map<Long, User> getSampleUsers() {

        Map<Long, User> usersList = new HashMap<>();
        User u = new User("Muthu Raj");
        u.setHistory(getDateAndTime() + " " + " Account created!");
        usersList.put(u.getAccountNo(), u);

        u = new User("John");
        u.setHistory(getDateAndTime() + " " + " Account created!");
        usersList.put(u.getAccountNo(), u);

        u = new User("Felix");
        u.setHistory(getDateAndTime() + " " + " Account created!");
        usersList.put(u.getAccountNo(), u);

        u = new User("Hannah");
        u.setHistory(getDateAndTime() + " " + " Account created!");
        usersList.put(u.getAccountNo(), u);

        return usersList;
    }

    public static void main(String[] args) {

        BankManagement bm = new BankManagement();
        System.out.println(bm.usersList);

//        bm.addUser();
//        bm.deposit();

//        System.out.println(bm.usersList);

//        bm.withdrawal();

//        System.out.println(bm.usersList);

//        bm.checkBalance();

//        bm.showHistory();


        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add new user\n" +
                    "2. Deposit\n" +
                    "3. Withdrwal\n" +
                    "4. Show history\n" +
                    "5. Check account balance\n" +
                    "6. Exit");
            System.out.println("Enter you choice :: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bm.addUser();
                    break;
                case 2:
                    bm.deposit();
                    break;

                case 3:
                    bm.withdrawal();
                    break;

                case 4:
                    bm.showHistory();
                    break;

                case 5:
                    bm.checkBalance();
                    break;

                case 6:
                    System.out.println("Thank you for using our service!");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (choice != 6);

    }

    private void showHistory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account No ::");
        Long accNo = sc.nextLong();

        if (!userExist(accNo)) {
            System.out.println("Account not found!");
            return;
        }

        int stmtLen = usersList.get(accNo).getHistory().size() - 1;

        System.out.println("------------------------------------");
        System.out.println("DATE\t\t TIME\t\t STATEMENT");
        System.out.println("------------------------------------");

        for (int i = 0; i <= stmtLen; i++) {

            System.out.println(usersList.get(accNo).getHistory().get(stmtLen - i));
        }
    }

    private void checkBalance() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account No ::");
        Long accNo = sc.nextLong();

        if (!userExist(accNo)) {
            System.out.println("Account not found!");
            return;
        }
        System.out.println("The account balance is :: " + usersList.get(accNo).getBalance());

    }

    private void withdrawal() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account No ::");
        Long accNo = sc.nextLong();

        if (!userExist(accNo)) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println(usersList.get(accNo));

        User u = usersList.get(accNo);

        System.out.println("Enter amount to be withdrawn :: ");
        Long amount = sc.nextLong();

        if(u.getBalance() < amount)
        {
            System.out.println("Insufficient Balance");
            return;
        }

        u.withdraw(amount);
        u.setHistory(getDateAndTime() + " Rs." + amount + " withdrawn");

        usersList.put(u.getAccountNo(), u);

    }

    private void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account No ::");
        Long accNo = sc.nextLong();
        if (!userExist(accNo)) {
            System.out.println("Account not found!");
            return;
        }
        System.out.println(usersList.get(accNo));

        System.out.println("Enter amount to be deposited :: ");
        Long amount = sc.nextLong();

        User u = usersList.get(accNo);

        u.deposit(amount);
        u.setHistory(getDateAndTime() + " Rs." + amount + " Credited");

        usersList.put(u.getAccountNo(), u);

        System.out.println("Rs." + amount + " Credited");
        System.out.println("Current Balance is " + u.getBalance());

    }

    private void addUser()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user name :: ");
        String name = sc.nextLine();

        User u = new User(name);
        u.setHistory(getDateAndTime() + " Account created!");
        usersList.put(u.getAccountNo(), u);
    }

    private boolean userExist(Long accNo) {
        return usersList.containsKey(accNo);
    }

    private static String getDateAndTime() {
        return DATE_TIME_FORMATTER.format(LocalDateTime.now());
    }
}
