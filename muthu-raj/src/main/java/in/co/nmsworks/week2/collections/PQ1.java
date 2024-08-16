package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class PQ1 {
    public void addColors() {

        System.out.println("Q1.");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many colors do you want to add? ");
        int num = sc.nextInt();
        ArrayList<String> colors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter color " + i + "::");
            colors.add(sc.next());
        }

        System.out.println("Elements of colors::");
        for (String color : colors) {

            System.out.println(color);
        }
    }
}
