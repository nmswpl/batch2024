package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LibraryUsingMap {


    static Scanner sc = new Scanner(System.in);
    static List<Book> listOfBooks = new ArrayList<>();
    static Map<Long, Book> isbnToBook = new HashMap<Long, Book>();




    public LibraryUsingMap() {
        getBookListFromCSV();
        for (Book book : listOfBooks) {
            isbnToBook.put(book.getIsbn(), book);

        }
        System.out.println(isbnToBook);
    }


    public static void main(String[] args) {


       LibraryUsingMap libraryUsingMap = new LibraryUsingMap();

        System.out.println();
        int option = 0;
        do {
            System.out.println("1.Search by ISBN 2.Search by Book Name 3.Search by Author 4. Search by Category");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    searcgByISBN();
                    break;
                case 2:
                    searchByBookName();
                    break;
                case 3:
                    searchByAuthorName();
                    break;
                case 4:
                    searchByCategory();
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 4);

    }

    private static void searchByCategory() {
      ;
        System.out.println("Enter the Category:");
        String category = sc.nextLine();
        for(long isbnOfBook : isbnToBook.keySet()) {
            if(isbnToBook.get(isbnOfBook).getCategory().equalsIgnoreCase(category)) {
                printBookDetails(isbnOfBook);
            }
        }


    }

    private static void searchByAuthorName() {

        System.out.println("Enter the Author name");
        String authorName = sc.nextLine();
        for(long isbnOfBook : isbnToBook.keySet()) {
            if(isbnToBook.get(isbnOfBook).getAuthorName().equals(authorName)) {
                printBookDetails(isbnOfBook);
            }
        }
    }

    private static void searchByBookName() {
        sc.nextLine();
        System.out.println("Enter the Book Name:");
        String bookName = sc.nextLine();
       for(long isbnOfBook : isbnToBook.keySet()) {
           if(isbnToBook.get(isbnOfBook).getName().equals(bookName)) {
               printBookDetails(isbnOfBook);
           }
       }


    }

    private static void searcgByISBN() {
        System.out.println("Enter the ISBN Number:");
        Long isbn = sc.nextLong();
       for(long isbnOfBooK : isbnToBook.keySet()) {
           if(isbnToBook.get(isbnOfBooK).getIsbn() == isbn){
               printBookDetails(isbn);

           }
       }
    }

    private static void printBookDetails(Long isbn) {
        System.out.println("ISBN :: " + isbnToBook.get(isbn).getIsbn());
        System.out.println("Book name :: " + isbnToBook.get(isbn).getName());
        System.out.println("Author :: " + isbnToBook.get(isbn).getAuthorName());
        System.out.println("Category :: " + isbnToBook.get(isbn).getCategory());
        System.out.println("Release year :: " + isbnToBook.get(isbn).getYearOfRelase());
        System.out.println("****************************************************");
        System.out.println();
    }


    public List<Book> getBookListFromCSV() {

        try (FileReader reader = new FileReader("/home/nms/Downloads/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                int releaseYear = Integer.parseInt(bookDetails[4].trim());
                Book book = new Book(ISBN, bookName, author, category, releaseYear);
                listOfBooks.add(book);       // sample code
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return listOfBooks;

    }
}
