package in.co.nmsworks.week3.day5;

/*4. Write a program that displays a menu
to the user and keeps showing the menu until
the user chooses to exit.
	1. Choose Menu A
	2. Choose Menu B
	3. Choose Menu C
	4. Exit */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu me = new Menu();
        int num = me.display();
        me.menu(num);
    }
    public int display(){
        System.out.println("1. Choose Menu A");
        System.out.println("2. Choose Menu B");
        System.out.println("3. Choose Menu C");
        System.out.println("4. Exit");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }
    public void menu(int n){
        switch (n){
            case 1:
            case 2:
            case 3:
                display();
                break;
            case 4:
                break;
        }
    }
}
