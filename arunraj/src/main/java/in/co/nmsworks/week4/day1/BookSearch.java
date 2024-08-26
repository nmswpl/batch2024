package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BookSearch {
    public static void main(String[] args) {

        BookSearch bs = new BookSearch();
        //Book bk = new Book();
        bs.getBookDetails();
        System.out.println("1 . Search By Id");
        System.out.println("2 . Search By BookName");
        System.out.println("3 . Search By Author");
        System.out.println("4 . Search By Category");
        System.out.println("Enter Search By :");
        //bs.searchById(2308202413L);
        //bs.searchByBook("Moby-Dick");
        //bs.searchByAuthor("William Shakespeare");
        //bs.searchByCategory();
        //bs.searchByYear();
    }

    public List<Book> getBookDetails() {
        try (FileReader reader = new FileReader("/home/nms/Downloads/Library.csv");

             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);

            String[] bookDetails;

            List<Book> booksList = new ArrayList<>();

            while ((bookDetails = csvReader.readNext()) != null) {

                long ISBN = Long.parseLong(bookDetails[0].trim());

                String bookName = bookDetails[1].trim();

                String author = bookDetails[2].trim();

                String category = bookDetails[3].trim();

                int releaseYear = Integer.parseInt(bookDetails[4]);

                Book book = new Book(ISBN, bookName, author, category, releaseYear);

                booksList.add(book);       // sample code

            }

            //System.out.println(booksList);
            return booksList;

        }
        catch (IOException | CsvValidationException e) {

            throw new RuntimeException(e);
        }
    }

    public void searchById(long id){
        for(Book book : getBookDetails()){
            if(id == book.getISBM()){
                System.out.println(book);
            }
        }
    }

    public void searchByBook(String bookName){
        for (Book book : getBookDetails()){
            if(bookName.equalsIgnoreCase(book.getBookName())){
                System.out.println(book);
            }
            else {
                System.out.println("Book not Found");
            }
        }
    }

    public void searchByAuthor(String author){
        for(Book book : getBookDetails()){
            if(author.equalsIgnoreCase(book.getAuthor())){
                System.out.println(book);
            }
        }
    }

    public void searchByCategory(String category){
        for(Book book : getBookDetails()){
            if(category.equalsIgnoreCase(book.getCategory())){
                System.out.println(book);
            }
        }
    }

    public void searchByYear(int year){
        for (Book book : getBookDetails()){
            if(year == book.getReleaseYear()){
                System.out.println(book);
            }
        }
    }
}
