package in.co.nmsworks.week3.day5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multiplex {


    int i =0;
    int seatBookedForScree1 =0;
    int seatBookedForScree2 =0;
    int seatBookedForScree3 =0;
    Map<Integer,Integer> screenToTicket = new HashMap<>();
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
                    mul.bookTicket(screenNo, noOfTickets);
                    break;
                case 2:
                    System.out.print("\n\nChoose Screen \n\t 1. screen1\n\t 2. screen2\n\t 3. screen3\nEnter Choice (1/2/3) :: ");
                    screenNo = scanner.nextInt();
                    if (screenNo < 1 || screenNo > 3)
                    {
                        System.out.println("Invalid screen number.");
                        break;
                    }
                    mul.showAvailability(screenNo);
                    break;
                case 3:
                    System.out.println("Thank You for visiting Multiplex");
                    return;
                default:
                    System.out.println("Invalid Option !!");
            }
        }
    }

    public Map<Integer,Integer> setDetails(){


        if(i <1){
            screenToTicket.put(1,50);
            screenToTicket.put(2,75);
            screenToTicket.put(3,40);
            i++;
        }
            return screenToTicket;
    }



    public void bookTicket(Integer screen, Integer noOfTicket){

        if(setDetails().get(screen) > noOfTicket){
            int avilableTicket =setDetails().get(screen);
            setDetails().put(screen, avilableTicket-noOfTicket);

            if(screen ==1) {
                for (int i = seatBookedForScree1 + 1; i <= seatBookedForScree1+noOfTicket; i++) {
                    System.out.println("Seat No" + i + "booked");
                }
                seatBookedForScree1 += noOfTicket;
            }
            if(screen ==2) {
                for (int i = seatBookedForScree2 + 1; i <= seatBookedForScree2+noOfTicket; i++) {
                    System.out.println("Seat No" + i + "booked");
                }
                seatBookedForScree2 += noOfTicket;
            }if(screen ==3) {
                for (int i = seatBookedForScree3 + 1; i <= seatBookedForScree3+noOfTicket; i++) {
                    System.out.println("Seat No" + i + "booked");
                }
                seatBookedForScree3 += noOfTicket;
            }
        }else{
            System.out.println("Seats Not avilabale");
        }
    }

    public void showAvailability(Integer screen){
        System.out.println(setDetails().get(screen)+ " seats are avilabale");
    }


}
