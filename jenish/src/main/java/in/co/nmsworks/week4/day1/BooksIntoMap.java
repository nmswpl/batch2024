package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import in.co.nmsworks.week3.day5.Book;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksIntoMap {
    private Map<Long, Book> bookIntoMap = new HashMap<>();
    private List<Book> booksList = new ArrayList<>();

    public List<Book> getBookListFromCsv() {
        try (FileReader reader = new FileReader("/home/nms/Downloads/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                String releaseYear = bookDetails[4].trim();
                Book book = new Book(ISBN, bookName, author, category, releaseYear, true);
                booksList.add(book);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return booksList;
    }

    public Map<Long, Book> putIntoMap(){
        for (Book book : booksList) {
            bookIntoMap.put(book.getISBN(),book);
        }
        return bookIntoMap;
    }

    public void searchById(long id) {
        Book book = bookIntoMap.get(id);
        if (book != null) {
            System.out.println("Search by ISBN.....");
            System.out.println("****************************************************");
            System.out.println("ISBN :: " + book.getISBN());
            System.out.println("Book name :: " + book.getBookName());
            System.out.println("Author :: " + book.getAuthor());
            System.out.println("Category :: " + book.getCategory());
            System.out.println("Release year :: " + book.getReleaseYear());
            System.out.println();
        } else {
            System.out.println("No book found with ID: " + id);
        }
    }

    public void searchByName(String name) {
        for (Long Isbn : bookIntoMap.keySet()) {
            if(bookIntoMap.get(Isbn).getBookName().equalsIgnoreCase(name)){
                System.out.println("Search by Book name......");
                System.out.println("****************************************************");
                System.out.println("ISBN :: " + bookIntoMap.get(Isbn).getISBN());
                System.out.println("Book name :: " + bookIntoMap.get(Isbn).getBookName());
                System.out.println("Author :: " + bookIntoMap.get(Isbn).getAuthor());
                System.out.println("Category :: " + bookIntoMap.get(Isbn).getCategory());
                System.out.println("Release year :: " + bookIntoMap.get(Isbn).getReleaseYear());
                System.out.println();
            }
        }
    }

    public void searchByAuthor(String authorName) {
        for (Long Isbn : bookIntoMap.keySet()) {
            if(bookIntoMap.get(Isbn).getAuthor().equalsIgnoreCase(authorName)){
                System.out.println("Search by Author name.....");
                System.out.println("****************************************************");
                System.out.println("ISBN :: " + bookIntoMap.get(Isbn).getISBN());
                System.out.println("Book name :: " + bookIntoMap.get(Isbn).getBookName());
                System.out.println("Author :: " + bookIntoMap.get(Isbn).getAuthor());
                System.out.println("Category :: " + bookIntoMap.get(Isbn).getCategory());
                System.out.println("Release year :: " + bookIntoMap.get(Isbn).getReleaseYear());
                System.out.println();
            }
        }
    }

    public void searchByCategory(String category) {
        for (Long Isbn : bookIntoMap.keySet()) {
            if(bookIntoMap.get(Isbn).getCategory().equalsIgnoreCase(category)){
                System.out.println("ISBN :: " + bookIntoMap.get(Isbn).getISBN());
                System.out.println("Book name :: " + bookIntoMap.get(Isbn).getBookName());
                System.out.println("Author :: " + bookIntoMap.get(Isbn).getAuthor());
                System.out.println("Category :: " + bookIntoMap.get(Isbn).getCategory());
                System.out.println("Release year :: " + bookIntoMap.get(Isbn).getReleaseYear());
                System.out.println("****************************************************");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        BooksIntoMap booksIntoMap = new BooksIntoMap();
        booksIntoMap.getBookListFromCsv();
        booksIntoMap.putIntoMap();
        booksIntoMap.searchById(2308202402L);
        booksIntoMap.searchByName("Wuthering Heights");
        booksIntoMap.searchByAuthor("Toni Morrison");
        booksIntoMap.searchByCategory("Fiction");
    }
}