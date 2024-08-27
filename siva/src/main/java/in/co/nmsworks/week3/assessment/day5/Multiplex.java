package in.co.nmsworks.week3.assessment.day5;


import java.util.Scanner;

public class Multiplex {
    int screen1seats = 50;
    int screen2seats = 75;
    int screen3seats = 40;
    int screen1Count = 0;
    int screen2Count = 0;
    int screen3Count = 0;
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

    public void bookTicket(String screen, int ticketCount) {
        switch (screen) {
            case "screen1": {
                int avaiability = availability(screen);
                System.out.println("screen1 : "+avaiability);
                if (avaiability < ticketCount) {
                    System.out.println("Ticket  Not Available");
                } else {
                    System.out.println(ticketCount+" ticket is booked");
                    screen1Count += ticketCount;
                }
                break;
            }
            case "screen2": {
                int avaiability = availability(screen);
                System.out.println("screen2 : "+avaiability);
                if (avaiability < ticketCount) {
                    System.out.println("Ticket  Not Available");
                } else {
                    System.out.println(ticketCount+" ticket is booked");
                    screen2Count += ticketCount;
                }
                break;
            }
            case "screen3": {
                int avaiability = availability(screen);
                System.out.println("screen3 : "+avaiability);
                if (avaiability < ticketCount) {
                    System.out.println("Ticket  Not Available");
                } else {
                    System.out.println(ticketCount+" ticket is booked");
                    screen3Count += ticketCount;
                }
                break;
            }
            default:
                System.out.println("Ticket not available");
        }
    }

    public int availability(String screenName) {
        int availability = 0;
        switch (screenName) {
            case "screen1": {
                availability = screen1seats - screen1Count;
                break;
            }
            case "screen2": {
                availability = screen2seats - screen2Count;
                break;
            }
            case "screen3": {
                availability = screen3seats - screen3Count;
                break;
            }
        }
        return availability;
    }
    public void showAvailability(String screenName) {
        switch (screenName) {
            case "scree1": {
                int availability = screen1seats - screen1Count;
                System.out.println("The availability : " +availability);
                break;
            }
            case "screen2": {
                int availability = screen2seats - screen2Count;
                System.out.println("The availability : " +availability);
                break;
            }
            case "screen3": {
                int availability = screen3seats - screen3Count;
                System.out.println("The availability : " +availability);
            }
        }
    }

}

