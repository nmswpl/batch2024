package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import in.co.nmsworks.week3.Day5.Book;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LibraryWithoutDb {
    List<Book> books = new ArrayList<>();

    public List<Book> getBookListFromCsv() {
        try (FileReader reader = new FileReader("/home/nms/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long bookId = Long.parseLong(bookDetails[0].trim());
                String title = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();

                Book book = new Book(bookId, title, author, category);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public static void main(String[] args) {
       BookOperations b = new BookOperations();
        b.addBook(11110, "Coding", "priya", "novel");
        b.addBook(11110, "Coding", "priya", "novel");
        System.out.println(b.books.size());
        b.searchBookByName("coding");
        b.searchBookById(2308202410l);
        b.searchBookByAuthor("John Steinbeck");
        System.out.println();
        b.searchBookByCategory("novel");
    }

}

class BookOperations {
    LibraryWithoutDb l =new LibraryWithoutDb();
        List<Book> books = l.getBookListFromCsv();

        public void addBook(long bookId, String title, String author, String category) {
            books.add(new Book(bookId, title, author, category));
            System.out.println("book added successfully");
        }

        public void searchBookByName(String name) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(name)) {
                    System.out.println(book);
                }
            }
        }

        public void searchBookById(long id) {
            for (Book book : books) {
                if (book.getBookId() == id) {
                    System.out.println(book);
                }
            }
        }

        public void searchBookByAuthor(String author) {
            System.out.println(books.size());
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    System.out.print(book);
                }
            }
        }

        public void searchBookByCategory(String category) {
            for (Book book : books) {
                if (book.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(book);
                }
            }
        }

        public void deleteBook(String name) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(name)) {
                    System.out.println(book);
                }
            }
        }

    }

