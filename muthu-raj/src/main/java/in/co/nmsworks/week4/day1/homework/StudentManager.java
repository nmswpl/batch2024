package in.co.nmsworks.week4.day1.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class StudentManager {

    Map<Integer, Student> studentDetails;

    public StudentManager() {

        this.studentDetails = getStudentAsList();
    }

    public static void main(String[] args) {


        StudentManager stud = new StudentManager();

        System.out.println(getStudentAsList());
//        stud.addStudent();
//        stud.updateStudent();
//        stud.removeStudent();
//        System.out.println(stud.findTopStudent());
//        System.out.println(stud.getAllScoresAboveThreshold());
//        System.out.println(stud.getAllStudents());
//        stud.checkExistence();
//        stud.mergeWithAnotherMap();
//        System.out.println(stud.countScores());
    }

    private Map<Integer, Integer> countScores()
    {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> markAndCounts = new HashMap<>();

        System.out.println("Enter the subject name ::");
        String subject = sc.nextLine().trim();

        for ( Student stud : studentDetails.values())
        {
            if("english".equalsIgnoreCase(subject))
            {
                markAndCounts = fillScoreMap(stud.getEnglish(), markAndCounts);
            }
            else if ("maths".equalsIgnoreCase(subject))
            {
                markAndCounts = fillScoreMap(stud.getMath(), markAndCounts);
            }
            else if ("science".equalsIgnoreCase(subject))
            {
                markAndCounts = fillScoreMap(stud.getScience(), markAndCounts);
            }
            else if ("history".equalsIgnoreCase(subject))
            {
                markAndCounts = fillScoreMap(stud.getHistory(), markAndCounts);
            }

        }
        return markAndCounts;
    }

    private static Map<Integer, Integer> fillScoreMap(Integer mark, Map<Integer, Integer> markAndCounts)
    {
        if(markAndCounts.containsKey(mark))
        {
            markAndCounts.put(mark, markAndCounts.get(mark) + 1);
        }
        else {
            markAndCounts.put(mark, 1);
        }

        return markAndCounts;
    }

    private void mergeWithAnotherMap()
    {
        Map<Student, List<Integer>> newStudentMap = new HashMap<>();

        Student s = new Student();
        s.setId(studentDetails.size() + 1);
        s.setName("John");
        s.setMath(78);
        s.setEnglish(89);
        s.setScience(98);
        s.setHistory(80);

        newStudentMap.put(s,Arrays.asList(s.getMath(),s.getEnglish(),s.getScience(),s.getHistory()));

        s = new Student();
        s.setId(3);
        s.setName("Bob Johnson");
        s.setMath(100);
        s.setEnglish(100);
        s.setScience(100);
        s.setHistory(100);
        newStudentMap.put(s,Arrays.asList(s.getMath(),s.getEnglish(),s.getScience(),s.getHistory()));

        s = new Student();
        s.setId(1);
        s.setName("John Doe");
        s.setMath(90);
        s.setEnglish(90);
        s.setScience(90);
        s.setHistory(90);
        newStudentMap.put(s,Arrays.asList(s.getMath(),s.getEnglish(),s.getScience(),s.getHistory()));;

        s = new Student();
        s.setId(studentDetails.size() + 1);
        s.setName("Muthu Raj");
        s.setMath(80);
        s.setEnglish(80);
        s.setScience(80);
        s.setHistory(80);
        newStudentMap.put(s,Arrays.asList(s.getMath(),s.getEnglish(),s.getScience(),s.getHistory()));

        s = new Student();
        s.setId(2);
        s.setName("Jane Smith");
        s.setMath(70);
        s.setEnglish(70);
        s.setScience(70);
        s.setHistory(70);
        newStudentMap.put(s,Arrays.asList(s.getMath(),s.getEnglish(),s.getScience(),s.getHistory()));


        for ( Student stud : newStudentMap.keySet())
        {
            studentDetails.put(stud.getId(), stud);
        }

        for(Integer id : studentDetails.keySet())
        {
            System.out.println(studentDetails.get(id));
        }
    }

    private void checkExistence()
    {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter student name :: ");
        String name = sc.nextLine();

        System.out.println("Enter mark :: ");
        int mark = sc.nextInt();

        for (Student stud : studentDetails.values())
        {
            if(stud.getName().equalsIgnoreCase(name))
            {
                if ( stud.getMath() == mark) {
                    System.out.println("Student exist and his maths mark is " + mark);
                    return;
                }

                else if ( stud.getScience() == mark) {
                    System.out.println("Student exist and his science mark is " + mark);
                    return;
                }

                else if ( stud.getHistory() == mark) {
                    System.out.println("Student exist and his history mark is " + mark);
                    return;
                }

                else if ( stud.getEnglish() == mark) {
                    System.out.println("Student exist and his english mark is " + mark);
                    return;
                }

                else
                    System.out.println("Student exist but he doesn't score the specified mark");
                return;
            }
        }

        System.out.println("Student is not in the list");
    }

    private Set<String> getAllStudents()
    {
        Set<String> studentNames = new HashSet<>();

        for(Student stud : studentDetails.values())
        {
            studentNames.add(stud.getName());
        }
        return studentNames;
    }

    private Map<String, Integer> getAllScoresAboveThreshold()
    {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter subject name :: ");
        String subject = sc.nextLine();

        System.out.println("Enter threshold :: ");
        int threshold = sc.nextInt();


        Map<String, Integer> nameToMark = new HashMap<>();
        for (Integer id : studentDetails.keySet())
        {
            Student stud = studentDetails.get(id);
            if("english".equalsIgnoreCase(subject) && stud.getEnglish() >= threshold)
            {
                nameToMark.put(stud.getName(), stud.getEnglish());
            }
            else if("maths".equalsIgnoreCase(subject) && stud.getMath() >= threshold)
            {
                nameToMark.put(stud.getName(), stud.getMath());
            }
            else if ("history".equalsIgnoreCase(subject) && stud.getHistory() >= threshold)
            {
                nameToMark.put(stud.getName(), stud.getHistory());
            }
            else if ("science".equalsIgnoreCase(subject) && stud.getScience() >= threshold)
            {
                nameToMark.put(stud.getName(), stud.getScience());
            }
        }

        return nameToMark;
    }

    private String findTopStudent()
    {

        Scanner sc = new Scanner(System.in);
        String topStudent = "";

        System.out.println("Enter subjet name :: ");
        String subject = sc.nextLine();

        if("maths".equalsIgnoreCase(subject))
            topStudent =  getMaxFromMath();
        else if("science".equalsIgnoreCase(subject))
            topStudent =  getMaxFromScience();
        else if("history".equalsIgnoreCase(subject))
            topStudent =  getMaxFromHistory();
        else if("english".equalsIgnoreCase(subject))
            topStudent =  getMaxFromEnglish();

        return topStudent;
    }

    private String getMaxFromEnglish()
    {
        String name = studentDetails.get(1).getName();
        int mark = studentDetails.get(1).getEnglish();
        for (Student stud : studentDetails.values())
        {
            if(stud.getEnglish() > mark)
            {
                name = stud.getName();
                mark = stud.getEnglish();
            }
        }

        return name;
    }

    private String getMaxFromHistory()
    {

        String name = studentDetails.get(1).getName();
        int mark = studentDetails.get(1).getHistory();

        for (Student stud : studentDetails.values())
        {
            if(stud.getHistory() > mark)
            {
                name = stud.getName();
                mark = stud.getHistory();
            }
        }

        return name;
    }

    private String getMaxFromScience()
    {

        String name = studentDetails.get(1).getName();
        int mark = studentDetails.get(1).getScience();

        for (Student stud : studentDetails.values())
        {
            if(stud.getScience() > mark)
            {
                name = stud.getName();
                mark = stud.getScience();
            }
        }
        return name;
    }

    private String  getMaxFromMath()
    {

        String name = studentDetails.get(1).getName();
        int mark = studentDetails.get(1).getMath();

        for (Student stud : studentDetails.values())
        {
            if(stud.getMath() > mark)
            {
                name = stud.getName();
                mark = stud.getMath();
            }
        }
        return name;

    }


    private void removeStudent()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter subject name :: ");
        String subject = sc.nextLine();

        System.out.println("Enter the Threshold :: ");
        int threshold =  sc.nextInt();

        removeEntry(subject, threshold);

    }

    private void removeEntry(String subject, int threshold)
    {
        List<Integer> removeIndex = new ArrayList<>();
        for (Integer id : studentDetails.keySet())
        {
            Student stud = studentDetails.get(id);
            if("english".equalsIgnoreCase(subject) && stud.getEnglish() < threshold)
            {
                removeIndex.add(id);
            }
            else if("maths".equalsIgnoreCase(subject) && stud.getMath() < threshold)
            {
                removeIndex.add(id);
            }
            else if ("history".equalsIgnoreCase(subject) && stud.getHistory() < threshold)
            {
                removeIndex.add(id);
            }
            else if ("science".equalsIgnoreCase(subject) && stud.getScience() < threshold)
            {
                removeIndex.add(id);
            }
        }

        for (Integer index : removeIndex) {
            studentDetails.remove(index);
        }

        System.out.println("After Removind :: ");
        for (Integer id : studentDetails.keySet())
        {
            System.out.println(studentDetails.get(id));
        }
    }


    private void addStudent()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name :: ");
        String name =  sc.nextLine();

        System.out.println("Enter Maths mark :: ");
        int mat = sc.nextInt();

        System.out.println("Enter English mark :: ");
        int eng = sc.nextInt();

        System.out.println("Enter Science mark :: ");
        int sci = sc.nextInt();

        System.out.println("Enter History mark :: ");
        int hist = sc.nextInt();

        Student s = new Student();

        s.setId(studentDetails.size() + 1);
        s.setName(name);
        s.setMath(mat);
        s.setEnglish(eng);
        s.setScience(sci);
        s.setHistory(hist);

        studentDetails.put(s.getId(), s);

    }

    private static Map<Integer,Student> getStudentAsList()
    {
        Map<Integer,Student> studentDetails = new HashMap<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Students"))
        {
            try(ResultSet rs = ps.executeQuery())
            {
                Student s;
                while (rs.next()) {
                    s  = new Student();
                    s.setId(rs.getInt(1));
                    s.setName(rs.getString(2));
                    s.setMath(rs.getInt(3));
                    s.setEnglish(rs.getInt(4));
                    s.setScience(rs.getInt(5));
                    s.setHistory(rs.getInt(6));

                    studentDetails.put(rs.getInt(1), s);
                }
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        return studentDetails;
    }

    private void updateStudent()
    {
        Scanner sc = new Scanner(System.in);
        Student s;

//        getting user input
        System.out.println("Enter Student name :: ");
        String name = sc.nextLine();

        System.out.println("Enter Maths mark :: ");
        int mat = sc.nextInt();

        System.out.println("Enter English mark :: ");
        int eng = sc.nextInt();

        System.out.println("Enter Science mark :: ");
        int sci = sc.nextInt();

        System.out.println("Enter History mark :: ");
        int hist = sc.nextInt();


        for(Integer id : studentDetails.keySet())
        {
            if(studentDetails.get(id).getName().equals(name))
            {
                s = studentDetails.get(id);
                s.setMath(mat);
                s.setEnglish(eng);
                s.setScience(sci);
                s.setHistory(hist);
                studentDetails.put(id, s);
                return;
            }
        }

        s = new Student();
        s.setId(studentDetails.size() + 1);
        s.setName(name);
        s.setMath(mat);
        s.setEnglish(eng);
        s.setScience(sci);
        s.setHistory(hist);

        studentDetails.put(s.getId(), s);

        System.out.println("Student Details updated!");

        System.out.println("Updated Student Details :: ");

        System.out.println(studentDetails);
    }

}
