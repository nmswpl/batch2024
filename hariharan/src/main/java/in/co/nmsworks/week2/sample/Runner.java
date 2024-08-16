package in.co.nmsworks.week2.sample;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        MapExample mapExample =new MapExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        Integer number = mapExample.searchName(name);

        if( number!= -1){
            System.out.println(" Name: "+ name+ " Number: "+number);
        }else {
            System.out.println(name + " is not present");
        }



    }
}
