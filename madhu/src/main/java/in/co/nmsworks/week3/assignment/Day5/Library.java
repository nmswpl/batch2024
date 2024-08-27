package in.co.nmsworks.week3.assignment.Day5;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    List<Books> booksList = new ArrayList<>();

    public List<Books> getBooksListFromCsv() {
        try (FileReader reader = new FileReader("/home/nms/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                Long id = Long.parseLong(bookDetails[0].trim());
                String name = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                Books book = new Books(id, name, author, category, true);
                //System.out.println(book.toString());
                booksList.add(book);// sample code
                //System.out.println(booksList);


            }return booksList;
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
       Library lib = new Library();
       lib.getBooksListFromCsv();
       lib.searchById(2308202409L);
       lib.searchByName("Outliers");
       lib.searchByAuthor("Jeannette Walls");
       lib.searchByCategory("Fiction");
    }

   public void searchById(Long id) {
       for (Books bookId : booksList) {
           if (Objects.equals(bookId.getId(), id)) {
               System.out.println("The book is is : " +bookId);
           }
       }
   }


    public void searchByName(String name) {
        for (Books bookName : booksList) {
            if (name.equals(bookName.getName())) {
                System.out.println("The book name is : " +bookName);
            }
        }

    }

    public void searchByAuthor(String author) {
        for (Books authorName : booksList) {
            if (author.equals(authorName.getAuthor())) {
                System.out.println("the author name is: " +authorName);
            }
        }
    }

    public void searchByCategory(String category) {
        for (Books categoryName : booksList) {
            if (category.equals(categoryName.getCategory())) {
                System.out.println("Books of this category: " +categoryName);
            }
        }
    }
}






