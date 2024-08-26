package in.co.nmsworks.week3.assessment.day6;
import java.util.Scanner;

public class PracticeQuestion4 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Choose Menu A");
                System.out.println("2. Choose Menu B");
                System.out.println("3. Choose Menu C");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");


                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("You chose Menu A");
                        break;
                    case 2:
                        System.out.println("You chose Menu B");
                        break;
                    case 3:
                        System.out.println("You chose Menu C");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }

            } while (choice != 4);

            scanner.close();
        }
    }

