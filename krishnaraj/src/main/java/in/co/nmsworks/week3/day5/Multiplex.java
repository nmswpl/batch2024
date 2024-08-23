package in.co.nmsworks.week3.day5;

import java.util.Scanner;

public class Multiplex {
    int screen1 = 50;
    int screen2 = 75;
    int screen3 = 40;
    int screen1Count = 0;
    int screen2Count = 0;
    int screen3Count = 0;

    public void bookTicket(String screenName, int ticketCount) {
        switch (screenName) {
            case "screen1": {
                int avaiability = availability(screenName);
                System.out.println("screen1 : "+avaiability);
                if (avaiability <= ticketCount) {
                    System.out.println("Ticket is Not Available");
                } else {
                    System.out.println("The ticket is booked");
                    for (int i = 1; i <= ticketCount; i++) {
                        System.out.println(screen1Count+i);
                    }
                    screen1Count += ticketCount;
                }
                break;
            }
            case "screen2": {
                int avaiability = availability(screenName);
                System.out.println("screen2 : "+avaiability);
                if (avaiability <= ticketCount) {
                    System.out.println("Ticket is Not Available");
                    break;
                } else {
                    System.out.println("The ticket is booked");
                    for (int i = 1; i <= ticketCount; i++) {
                        System.out.println(screen2Count+i);
                    }
                    screen2Count += ticketCount;
                }
                break;
            }
            case "screen3": {
                int avaiability = availability(screenName);
                System.out.println("screen3 : "+avaiability);
                if (avaiability <= ticketCount) {
                    System.out.println("Ticket is Not Available");
                    break;
                } else {
                    System.out.println("The ticket is booked");
                    for (int i = 1; i <= ticketCount; i++) {
                        System.out.println(screen3Count+i);
                    }
                    screen3Count += ticketCount;
                }
                break;
            }
            default:
                System.out.println("There is some error");
        }
    }

    public int availability(String screenName) {
        int availability = 0;
        switch (screenName) {
            case "screen1": {
                availability = screen1 - screen1Count;
                break;
            }
            case "screen2": {
                availability = screen2 - screen2Count;
                break;
            }
            case "screen3": {
                availability = screen3 - screen3Count;
                break;
            }
        }
        return availability;
    }
    public void showAvailability(String screenName) {
        switch (screenName) {
            case "screen1": {
                int availability = screen1 - screen1Count;
                System.out.println("The availability : " +availability);
                break;
            }
            case "screen2": {
                int availability = screen2 - screen2Count;
                System.out.println("The availability : " +availability);
                break;
            }
            case "screen3": {
                int availability = screen3 - screen3Count;
                System.out.println("The availability : " +availability);
            }
        }
    }
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
}
