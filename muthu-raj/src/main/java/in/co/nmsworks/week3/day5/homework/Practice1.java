package in.co.nmsworks.week3.day5.homework;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
        import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
//        isPosOrNeg();
//        fib(10);
//        stopAtZero();
//        showMenu();
//        createStudent("Muthu Raj", 21, 'A');
//        System.out.println(stringReversal("Muthu Raj"))
//        removeSpaces();
//        longestSubstring();
//        mergeArrayLists();
//        convertToSet();
//        executeQuery();
//        countLines();
        readUserFile();
    }

    private static void readUserFile() {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter file path :: ");
        String path = sc.nextLine().trim();
        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr))
        {

            String line = br.readLine();
            int lineCount = 0;
            while(line != null)
            {
                System.out.println(line);
                lineCount++;
                line = br.readLine();
            }

            System.out.println("Total no. of lines :: " + lineCount);
        }
        catch (FileNotFoundException f)
        {
            System.out.println("Specified file does not exist!");
        }
        catch(IOException e)
        {
            System.out.println("Given file has no read access!");

        }
    }

    private static void countLines() {
        try(FileReader fr = new FileReader("/home/nms/countWords.txt");
            BufferedReader br = new BufferedReader(fr))
        {
            String line = br.readLine();
            int lineCount = 0;
            while(line != null)
            {
                lineCount++;
                line = br.readLine();
            }

            System.out.println("Total no. of lines :: " + lineCount);
        }
        catch(IOException e)
        {
            e.printStackTrace();

        }
    }

    private static void executeQuery()
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");)
        {
            try(PreparedStatement ps = con.prepareStatement("INSERT INTO trainees VALUES(?,?,?)"))
            {
                ps.setInt(1,2);
                ps.setString(2,"John");
                ps.setString(3, "john1234@gmail.com");
                System.out.println(ps.executeUpdate() + " rows Updated!");
            }
            try (PreparedStatement ps = con.prepareStatement("UPDATE trainees SET name = 'davinci' WHERE email = 'muthuraj0965@gmail.com'"))
            {
                System.out.println(ps.executeUpdate() + " rows Updated!");
            }
            try (PreparedStatement ps = con.prepareStatement("SELECT * FROM Library WHERE Category = 'Fiction'"))
            {
                ResultSet rs = ps.executeQuery();

                int row = 0;
                while (rs.next())
                {
                    System.out.println("Book ID = " + rs.getLong(1) +
                            "\nTitle = " + rs.getString(2) +
                            "\nAuthor = " + rs.getString(3) +
                            "\nCategory = " + rs.getString(4) +
                            "\nYear of release = " + rs.getInt(5) +
                            "\nStatus = " + (rs.getBoolean(6) ? "Available" : "Not Available"));
                    System.out.println("-------------------x " + row++ + " x---------------------");
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void convertToSet() {

        List<String> names = new ArrayList<>(Arrays.asList("Olivia", "Liam", "Emma", "Noah", "Ava", "Sophia", "James", "Isabella", "Mia", "Lucas", "Amelia", "Ethan", "Olivia", "Liam", "Emma", "Noah", "Ava", "Sophia", "James", "Isabella", "Mia", "Lucas", "Amelia", "Ethan"));
        Set<String> uniqueNames = new HashSet<>(names);

        Map<String, Integer> nameAndSize = new HashMap<>();

        for (String uniqueName : uniqueNames) {
            nameAndSize.put(uniqueName, uniqueName.length());
        }

        System.out.println(nameAndSize);
    }

    private static void mergeArrayLists() {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(5,6,7,8,9));
        nums2.addAll(nums1);
        System.out.println( "After merging num1 and num2 ::" + nums2);
        List<Integer> nums3 = new ArrayList<>(nums2);
        System.out.println("After merging all 3:: " +  nums3);
    }

    private static void longestSubstring() {

        String str = "aabdbdbfsbabdkja";
        boolean[] visited = new boolean[255];
        int left = 0;
        int right = 0;
        int len = str.length();

        while(left < len && right < len)
        {
            if (!visited[(int) str.charAt(right)])
            {
                visited[(int) str.charAt(right)] = true;
                right++;
            }
            else
            {
                visited[(int) str.charAt(left)] = false;
                left++;
            }
        }
        System.out.println(str.substring(left, right));
    }

    private static void removeSpaces() {
        String sentence = "Write a program that reverses a given string without using built-in reverse methods.";
        System.out.println("Before :: " + sentence);
        String noSpaceSt = sentence.replaceAll(" ", "");
        System.out.println("After space is removed :: " + noSpaceSt);
    }

    private static String stringReversal(String str) {
        if(str.equals(""))
        {
            return "";
        }
        return stringReversal(str.substring(1)) + str.charAt(0);
    }

    private static void createStudent(String name, int age, char grade) {

        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setGrade(grade);
        System.out.println(s);
    }

    private static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\t1. Choose Menu A\n" +
                    "\t2. Choose Menu B\n" +
                    "\t3. Choose Menu C\n" +
                    "\t4. Exit");
            System.out.println("Enter your choice ::");
            choice = sc.nextInt();

        }while(choice != 4);
        System.out.println("Thank you!");
    }

    private static void stopAtZero() {

        Scanner sc =  new Scanner(System.in);
        int val;
        int res = 0;
        do {
            System.out.println("Enter a num('0' to stop) :: ");
            val = sc.nextInt();
            res += val;

        }while(val != 0);

        System.out.println("The sum of all the entered values :: " + res);
    }


    private static void isPosOrNeg()
    {
        int a = -9;
        if(a > 0)
        {
            System.out.println("Positive");
        }
        else if (a < 0) {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }

    private static void fib(int limit)
    {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < limit; i++) {
            System.out.print(n1 + " ");
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
}
