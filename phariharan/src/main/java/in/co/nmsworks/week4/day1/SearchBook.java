package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class SearchBook {
    public static void main(String[] args) {
        SearchBook searchBook = new SearchBook();
        List<Book> bookList = searchBook.getBookListFromCsv();
        Map<Long, Book> bookMapID = searchBook.generateBookMapId(bookList);
        Map<String, Book> bookMapTitle = searchBook.generateBookMapTitle(bookList);
        Map<String, List<Book>> bookMapCategory = searchBook.generateBookMapCategory(bookList);
        Map<String, List<Book>> bookMapAuthor = searchBook.generateBookMapAuthor(bookList);
        searchBook.searchInMapByISBN(1, bookMapID, "2308202428");
        System.out.println("****************\n");
        searchBook.searchInMapByName(2, bookMapTitle, "Becoming");
        System.out.println("****************\n");
        searchBook.searchInMapByCategory(3, bookMapCategory, "Non-Fiction");
        System.out.println("**************\n");
        searchBook.searchInMapByAuthor(4, bookMapAuthor, "William Shakespeare");
        System.out.println("*************\n");


    }

    private void searchInMapByISBN(int i, Map<Long, Book> bookMap, String authorName) {
        Book book = bookMap.get(Long.parseLong(authorName));
        System.out.println("BookId\t: " + book.getBook_id() + "\nBook title\t: " + book.getTitle() + "\nAuthor\t:" + book.getAuthor() + "\nCategory\t: " + book.getCategory() + "\nYear\t:" + book.getYear() + "\nAvailableStatus\t:" + (book.isAvailable() ? "Available" : "Not Available"));
        System.out.println();
    }


    private void searchInMapByCategory(int i, Map<String, List<Book>> bookMap, String bookCategory) {
        List<Book> bookList = bookMap.get(bookCategory);
        for (Book book : bookList) {
            System.out.println("BookId\t: " + book.getBook_id() + "\nBook title\t: " + book.getTitle() + "\nAuthor\t:" + book.getAuthor() + "\nCategory\t: " + book.getCategory() + "\nYear\t:" + book.getYear() + "\nAvailableStatus\t:" + (book.isAvailable() ? "Available" : "Not Available"));
            System.out.println();
        }
    }

    private void searchInMapByName(int i, Map<String, Book> bookMap, String bookName) {
        Book book = bookMap.get(bookName);
        System.out.println("BookId\t: " + book.getBook_id() + "\nBook title\t: " + book.getTitle() + "\nAuthor\t:" + book.getAuthor() + "\nCategory\t: " + book.getCategory() + "\nYear\t:" + book.getYear() + "\nAvailableStatus\t:" + (book.isAvailable() ? "Available" : "Not Available"));
        System.out.println();
    }


    private void searchInMapByAuthor(int i, Map<String, List<Book>> bookMap, String bookName) {
        List<Book> bookList = bookMap.get(bookName);
        for (Book book : bookList) {
            System.out.println("BookId\t: " + book.getBook_id() + "\nBook title\t: " + book.getTitle() + "\nAuthor\t:" + book.getAuthor() + "\nCategory\t: " + book.getCategory() + "\nYear\t:" + book.getYear() + "\nAvailableStatus\t:" + (book.isAvailable() ? "Available" : "Not Available"));
            System.out.println();
        }
    }

    private Map<Long, Book> generateBookMapId(List<Book> bookList) {
        Map<Long,Book> bookMap = new HashMap<>();
        for (Book book : bookList) {
            bookMap.put(book.getBook_id(),book);
        }
        return bookMap;
    }

    private Map<String, Book> generateBookMapTitle(List<Book> bookList) {
        Map<String,Book> bookMap = new HashMap<>();
        for (Book book : bookList) {
            bookMap.put(book.getTitle(),book);
        }
        return bookMap;
    }

    private Map<String, List<Book>> generateBookMapCategory(List<Book> bookList) {
        Map<String ,List<Book>> bookMap = new HashMap<>();

        for (Book book : bookList) {
            List<Book> bookList1 = new ArrayList<>();
            if (bookMap.containsKey(book.getCategory())){
                bookMap.get(book.getCategory()).add(book);
            }
            else {
                bookList1.add(book);
                bookMap.put(book.getCategory(),bookList1);
            }
        }
        return bookMap;
    }

    private Map<String, List<Book>> generateBookMapAuthor(List<Book> bookList) {
        Map<String ,List<Book>> bookMap = new HashMap<>();

        for (Book book : bookList) {
            List<Book> bookList1 = new ArrayList<>();
            if (bookMap.containsKey(book.getAuthor())){
                bookMap.get(book.getAuthor()).add(book);
            }
            else {
                bookList1.add(book);
                bookMap.put(book.getAuthor(),bookList1);
            }
        }
        return bookMap;
    }


    public List<Book> getBookListFromCsv() {
        try (FileReader reader = new FileReader("/home/nms/Downloads/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            List<Book> bookList = new ArrayList<>();
            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                int releaseYear = Integer.parseInt(bookDetails[4].trim());
                bookList.add(new Book(ISBN, bookName, author, category, releaseYear, true));

            }
            return bookList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
