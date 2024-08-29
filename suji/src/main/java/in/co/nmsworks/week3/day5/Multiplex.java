package in.co.nmsworks.week3.day5;
import java.util.*;
public class Multiplex {
    private String screenName;
    private int totalSeats;
    private int availableSeats;
    private boolean[] bookedSeats;
    int noOfTickets;

    public Multiplex(String screenName, int totalSeats) {
        this.screenName = screenName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.bookedSeats = new boolean[totalSeats];
    }

    public String getScreenName() {
        return screenName;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }


        public void bookTickets(int noOfTickets)
        {

            if (noOfTickets > availableSeats) {
                System.out.println("Sorry, there are not enough available seats.");
                return;
            }


            int startSeat = totalSeats - availableSeats;
            int endSeat = startSeat + noOfTickets - 1;

            for (int i = startSeat; i <= endSeat; i++)
            {
                if (bookedSeats[i])
                {
                    System.out.println("Seat " + (i + 1) + " is already booked.");
                    return;
                }
                bookedSeats[i] = true;
            }

            availableSeats -= noOfTickets;
            System.out.println("Tickets have been booked from seat numbers " + (startSeat + 1) + " to " + (endSeat + 1));
        }

        public void showAvailability() {
            System.out.println("There are " + availableSeats + " seats available on screen " + screenName);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the screen name: ");
            String screenName = scanner.nextLine();

            System.out.print("Enter the totalseats: ");
            int totalSeats = scanner.nextInt();


            Multiplex mul = new Multiplex(screenName, totalSeats);

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
                        }
                        System.out.print("Enter the number of tickets to book :: ");
                        int noOfTickets = scanner.nextInt();
                        mul.bookTickets(noOfTickets);
                        break;
                    case 2:
                        System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                         screenNo = scanner.nextInt();
                        if (screenNo < 1 || screenNo > 3) {
                            System.err.println("Invalid screen number.");
                        }
                        mul.showAvailability();
                        break;
                    case 3:
                        System.out.println("Thank You for visiting Multiplex");
                        System.out.println("Quit");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }