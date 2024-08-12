package in.co.nmsworks.week2;

public class Training2 {
    public void printGrade(int mark){
        if(mark >= 90 || mark <= 100){
            System.out.println("Grade : S");
        }
        else if (mark >= 81 || mark <= 90){
            System.out.println("Grade: A");
        }
        else if (mark >= 71 || mark <= 80){
            System.out.println("Grade : B");
        }
        else if (mark >= 61 || mark <= 70){
            System.out.println("Grade : C");
        }
        else if (mark >= 51 || mark <= 60){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }
    }
}