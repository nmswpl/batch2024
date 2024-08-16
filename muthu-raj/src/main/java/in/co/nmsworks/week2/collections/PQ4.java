package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
4. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class PQ4 {
    public void retrieveUsingIndex(){
        System.out.println("Q4.");
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Naruto");
        characters.add("Eren Yeager");
        characters.add("Sasuke");
        characters.add("Levi");
        characters.add("Ichigo");


        System.out.println(characters);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index:: ");
        int ind = sc.nextInt();

        System.out.println(characters.get(ind));
    }
}
