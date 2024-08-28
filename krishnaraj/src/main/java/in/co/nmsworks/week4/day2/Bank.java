package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Bank {
    private String name;
    private Long accountNumber;
    private Long balence = 0L;
    List<Bank> bankUserList = new ArrayList<>();
    Map<Long, Long> accountNumberToBalenceMap = new HashMap<>();
    Map<Long, List<String>> accountNumberToStatementList = new HashMap<>();

    public Bank() {
    }

    public Bank(String name, Long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public Long getBalence() {
        return balence;
    }

    public void addUserToBank(String name, Long accountNumber) {
        bankUserList.add(new Bank(name, accountNumber));
        accountNumberToBalenceMap.put(accountNumber, balence);
        System.out.println("The bank account was created successfully : " + name);
        accountNumberToStatementList.put(accountNumber, new ArrayList<>());
    }

    public void deposit(Long amount, Long accountNumber) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        long totalAmount = accountNumberToBalenceMap.get(accountNumber) + amount;
        accountNumberToBalenceMap.put(accountNumber, totalAmount);

        List<String> depositStatement;
        depositStatement = accountNumberToStatementList.get(accountNumber);
        String amountInString = String.valueOf(amount);
        amountInString += ",+,deposited,";
        amountInString += now;
        depositStatement.add(amountInString);

        accountNumberToStatementList.put(accountNumber, depositStatement);
    }

    public void withdraw(Long amount, Long accountNumber) {
        if (amount <= accountNumberToBalenceMap.get(accountNumber)) {
            accountNumberToBalenceMap.put(accountNumber, accountNumberToBalenceMap.get(accountNumber) - amount);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String amountinString = String.valueOf(amount);
            amountinString += ",-,withdraw,";
            amountinString += now;
            List<String> depositStatement;
            depositStatement = accountNumberToStatementList.get(accountNumber);
            depositStatement.add(amountinString);

            accountNumberToStatementList.put(accountNumber, depositStatement);
        } else {
            System.out.println("Invalid balence ....");
        }
    }

    public void checkBalence(Long accountNumber) {
        System.out.println("the available balence is : " + accountNumberToBalenceMap.get(accountNumber));
    }

    public void showStatement(Long accountNumber) {
        List<String> statementValues = accountNumberToStatementList.get(accountNumber);
        for (String statementValue : statementValues) {
            System.out.println(statementValue);
        }
        checkBalence(accountNumber);
    }

    public void showMenu() {
        System.out.println("1. add user/t :");
        System.out.println("2. depocit/t :");
        System.out.println("3. withdraw/t :");
        System.out.println("4. checkBalence/t :");
        System.out.println("5. showUsers/t :");
        System.out.println("6. exit/t :");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        while (true){
            bank.showMenu();
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");
            switch (choice) {
                case 1:
                    bank.addUserToBank("krishna", 11115L);
                    break;
                case 2:
                    bank.deposit(100L, 11115L);
                    break;
                case 3:
                    bank.withdraw(100L, 11115L);
                    break;
                case 4:
                    bank.checkBalence(11115L);
                    break;
                case 5:
                    bank.showMenu();
                    break;
                case 6:
                    System.out.println("exit..");
                    return;
                default:
                    System.out.println("enter corrcet value ..");
            }
        }
    }
}
