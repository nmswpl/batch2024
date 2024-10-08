package in.co.nmsworks.week4.day1;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Library {

    static Scanner sc = new Scanner(System.in);
    static List<Book> listOfBooks = new ArrayList<>();
    Map<Long, Book> isbnToBook = new HashMap<Long, Book>();
    Map<String, Book>nameToBook = new HashMap<>();
    Map<String, Book>authorToBook = new HashMap<>();
    Map<String,Book> categoryToBook = new HashMap<>();


    public Library() {
      getBookListFromCSV();
        for (Book book : listOfBooks) {
            isbnToBook.put(book.getIsbn(),book);
            nameToBook.put(book.getName(),book);
            authorToBook.put(book.getAuthorName(),book);
            categoryToBook.put(book.getCategory(),book);
        }

    }
  

    public static void main(String[] args) {
        
        
    
        Library library = new Library();

        System.out.println();
        int option =0;
        do{
            System.out.println("1.Search by ISBN 2.Search by Book Name 3.Search by Author 4. Search by Category");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option:");
            option = sc.nextInt();
            switch (option){
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

        }while (option != 4);

    }

    private static void searchByCategory() {
sc.nextLine();
        System.out.println("Enter the Category:");
        String category = sc.nextLine();
        for (Book book : listOfBooks) {
            if (book.getCategory().equals(category)){
                printBookDetails(book);
            }
        }


    }

    private static void searchByAuthorName() {
       sc.nextLine();
        System.out.println("Enter the Author name");
       String authorName = sc.nextLine();
        for (Book book : listOfBooks) {
            if(book.getAuthorName().equals(authorName)){
                printBookDetails(book);
            }
        }

    }

    private static void searchByBookName() {

        System.out.println("Enter the Book Name:");
       String bookName = sc.nextLine();
        for (Book book : listOfBooks) {
            if(book.getName().equals(bookName)){
                printBookDetails(book);
            }
        }

        System.out.println("The book is not available ");

    }

    private static void searcgByISBN() {
        System.out.println("Enter the ISBN Number:");
        Long isbn = sc.nextLong();
        for (Book book : listOfBooks) {
         if(book.getIsbn() == isbn){
             printBookDetails(book);
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
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return listOfBooks;

    }
}
