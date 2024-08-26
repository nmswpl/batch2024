package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multiplex
    {
        private Map<String, ScreenDetails> screenToScreenDetails = new HashMap<>();

        public Multiplex()
        {
            screenToScreenDetails.put("screen1", new ScreenDetails(50));
            screenToScreenDetails.put("screen2", new ScreenDetails(75));
            screenToScreenDetails.put("screen3", new ScreenDetails(40));
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

        private void showAvailability(String screenName)
        {
            int availability = screenToScreenDetails.get(screenName).getAvailableSeatCount();
            System.out.println("For screenName " + screenName + " " + availability + " seats available");
        }

        private void bookTicket(String screenName, int noOfTickets)
        {
            ScreenDetails screenDetails = screenToScreenDetails.get(screenName);
            if (screenDetails.getAvailableSeatCount() >= noOfTickets)
            {
                System.out.println(noOfTickets + " tickets Booked. Seat Numbers are ::");
                for (int i = 1; i <= noOfTickets; i++)
                {
                    System.out.println(i + screenDetails.getBookedSeat());
                }
                screenDetails.bookSeats(noOfTickets);
            }
            else
                System.out.println(noOfTickets + " tickets not available for screen");
        }

    }






