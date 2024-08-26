package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multiplex {
    Map<String, Integer> noOfSeatsInScreens = new HashMap<>();

    public void bookTicket(String screenName, int noOfTickets) {
        noOfSeatsInScreens.put("screen1", 50);
        noOfSeatsInScreens.put("screen2", 75);
        noOfSeatsInScreens.put("screen3", 40);
        Integer screenDetails = noOfSeatsInScreens.get(screenName);
        if (ScreenDetails.getAvailableSeatCount() >= noOfTickets) {
            int i = 1;
            for (; i <= i + noOfTickets; i++) {
                System.out.println("Tickets available " + noOfTickets + i);
            }
        } else {
            System.out.println("Seats are not available");
        }
    }

        public void showAvailability (String screenName){
            int availableSeats = noOfSeatsInScreens.get(screenName);
            System.out.println("Number of seats available = " + availableSeats);
        }


        public static void main (String[]args){
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
