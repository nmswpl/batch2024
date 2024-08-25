package in.co.nmsworks.week3.practicequestions;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Students
{
    static int count =21;
    private String name;
    private String grade;
    static List<Students> studentsList=new ArrayList<>();
    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public  void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return "Students [" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ']';
    }

   public Students(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public static void addStudents(String[]stud) throws SQLException       // using JDBC to add values
    {

       try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
        PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO student values(?,?,?)" ))
         {
        preparedStatement.setString(1, stud[0]);
        preparedStatement.setString(2, stud[1]);
        preparedStatement.setInt(3, Integer.parseInt(String.valueOf(stud[2])));
        count+=1;
        int row = preparedStatement.executeUpdate();
        System.out.println("Rows affected :: " + row);
    }
        catch (SQLException ex)
    {
        throw new RuntimeException(ex);
    }
}
 public static void printStudentsDetailsUsingMysql() throws SQLException            //using JDBC TO GET AND PRINT DETAILS
 {
     List<Students> listOfStud=new ArrayList<>();

     try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
          Statement stmt = con.createStatement()) {
         String[]stud=new String[3];
         ResultSet rs = stmt.executeQuery("select * from student");
         for (int i = 0; i <=count; i++) {

             if (rs.next()) {
                 String name = rs.getString(1);
                 String grade = rs.getString(2);
                 int age = rs.getInt(3);

                // System.out.println(" Name :" + name + " Grade :" + grade + "Age :" + age);

                 stud[0] = rs.getString(1);
                 stud[1] = rs.getString(2);
                 stud[2] = String.valueOf(rs.getInt(3));
                 listOfStud.add(new Students(name,grade,age));
             }
         }
     } catch (SQLException e)
     {
         throw new RuntimeException(e);
     }
     for (Students list : listOfStud)
     {
         System.out.println(list);
     }

    // public static void printStudentDetails (List <Students> studentsList)    //normal method
  //   {
  //       for (Students students : studentsList) {
   //          System.out.println(students);
   //      }
   //  }
 }
    public static void main(String[] args) throws SQLException {


    //    studentsList.add(new Students("Suji","A",14));                 //for normal method
      //  studentsList.add(new Students("Rapenzel","B",20));
    //    studentsList.add(new Students("Tinkerbell","C",19));
       //   printStudentDetails(studentsList);


        String[]s=new String[]{"Princy","S", String.valueOf(7)};     //for JDBC Practice
          addStudents(s);
        printStudentsDetailsUsingMysql();



    }
}
