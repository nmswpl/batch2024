package in.co.nmsworks.week2.collections;

import java.util.*;

/*
12.Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class PQ12 {
    public void addColors() {

        System.out.println("Q12.");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many colors do you want to add? ");
        int num = sc.nextInt();
        Set<String> colors = new HashSet<>();
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
