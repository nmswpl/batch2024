package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.checkVehicles();
        Question2 q2 = new Question2();
        int[] arr = {24, 23, 4, 7, 9, 21, 14};
        q2.printEvenElements(arr);

        Question3 q3 = new Question3();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        q3.computePrimes();
        q3.primeOrNot(num);

        TutionCenter chennaiCenter = new TutionCenter("Chennai","CH01");
        Map<String, Integer> chennaiCenterSubjects = new HashMap<>();
        chennaiCenterSubjects.put("Physics", 30);
        chennaiCenterSubjects.put("Maths", 40);
        chennaiCenterSubjects.put("Chemistry", 40);
        chennaiCenterSubjects.put("Biology", 50);
        chennaiCenterSubjects.put("Hindi", 20);
        chennaiCenter.setSubjectsToNoOfStudents(chennaiCenterSubjects);

        TutionCenter salemCenter = new TutionCenter("Salem", "SA01");
        Map<String, Integer> salemCenterSubjects = new HashMap<>();
        salemCenterSubjects.put("Physics", 30);
        salemCenterSubjects.put("Maths", 40);
        salemCenterSubjects.put("Chemistry", 40);
        salemCenterSubjects.put("Biology", 50);
        salemCenterSubjects.put("Hindi", 20);
        salemCenter.setSubjectsToNoOfStudents(salemCenterSubjects);

        TutionCenter maduraiCenter = new TutionCenter("Madurai", "MD01");
        Map<String, Integer> maduraiCenterSubjects = new HashMap<>();
        maduraiCenterSubjects.put("Physics", 30);
        maduraiCenterSubjects.put("Maths", 40);
        maduraiCenterSubjects.put("Chemistry", 40);
        maduraiCenterSubjects.put("Biology", 50);
        maduraiCenterSubjects.put("Hindi", 20);
        maduraiCenter.setSubjectsToNoOfStudents(maduraiCenterSubjects);

        System.out.println(chennaiCenter);
        System.out.println(chennaiCenter.getSubjectsToNoOfStudents().get("Maths"));
        System.out.println(chennaiCenter.totalNoOfStudents("Chennai"));
    }
}
