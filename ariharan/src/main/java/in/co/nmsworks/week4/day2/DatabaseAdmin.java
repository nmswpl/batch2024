package in.co.nmsworks.week4.day2;

import java.util.Scanner;

public class DatabaseAdmin {
    public static void main( String[] args ){
        Scanner scanner=new Scanner(System.in);
        StudentDataBase stdb=new StudentDataBase();
//        System.out.println("enter the name of the student::");
//        String name=scanner.nextLine();
//        System.out.println("enter the maths mark::");
//        int mathsMark=scanner.nextInt();
//        System.out.println("enter the english mark::");
//        int engMark=scanner.nextInt();
//        System.out.println("enter the science mark::");
//        int scienceMark=scanner.nextInt();
//        System.out.println("enter the history mark::");
//        int historyMark=scanner.nextInt();
//        stdb.addStudent(name,mathsMark,engMark,scienceMark,historyMark);
        stdb.removeStudentsBasedOnMarks("science",35);
    }
}
