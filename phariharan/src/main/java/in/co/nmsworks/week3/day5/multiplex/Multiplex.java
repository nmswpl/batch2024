package in.co.nmsworks.week3.day5.multiplex;

import java.util.*;

public class Multiplex {
    private static final Map<String, Screen> screenMap = generateScreenMap();

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

    private static Map<String, Screen> generateScreenMap() {
        Map<String, Screen> screenMap = new HashMap<>();
        screenMap.put("screen1", new Screen(50));
        screenMap.put("screen2", new Screen(75));
        screenMap.put("screen3", new Screen(40));

        return screenMap;
    }

    private void bookTicket(String screen, int seat) {
        Screen theatre = screenMap.get(screen);
        int count = theatre.getAvailableSeats();
        if (count >= seat) {
            int startWith = theatre.getSeatStarts();
            System.out.println(startWith);
            System.out.print("Your Seat number : ");
            for (int i = startWith; i < startWith + seat; i++) {
                theatre.setArrayValues(i);
                System.out.print(" " + (i+1));
            }
            theatre.setSeatStarts(startWith + seat);

            System.out.println("\nTickets Booked Successfully !!");
        }
        else {
            System.out.println("Seats are not available");
        }
    }

    private void showAvailability(String screen) {
        Screen theatre = screenMap.get(screen);
        System.out.println("Available Seat Count : " + theatre.getAvailableSeats());
    }
}