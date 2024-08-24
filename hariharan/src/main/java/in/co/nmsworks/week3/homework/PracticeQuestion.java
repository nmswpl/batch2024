package in.co.nmsworks.week3.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class PracticeQuestion {
    public static void main(String[] args) {

        PracticeQuestion practiceQuestion = new PracticeQuestion();
        System.out.println(practiceQuestion.getNumberType(10)+"\n");
        practiceQuestion.fibonacci();
        practiceQuestion.addGivenNumbers();
        practiceQuestion.menuSelection();
        practiceQuestion.studentDataGenrater("hariharan",21,"S");
        practiceQuestion.reverseString("Hello");
        practiceQuestion.removeSpace("    Hello     worl   d!   ");
        practiceQuestion.longestSubString("abcdaefghab");
        practiceQuestion.mergeArrayLis();
        practiceQuestion.nameSet();
        //practiceQuestion.dbWriter();
        practiceQuestion.countLine();
        practiceQuestion.fileHandeling("file.txt");
    }

    public String getNumberType(int number){
        if(number > 0){
            return number+" is positive Number";
        } else if (number < 0) {
            return number+"is negative Number";
        }else {
            return "0";
        }
    }

    public void fibonacci(){
        int sum =0;
        int a =0, b=1;
        for(int i =2;i<=10;i++){

            sum = a+b;
            System.out.println(sum+"\n");
            a=b;
            b = sum;

        }
    }

    public void addGivenNumbers(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n =0;
        do{
             n = sc.nextInt();
            sum += n;
        }while (n !=0);
        System.out.println(sum+"\n");
    }

    public void menuSelection(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("1.Choose Menu A \n 2.Choose Menu B\n 3.Choose Menu C\n 4.Exit Menu");
           option = sc.nextInt();

        }while (option != 4);
    }

    public void studentDataGenrater(String name, int age, String grade){
        Studnet hariharan = new Studnet(name, age,grade);
        System.out.println("\n Name:" + hariharan.getName() + "\n" + "Age:" + hariharan.getAge() + "\n" + "Grade:" + hariharan.getGrade());
    }

    public void reverseString(String word){
        String reversedString = "";
        for (int i = word.length()-1; i >=0; i--) {
            reversedString += word.charAt(i);
        }
        System.out.println(reversedString);
    }

    public  void removeSpace(String word){
        System.out.println(word.replaceAll("\\s", ""));
    }

    public void longestSubString(String word){
        int n = word.length();
        int l = 0, r = 0;
        Set<Character> visited = new HashSet<>();
        int maxStr = 0;
        int maxL = 0, maxR = 0;
        while (r < n) {
            if (!visited.contains(word.charAt(r))) {
                visited.add(word.charAt(r));
                if (r - l + 1 > maxStr) {
                    maxStr = r - l + 1;
                    maxL = l;
                    maxR = r;
                }
                r++;
            }
            else {
                visited.remove(word.charAt(l));
                l++;
            }
        }
        for (int i = maxL; i <= maxR; i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

    public void mergeArrayLis(){
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(2,6,4,9,7,12));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(45,3,17,32,10));
        List<Integer> mergedList = new ArrayList<Integer>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println(mergedList);
    }

    public void nameSet(){
        List<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList("Hari","Jenish","hari","Kumar","ravi","kumar"));
        Set<String> set = new HashSet<String>();
        for (String name : names) {
            set.add(name.toLowerCase(Locale.ROOT));
        }
       Map<String,Integer> mapOfNmaes = new HashMap<String,Integer>();
        for (String name : set) {
            mapOfNmaes.put(name,name.length());
        }

        System.out.println(mapOfNmaes);
    }

    public  void dbWriter(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password")) {
            PreparedStatement preparedStatementforInsert = connection.prepareStatement("insert into customers(first_name,last_name,referedby,email) values(?,?,?,?)");
            preparedStatementforInsert.setString(1,"Hari");
            preparedStatementforInsert.setString(2,"Haran");
            preparedStatementforInsert.setInt(3,2);
            preparedStatementforInsert.setString(4,"harikr23@gmail.com");
            preparedStatementforInsert.executeUpdate();

            PreparedStatement preparedStatementForUpdate = connection.prepareStatement("update customers set referedby = ? where cus_id = ?");
            preparedStatementForUpdate.setInt(1,4);
            preparedStatementForUpdate.setInt(2,3);
            preparedStatementForUpdate.executeUpdate();

            PreparedStatement preparedStatement = connection.prepareStatement("select * from customers");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){


            System.out.println("Id: " + resultSet.getInt(1)+"\n"+ "First Name:" + resultSet.getString(2) +"\n"+ "Last Name:" + resultSet.getString(3) +"\n"+ "Refered By" + resultSet.getInt(4) +"\n" + "Email Id" + resultSet.getString(5) + "\n");
            }

        }catch( SQLException exeption){
            System.out.println(exeption);
        }
    }

    public void countLine(){
        try(FileReader fileReader = new FileReader("D:\\batch2024\\hariharan\\src\\main\\java\\in\\co\\nmsworks\\week3\\homework\\file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            int counter =0;
            while((line = bufferedReader.readLine()) != null){
                counter++;
            }

            System.out.println("File has "+counter +" lines");
        }catch(Exception exeption){
            System.out.println(exeption);
        }
    }

    public void fileHandeling(String filepath){
        try(FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException exception){
            System.out.println(exception);
        }catch (IOException ioException){
            System.out.println(ioException);
        }
    }


}
