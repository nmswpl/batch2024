package in.co.nmsworks.week3.day5;

import java.util.Scanner;

public class Multiplex {

    final int totalCapacityScreen1 = 50;
    final int totalCapacityScreen2 = 75;
    final int totalCapacityScreen3 = 40;

    private int crntSeatCount1 = totalCapacityScreen1;
    private int crntSeatCount2 = totalCapacityScreen2;
    private int crntSeatCount3 = totalCapacityScreen3;

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

                    mul.bookTicket("screen"+screenNo, noOfTickets);
                    break;

                case 2:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3)
                    {
                        System.out.println("Invalid screen number.");
                        break;
                    }

                    System.out.println( "The Available seats in " + screenNo + " are :: "+ mul.showAvailability("screen"+screenNo));
                    break;

                case 3:
                    System.out.println("Thank You for visiting Multiplex");
                    return;

                default:
                    System.out.println("Invalid Option !!");
            }
        }

    }

    private void bookTicket(String screen , int askedSeats)
    {
        if (askedSeats <= showAvailability(screen))
        {
            if("screen1".equalsIgnoreCase(screen))
            {   int ticketNum = (totalCapacityScreen1 - crntSeatCount1) + 1;
                for (int i = 1 ; i <= askedSeats; i++) {

                    System.out.print("S1-T" + ticketNum++ + " booked! ");
                    crntSeatCount1--;
                }
            }

            else if ( "screen2".equalsIgnoreCase(screen))
            {
                int ticketNum = (totalCapacityScreen2 - crntSeatCount2) + 1;
                for (int i = 1 ; i <= askedSeats; i++) {

                    System.out.print("S2-T" + ticketNum++ + " booked! ");
                    crntSeatCount2--;
                }
            }

            else if ("screen3".equalsIgnoreCase(screen))
            {
                int ticketNum = (totalCapacityScreen3 - crntSeatCount3) + 1;
                for (int i = 1 ; i <= askedSeats; i++) {

                    System.out.print("S3-T" + ticketNum++ + " booked! ");
                    crntSeatCount3--;
                }
            }
        }

        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("The Available seats of " + screen + " is " + showAvailability(screen));
            System.out.println("Do you want to continue booking(y/n)?");
            String ans = sc.next();
            if ( "y".equalsIgnoreCase(ans))
            {
                bookTicket(screen, showAvailability(screen));
            }
            else
            {
                System.out.println("Thanks for using our service!");
            }
        }
    }

    private int showAvailability(String screen)
    {
        if("screen1".equalsIgnoreCase(screen))
        {
            return crntSeatCount1;
        }
        if ("screen2".equalsIgnoreCase(screen))
        {
            return crntSeatCount2;
        }
        if ( "screen3".equalsIgnoreCase(screen))
        {
            return crntSeatCount3;
        }
        return 0;
    }
}
