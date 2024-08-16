package in.co.nmsworks.week2.collections.telephonebook;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.fillDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Contact name :: ");
        String inp = sc.next().trim().toLowerCase();
        telephoneBook.searchContact(inp);
    }
}