package in.co.nmsworks.week4.day1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        BooksWithMap ls=new BooksWithMap();
        ls.fileParsing();
        Scanner scanner = new Scanner(System.in);
        int searchnum;
        do {
            System.out.print("\n\nChoose function \n\t 1. Search by id\n\t 2.Search by name\n\t 3.search by author\n\t4.search by category \n\t5.quit\nEnter Choice (1/2/3/4) ::");
            searchnum = scanner.nextInt();
            switch (searchnum) {
                case 1:
                    System.out.println("enter the id to search::");
                    Long id = scanner.nextLong();
                    ls.searchByid(id);
                    break;
                case 2:
                    System.out.println("enter the name to search::");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    ls.searchByName(name);
                    break;
                case 3:
                    System.out.println("enter the author to search::");
                    scanner.nextLine();
                    String author = scanner.nextLine();
                    ls.searchByAuthorName(author);
                    break;
                case 4:
                    System.out.println("enter the category to search::");
                    scanner.nextLine();
                    String category = scanner.nextLine();
                    ls.searchByCategory(category);
                    break;
                default:
                    System.out.println("invalid number");
                    break;
            }
        } while (searchnum != 5);

    }
}
