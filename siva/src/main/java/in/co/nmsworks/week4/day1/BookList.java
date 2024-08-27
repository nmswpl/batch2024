package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookList {
    public static void main(String[] args) {
        BookList bookListParsing = new BookList();
        System.out.println(bookListParsing.searchByBookID("2308202401"));
        System.out.println(bookListParsing.searchByName("To Kill a Mockingbird"));
        bookListParsing.searchByCategory("Comedy");
        bookListParsing.searchByYear(1960);

    }
    public List<Book> getBookDetailsFromCsv(){
        List<Book> listOfBooks = new ArrayList<>();
        try (FileReader reader = new FileReader("/home/nms/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                String bookId = (bookDetails[0].trim());
                String title = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                int yearOfRelease = Integer.parseInt(bookDetails[4].trim());
                Book book = new Book(bookId, title, author, category, yearOfRelease);
                listOfBooks.add(book);       // sample code
            }




        } catch (FileNotFoundException | CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfBooks;
    }
    public Book searchByBookID(String bookId){
        Map<String,Book> searchByBookId = new HashMap<>();
        for (Book book : getBookDetailsFromCsv()) {
            searchByBookId.put(book.getBookId(),book);

        }
       return searchByBookId.get(bookId);

    }
    public Book searchByName(String bookName){
        Map<String,Book> searchByName = new HashMap<>();
        for (Book book : getBookDetailsFromCsv()) {
            searchByName.put(book.getTitle(),book);

        }
        return searchByName.get(bookName);
    }
    public void searchByCategory(String category){
        for (Book book : getBookDetailsFromCsv()) {
            if(book.getCategory().equals(category)){
                System.out.println(book);

            }

        }


    }
    public void searchByYear(int year){
        for (Book book : getBookDetailsFromCsv()) {
            if(book.getYearOfRelease()==year){
                System.out.println(book);
            }

        }
    }



    }
