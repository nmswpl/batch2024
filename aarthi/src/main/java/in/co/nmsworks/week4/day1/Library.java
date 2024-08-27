package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList = new ArrayList<>();
    public List<Book> getBookListFromCsv() {
        try (FileReader reader = new FileReader("/home/nms/Downloads/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            csvReader.skip(1);

            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long id = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                Book book = new Book(id,bookName,author,category);
                bookList.add(book);
            }
            return bookList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return java.util.Collections.emptyList();
    }
    public void searchById(long id){
        for(Book book : bookList){
            if(id == book.getId()){
                System.out.println(book);
            }
        }
    }
    public void searchByBookName(String bookName){
        for(Book book : bookList){
            if(bookName.equals(book.getBookName())){
                System.out.println(book);
            }
        }
    }
    public void searchByAuthor(String author){
        for(Book book : bookList){
            if(author.equals(book.getAuthor())){
                System.out.println(book);
            }
        }
    }
    public void searchBycategory(String category){
        for(Book book : bookList){
            if(category.equalsIgnoreCase(book.getCategory())){
                System.out.println(book);
            }
        }
    }
    public static void main(String[] args) {
        Library lib = new Library();
        lib.getBookListFromCsv();
        //lib.searchById(2308202401L);
        //lib.searchByBookName("To Kill a Mockingbird");
        lib.searchBycategory("fiction");
    }
}
