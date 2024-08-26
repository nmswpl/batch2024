package in.co.nmsworks.week3.Day5;

import java.util.*;

public class Multiplex {

    Map<String, ScreenDetails> screenOption = new HashMap<>();
    private in.co.nmsworks.week3.Day5.ScreenDetails[] ScreenDetails;

    public void setValuesToScreenOption() {

        screenOption.put("screen1", ScreenDetails[50]);
        screenOption.put("screen2", ScreenDetails[75]);
        screenOption.put("screen3", ScreenDetails[40]);

    }

    private void showAvailability(String screenName) {
        int availability = screenOption.get(screenName).getAvailableCount();
        System.out.println("For screenName " + screenName + " " + availability + " seats available");
    }

    private void bookTicket(String screenName, int noOfTickets) {
        ScreenDetails screenDetails = screenOption.get(screenName);
        if (noOfTickets <= screenDetails.getAvailableCount()) {
            System.out.println(noOfTickets + " tickets Booked. Seat Numbers are ::");
            for (int i = 1; i <= noOfTickets; i++) {
                System.out.println(i + screenDetails.getBookedSeat());
            }
            screenDetails.bookSeats(noOfTickets);
        } else
            System.out.println(noOfTickets + " tickets not available for screen");
    }

    public static void main(String[] args) {
        Multiplex mul = new Multiplex();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n***********************************************\n Welcome to Multiplex");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Availability");
            System.out.println("3. Quit \n");
            System.out.print("Enter Your Choice (1/2/3) :: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    int screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3) {
                        System.err.println("Invalid screen number.");
                        break;
                    }

                    System.out.print("Enter No Of Tickets ::");
                    int noOfTickets = scanner.nextInt();

                    mul.bookTicket("screen" + screenNo, noOfTickets);
                    break;

                case 2:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3) {
                        System.out.println("Invalid screen number.");
                        break;
                    }

                    mul.showAvailability("screen" + screenNo);
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
