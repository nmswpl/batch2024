package in.co.nmsworks.week3.assessment;

public class Runner {
    public static void main(String[] args) {

        //Question 1
       TestExercise1 testExersice1 = new TestExercise1();

       //Question  2
        TestExersice2 testExersice2 = new TestExersice2();

        //Question 3
        TestExersice3 testExersice3 = new TestExersice3();


        //Question 4

        TutionCenter chennaiTutionCenter = new TutionCenter();
        chennaiTutionCenter.setBranchCode("CH01");
        chennaiTutionCenter.setBranchName("Chennai");
        chennaiTutionCenter.setSubject(new String[] {"Pysics","Chemistry","Biology","Maths","Hindi"});

        TutionCenter salemTutionCenter = new TutionCenter();
        salemTutionCenter.setBranchCode("SA01");
        salemTutionCenter.setBranchName("Salem");
        salemTutionCenter.setSubject(new String[] {"Pysics","Chemistry","Biology","Maths"});

        TutionCenter maduraiTutionCenter = new TutionCenter();
        maduraiTutionCenter.setBranchCode("MD01");
        maduraiTutionCenter.setBranchName("Madurai");
        maduraiTutionCenter.setSubject(new String[] {"Pysics","Chemistry","Biology","Maths"});
        maduraiTutionCenter.setNumberOfStudents(50);

        System.out.println(maduraiTutionCenter.toString());
    }
}
