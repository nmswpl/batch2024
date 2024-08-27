package in.co.nmsworks.week3.day5.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManageStudents {

    private static Map<Integer, Stuudent> students = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("1. Search Student\n" +
                    "2. Add Student\n" +
                    "3. Delete Student\n" +
                    "4. Exit ");
            System.out.println("Enter your choice :: ");
            choice =  sc.nextInt();

            switch(choice)
            {
                case 1:
                    searchStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                default:
                    System.out.println("Thank You!");
                    break;
            }
        }while(choice != 4);
    }

    private static void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id :: ");
        int id = sc.nextInt();
        if(!checkID(id))
        {
            System.out.println("The student doesn't exist");
            return;
        }

        System.out.println("Confirm deleting (y/n) ?" );
        sc.nextLine();
        String del = sc.nextLine();

        if("y".equalsIgnoreCase(del))
        {
            students.remove(id);
            System.out.println("Student Deleted!");
        }

    }

    private static void addStudent() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id :: ");
        int id = sc.nextInt();
        if(checkID(id))
        {
            System.out.println("The ID already exist!");
            return;
        }
        System.out.println("Enter Student name :: ");
        sc.nextLine();
        String name = sc.nextLine();
        Stuudent s = new Stuudent();
        s.setId(id);
        s.setName(name);
        students.put(id,s);
        System.out.println("Student Added!");
    }

    private static boolean checkID(int id) {

        if(students.containsKey(id))
        {
            return true;
        }
        return false;
    }

    private static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id :: ");
        int id = sc.nextInt();
        if(!checkID(id))
        {
            System.out.println("The Student not Found!");
            return;
        }

        System.out.println("Student details :: " + students.get(id));

    }
}
