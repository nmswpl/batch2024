package in.co.nmsworks.week2.practice.collections;

//Write a Java program to join two array lists.

import java.util.ArrayList;

public class PQ11 {
    public static void main(String[] args) {
        ArrayList<String> flower=new ArrayList<>();
        System.out.println("1st Array");
        flower.add("Hibicus");
        flower.add("Lotus");
        flower.add("Jasmine");

        for (int i = 0; i < flower.size(); i++) {
            System.out.println(flower.get(i));
        }


        System.out.println("2nd Array");
        ArrayList<String> plant=new ArrayList<>(flower);
        plant.add("Mango");
        plant.add("Water Lily");

        for (int i = 0; i < plant.size(); i++) {
            System.out.println(plant.get(i));
        }
    }
}
