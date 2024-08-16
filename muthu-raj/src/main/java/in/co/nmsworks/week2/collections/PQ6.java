package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
6. Write a Java program to remove the third element from an array list.
 */
public class PQ6 {

    public void remove3rdElement(){
        System.out.println("Q6.");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Naruto");
        characters.add("Eren Yeager");
        characters.add("Sasuke");
        characters.add("Levi");
        characters.add("Ichigo");

        System.out.println(characters);
        System.out.println("Enter the pos to remove::");
        int pos = sc.nextInt();
        characters.remove(pos);
        System.out.println("Element removed");
        System.out.println(characters);
    }

}
