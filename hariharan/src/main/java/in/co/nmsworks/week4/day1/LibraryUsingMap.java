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
    static Map<String, Book> nameToBook = new HashMap<>();
    static Map<String, Book> authorToBook = new HashMap<>();
    static Map<String, List<Book>> categoryToBook = new HashMap<>();
    static List<Book> ficitionBooks = new ArrayList<>();
    static List<Book> nonFicitionBooks = new ArrayList<>();
    static List<Book> comedy = new ArrayList<>();
    static List<Book> tragedy = new ArrayList<>();
    static List<Book> Romance_Tragicomedy = new ArrayList<>();



    public LibraryUsingMap() {
        getBookListFromCSV();
        for (Book book : listOfBooks) {
            isbnToBook.put(book.getIsbn(), book);
            nameToBook.put(book.getName(), book);
            authorToBook.put(book.getAuthorName(), book);
            
        }
        for (Book book : listOfBooks) {
            if(book.getCategory().equalsIgnoreCase("Fiction")){
                ficitionBooks.add(book);
            } else if (book.getCategory().equalsIgnoreCase("Non-FIction")) {
                nonFicitionBooks.add(book);
            } else if (book.getCategory().equalsIgnoreCase("Tragedy")) {
                tragedy.add(book);
            } else if (book.getCategory().equalsIgnoreCase("Comedy")) {
                comedy.add(book);
            }else{
                Romance_Tragicomedy.add(book);
            }

        }

        for (Book book : listOfBooks) {
            if(book.getCategory().equalsIgnoreCase("Fiction")){
                categoryToBook.put(book.getCategory(),ficitionBooks);
            } else if (book.getCategory().equalsIgnoreCase("Non-Fiction")) {
                categoryToBook.put(book.getCategory(), nonFicitionBooks);
            } else if (book.getCategory().equalsIgnoreCase("comedy")) {
                categoryToBook.put(book.getCategory(), comedy);
            } else if (book.getCategory().equalsIgnoreCase("Tragedy")) {
                categoryToBook.put(book.getCategory(), tragedy);
            }else{
                categoryToBook.put(book.getCategory(), Romance_Tragicomedy);
            }

        }

        System.out.println(isbnToBook);
        System.out.println(nameToBook);
        System.out.println(authorToBook);
        System.out.println(categoryToBook);;

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
        for (String key : categoryToBook.keySet()) {
            if (key.equals(category)) {

            }
        }


    }

    private static void searchByAuthorName() {

        System.out.println("Enter the Author name");
        String authorName = sc.nextLine();
        for (String key : authorToBook.keySet()) {
            if (key.equals(authorName)) {
                printBookDetails(authorToBook.get(key));
            }
        }


    }

    private static void searchByBookName() {

        System.out.println("Enter the Book Name:");
        String bookName = sc.nextLine();
        for (String key : nameToBook.keySet()) {
            if (key.equals(bookName)) {
                printBookDetails(nameToBook.get(key));
            }
        }


    }

    private static void searcgByISBN() {
        System.out.println("Enter the ISBN Number:");
        Long isbn = sc.nextLong();
        for (Long key : isbnToBook.keySet()) {
            if (key == isbn) {
                printBookDetails(isbnToBook.get(key));
            }
        }
    }


    private static void printBookDetails(Book book) {
        System.out.println("ISBN:\t" + book.getIsbn());
        System.out.println("Name:\t" + book.getName());
        System.out.println("Author Name:\t" + book.getAuthorName());
        System.out.println("Category :\t" + book.getCategory());
        System.out.println("Year of Release :\t" + book.getYearOfRelase());
        System.out.println("\n");
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
