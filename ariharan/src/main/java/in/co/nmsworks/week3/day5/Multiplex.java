package in.co.nmsworks.week3.day5;

import java.util.*;

public class Multiplex {
    List<String> screen1Tickets=new ArrayList<>();
    List<String> screen2Tickets=new ArrayList<>();
    List<String> screen3Tickets=new ArrayList<>();
    public static void main(String[] args)
    {
        Multiplex mul = new Multiplex();

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n***********************************************\n Welcome to Multiplex");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Availability");
            System.out.println("3. Quit \n");
            System.out.print("Enter Your Choice (1/2/3) :: ");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    int screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3)
                    {
                        System.err.println("Invalid screen number.");
                        break;
                    }

                    System.out.print("Enter No Of Tickets ::");
                    int noOfTickets = scanner.nextInt();

                    mul.bookTickets("screen"+screenNo, noOfTickets);
                    break;

                case 2:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3)
                    {
                        System.out.println("Invalid screen number.");
                        break;
                    }

                    mul.showAvailability("screen"+screenNo);
                    break;

                case 3:
                    System.out.println("Thank You for visiting Multiplex");
                    return;

                default:
                    System.out.println("Invalid Option !!");
            }
        }

    }
    public Multiplex(){
        for (int i = 1; i <=50 ; i++) {
            screen1Tickets.add("seat"+i);
        }
        for (int i = 1; i <=75 ; i++) {
            screen2Tickets.add("seat"+i);
        }
        for (int i = 1; i <=40 ; i++) {
            screen3Tickets.add("seat"+i);
        }
    }
    public void bookTickets(String screenName,int ticket){
        if(screenName.equalsIgnoreCase("screen1")){
            if (ticket<=screen1Tickets.size()){
                System.out.println("yours seats are::");
                for (int i = 0; i <ticket ; i++) {
                    System.out.println(screen1Tickets.get(0));
                    screen1Tickets.remove(0);
                }

            }
            else {
                showAvailability(screenName);
            }


        } else if (screenName.equalsIgnoreCase("screen2")) {
            if (ticket<=screen2Tickets.size()){
                System.out.println("yours seats are::");
                for (int i = 0; i <ticket ; i++) {
                    System.out.println(screen2Tickets.get(0));
                    screen2Tickets.remove(0);
                }
            }
            else {
                showAvailability(screenName);
            }

        } else if (screenName.equalsIgnoreCase("screen3")) {
            if (ticket<=screen3Tickets.size()){
                System.out.println("your tickets are::");
                for (int i = 0; i <ticket ; i++) {
                    System.out.println(screen3Tickets.get(0));
                    screen3Tickets.remove(0);
                }
            }
            else {
                showAvailability(screenName);
            }

        }
    }
    public void showAvailability(String screen){
        if (screen.equalsIgnoreCase("screen1"))
            System.out.println("In screen1 ,the available tickets is::"+screen1Tickets.size());
        else if (screen.equalsIgnoreCase("screen2"))
            System.out.println("In screen2 ,the available tickets is::"+screen2Tickets.size());
        else if (screen.equalsIgnoreCase("screen3"))
            System.out.println("In screen3 ,the available tickets is::"+screen3Tickets.size());
    }
}

