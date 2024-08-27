package in.co.nmsworks.week4.day2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BankingSystem bankingSystem=new BankingSystem();
        BankUser user1=new BankUser(1,"ari",1500);
        BankUser user2=new BankUser(2,"abi",400);
        BankUser user3=new BankUser(3,"ariharan",500);
        BankUser user4=new BankUser(4,"abishiek",1000);
        BankUser user5=new BankUser(5,"abinash",5000);
        bankingSystem.idAndUser.put(1,user1);
        bankingSystem.idAndUser.put(2,user2);
        bankingSystem.idAndUser.put(3,user3);
        bankingSystem.idAndUser.put(4,user4);
        bankingSystem.idAndUser.put(5,user5);
        int choice;
        do {
            System.out.print("\n\nChoose function \n\t 1. add a new user\n\t 2.deposit\n\t 3.withdrawal\n\t4.check balance \n\t5.show statement \n\t6.quit\nEnter Choice (1/2/3/4/5) ::");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    bankingSystem.addUser();
                    break;

                case 2:
                    System.out.println("enter your account number::");
                    int accNo=scanner.nextInt();
                    bankingSystem.depositer(accNo);
                    break;
                case 3:
                    System.out.println("enter your account number::");
                    accNo=scanner.nextInt();
                    bankingSystem.withDrawal(accNo);
                    break;
                case 4:
                    System.out.println("enter your account number::");
                    accNo=scanner.nextInt();
                    bankingSystem.checkBalance(accNo);
                    break;
                case 5:
                    System.out.println("enter your account number::");
                    accNo=scanner.nextInt();
                    bankingSystem.showStatement(accNo);
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }

        }while(choice!=6);

    }
}
