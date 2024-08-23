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


    public void ticketsCounter(){
        for (int i = 1; i <= 50 ; i++) {
            this.ticketCountScreen1.add(i);
        }
        for (int i = 1; i <= 75 ; i++) {
            this.ticketCountScreen2.add(i);
        }
        for (int i = 1; i <= 40 ; i++) {
            this.ticketCountScreen3.add(i);
        }
    }

    public void bookTicket(String screenName, int noOfTickets){
        if(screenName.equalsIgnoreCase("screen1")) {
            if (noOfTickets <= ticketCountScreen1.size()) {
                List<Integer> bookedTickets = new ArrayList<>();
                for (int i = ticketCountScreen1.get(0); i <= noOfTickets; i++) {
                    int bookedSeats = ticketCountScreen1.remove(i);
                    bookedTickets.add(bookedSeats);
                }
            System.out.println(ticketCountScreen1);
            System.out.println("Ticket numbers are : " + bookedTickets);
            System.out.println(noOfTickets + " Tickets booked");
            }
            else {
                System.out.println("Tickets unavailable!!");
            }
        }
        else if(screenName.equalsIgnoreCase("screen2")){
            if(noOfTickets <= ticketCountScreen2.size()) {
                List<Integer> bookedTickets = new ArrayList<>();
                for (int i = ticketCountScreen2.get(0); i <= noOfTickets; i++) {
                    int bookedSeats = ticketCountScreen2.remove(i);
                    bookedTickets.add(bookedSeats);
                }
                System.out.println(ticketCountScreen2);
                System.out.println("Ticket numbers are : " + bookedTickets);
                System.out.println(noOfTickets + " Tickets booked");
            }
            else {
                System.out.println("Tickets unavailable!!");
            }
        }
        else if(screenName.equalsIgnoreCase("screen3")){
            if(noOfTickets <= ticketCountScreen3.size()) {
                List<Integer> bookedTickets = new ArrayList<>();
                for (int i = ticketCountScreen3.get(0); i <= noOfTickets; i++) {
                    int bookedSeats = ticketCountScreen3.remove(i);
                    bookedTickets.add(bookedSeats);
                }
                System.out.println(ticketCountScreen3);
                System.out.println("Ticket numbers are : " + bookedTickets);
                System.out.println(noOfTickets + " Tickets booked");
            }
            else {
                System.out.println("Tickets unavailable!!");
            }
        }
    }

    public void showAvailability(String screenName) {
        if (screenName.equalsIgnoreCase("screen1")) {
            int availableTickets = ticketCountScreen1.size();
            System.out.println("Available tickets in screen1: " + availableTickets);
        } else if (screenName.equalsIgnoreCase("screen2")) {
            int availableTickets = ticketCountScreen2.size();
            System.out.println("Available tickets in screen2: " + availableTickets);
        } else if (screenName.equalsIgnoreCase("screen3")) {
            int availableTickets = ticketCountScreen3.size();
            System.out.println("Available tickets in screen3: " + availableTickets);
        }
    }

    public static void main(String[] args)
    {
        Multiplex mul = new Multiplex();
        mul.ticketsCounter();
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
