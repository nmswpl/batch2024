package in.co.nmsworks.week3.assignment.Day5;

import java.util.Scanner;

public class Multiplex {
    String screen1 = "screen1";
    String screen2 = "screen2";
    String screen3 = "screen3";
    int s1Count = 50;
    int s2Count = 70;
    int s3Count = 40;
    int s1BookedCount;
    int s2BookedCount;
    int s3BookedCount;


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

    public void bookTicket(String screenName, int ticketCount) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        if (screenName.equals(screen1)) {
            if (ticketCount > s1Count) {
                System.out.println("Seats not available");
            } else {
                for (int i = s1BookedCount + 1; i <= ticketCount + count1; i++) {
                    System.out.println(i);
                    s1BookedCount++;
                }
                count1 = count1 + ticketCount;
                System.out.println(count1);
                System.out.println("booked seats : " + s1BookedCount);
                System.out.println("Remaining seats :" + (s1Count - s1BookedCount));
            }
        }
        s1Count = s1Count - s1BookedCount;
        if (screenName.equals(screen2)) {
            if (ticketCount > s2Count) {
                System.out.println("Seats not available");
            } else {
                for (int i = s2BookedCount + 1; i <= ticketCount + count2; i++) {
                    System.out.println(i);
                    s2BookedCount++;
                }
                count2 = count2 + ticketCount;
                System.out.println(count2);
                System.out.println("booked seats: " + s2BookedCount);
                System.out.println("Remaining seats : " + (s2Count - s2BookedCount));
            }
        }
        s2Count = s2Count - s2BookedCount;
        if (screenName.equals(screen3)) {
            if (ticketCount > s3Count) {
                System.out.println("Seats not available");
            } else {
                for (int i = s3BookedCount + 1; i <= ticketCount + count3; i++) {
                    System.out.println(i);
                    s3BookedCount++;
                }
                count3 = count3 + ticketCount;
                System.out.println(count3);
                System.out.println("booked seats: " + s3BookedCount);
                System.out.println("Remaining seats  : " + s3Count);
            }
        }s3Count = s3Count - s3BookedCount;
    }


    public void showAvailability(String screenName){
        if(screenName.equals(screen1)){
            System.out.println("Seats available : " +s1Count);
        } else if (screenName.equals(screen2)) {
            System.out.println("Seats available : " +s2Count);
        } else if (screenName.equals(screen3)){
            System.out.println("Seats available : " +s3Count);
        }
    }
}

