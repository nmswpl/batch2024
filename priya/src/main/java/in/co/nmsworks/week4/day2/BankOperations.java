package in.co.nmsworks.week4.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankOperations {
    Map<Long, bankUser> accNoToNames = new HashMap<>();
    List<String> statements=new ArrayList<>();
    Map<Long,List<String>> accNoToStatements = new HashMap<>();
    public static void main(String[] args) {
       BankOperations bankOperations = new BankOperations();
       Scanner s = new Scanner(System.in);
        System.out.println("1.Add user\n" +
                "2.Deposit money\n"
                + "3.Withdraw money\n"+
                "4.Check Balance\n"
                +"5.Show statements\n"
        );
        int choice = s.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter user name");
                String name = s.nextLine();
                System.out.println("Enter user id");
                long id = s.nextLong();
                bankOperations.addUser(id,name);
                System.out.println("User added successfully:");
            case 2:
                System.out.println("Enter accNo");
        }

    }
    public void addUser(long accNo,String name){
        bankUser b = new bankUser(accNo,name);
        accNoToNames.put(accNo,b);
    }
    public void deposit(Long accNo,int amount){
        for (Long l : accNoToNames.keySet()) {
            if(l.equals(accNo)){
                int currentBalance = accNoToNames.get(l).getBalance();
                currentBalance+=amount;
                accNoToNames.get(l).setBalance(currentBalance);
                System.out.println(amount+" deposited"+" current balance :"+accNoToNames.get(l).getBalance());
                accNoToNames.get(l).getStatements().add((getDateTime()+"  "+amount+" deposited by "+accNoToNames.get(l).getName()));
                accNoToStatements.put(accNo,accNoToNames.get(l).getStatements());

            }
        }
    }
    public void withdraw(Long accNo,int amount){
        for (Long l : accNoToNames.keySet()) {
            if(l.equals(accNo)){
                int currentBalance =  accNoToNames.get(l).getBalance();
                        if(currentBalance<amount){
                           System.out.println("Insufficient bank balance");
                       }
                       else{
                           currentBalance-=amount;
                           accNoToNames.get(l).setBalance(currentBalance);
                            System.out.println(amount+" withdrawed"+" current balance :"+accNoToNames.get(l).getBalance());
                            accNoToNames.get(l).getStatements().add(getDateTime()+"  "+amount+" withdrawed by "+accNoToNames.get(l).getName());
                            accNoToStatements.put(accNo,accNoToNames.get(l).getStatements());

                       }

            }

        }
    }
    public void checkBalance(long accNo){

        for (Long l : accNoToNames.keySet()) {
            if(l.equals(accNo)){
                System.out.println("Account Number: "+l+"\n"+" Name : "+accNoToNames.get(l).getName()+"\n"+"Balance: "+accNoToNames.get(l).getBalance());
            }

        }
    }
    public String getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
       return dtf.format(now);
    }
    public void showStament(long accNo){
        for (Long l : accNoToStatements.keySet()) {
            if(l.equals(accNo)){
                System.out.println(accNoToStatements.get(l));
                System.out.println();
            }
        }

    }


}
