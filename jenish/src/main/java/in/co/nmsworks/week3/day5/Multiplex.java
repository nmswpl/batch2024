package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplex {
    private List<Integer> ticketCountScreen1 = new ArrayList<>();
    private List<Integer> ticketCountScreen2 = new ArrayList<>();
    private List<Integer> ticketCountScreen3 = new ArrayList<>();
    private String screenName;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public List<Integer> getTicketCountScreen1() {
        return ticketCountScreen1;
    }

    public void setTicketCountScreen1(List<Integer> ticketCountScreen1) {
        this.ticketCountScreen1 = ticketCountScreen1;
    }

    public List<Integer> getTicketCountScreen2() {
        return ticketCountScreen2;
    }

    public void setTicketCountScreen2(List<Integer> ticketCountScreen2) {
        this.ticketCountScreen2 = ticketCountScreen2;
    }

    public List<Integer> getTicketCountScreen3() {
        return ticketCountScreen3;
    }

    public void setTicketCountScreen3(List<Integer> ticketCountScreen3) {
        this.ticketCountScreen3 = ticketCountScreen3;
    }

    public void ticketsCounter() {
        for (int i = 1; i <= 50; i++) {
            ticketCountScreen1.add(i);
        }
        for (int i = 1; i <= 75; i++) {
            ticketCountScreen2.add(i);
        }
        for (int i = 1; i <= 40; i++) {
            ticketCountScreen3.add(i);
        }
    }

    public void bookTicket(String screenName, int noOfTickets) {
        List<Integer> ticketList;
        if (screenName.equalsIgnoreCase("screen1")) {
            ticketList = ticketCountScreen1;
        } else if (screenName.equalsIgnoreCase("screen2")) {
            ticketList = ticketCountScreen2;
        } else if (screenName.equalsIgnoreCase("screen3")) {
            ticketList = ticketCountScreen3;
        } else {
            System.out.println("Invalid screen name.");
            return;
        }

        if (noOfTickets <= ticketList.size()) {
            List<Integer> bookedTickets = new ArrayList<>();
            for (int i = 0; i < noOfTickets; i++) {
                bookedTickets.add(ticketList.remove(0));
            }
            System.out.println("Available tickets: " + ticketList);
            System.out.println("Ticket numbers are: " + bookedTickets);
            System.out.println(noOfTickets + " Tickets booked");
        } else {
            System.out.println("Tickets unavailable!!");
        }
    }

    public void showAvailability(String screenName) {
        List<Integer> ticketList;
        if (screenName.equalsIgnoreCase("screen1")) {
            ticketList = ticketCountScreen1;
        } else if (screenName.equalsIgnoreCase("screen2")) {
            ticketList = ticketCountScreen2;
        } else if (screenName.equalsIgnoreCase("screen3")) {
            ticketList = ticketCountScreen3;
        } else {
            System.out.println("Invalid screen name.");
            return;
        }
        int availableTickets = ticketList.size();
        System.out.println("Available tickets in " + screenName + ": " + availableTickets);
    }

    public static void main(String[] args) {
        Multiplex mul = new Multiplex();
        mul.ticketsCounter();
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
                    System.out.print("Enter No Of Tickets :: ");
                    int noOfTickets = scanner.nextInt();
                    mul.bookTicket("screen" + screenNo, noOfTickets);
                    break;
                case 2:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3) {
                        System.err.println("Invalid screen number.");
                        break;
                    }
                    mul.showAvailability("screen" + screenNo);
                    break;
                case 3:
                    System.out.println("Thank You for visiting Multiplex");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option !!");
            }
        }
    }
}