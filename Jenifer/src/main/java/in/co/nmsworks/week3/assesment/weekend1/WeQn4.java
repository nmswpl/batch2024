package in.co.nmsworks.week3.assesment.weekend1;
/*Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
	1. Choose Menu A
	2. Choose Menu B
	3. Choose Menu C
	4. Exit
 */

import java.util.Scanner;

public class WeQn4 {
    public  void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu Options:");
            System.out.println("1. Choose menu A");
            System.out.println("2. Choose menu B");
            System.out.println("3. Choose menu C");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Menu A.");
                    break;
                case 2:
                    System.out.println("Menu B.");
                    break;
                case 3:
                    System.out.println("Menu C.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (option != 4);
    }
}
