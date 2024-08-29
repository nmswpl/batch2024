package in.co.nmsworks.week4;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book
{
    String bookTitle;
    long ISBN;
    String author;
    String gerne;
    int yearOfRelease;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        this.gerne = gerne;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Book(String bookTitle, long ISBN, String author, String gerne, int yearOfRelease, boolean b) {
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.author = author;
        this.gerne = gerne;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", gerne='" + gerne + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
 class runner {
     List<Book> bookList = new ArrayList<>();
     Map<String,List<Book>> titleMap=new HashMap<>();
     Map<String,List<Book>> authorMap=new HashMap<>();
     Map<Long,List<Book>> isbnMap=new HashMap<>();
     Map<String,List<Book>> gerneMap=new HashMap<>();

     public List<Book> getBookListFromCsv() {
         try (FileReader reader = new FileReader("/home/nms/Documents/Library.csv");
              CSVReader csvReader = new CSVReader(reader)) {

             csvReader.skip(1);
             String[] bookDetails;
             while ((bookDetails = csvReader.readNext()) != null) {
                 long ISBN = Long.parseLong(bookDetails[0].trim());
                 String bookName = bookDetails[1].trim();
                 String author = bookDetails[2].trim();
                 String category = bookDetails[3].trim();
                 int releaseYear = Integer.parseInt(bookDetails[4].trim());
                 Book book = new Book(bookName, ISBN, author, category, releaseYear, true);
                 bookList.add(book);       // sample code
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         } catch (CsvValidationException e) {
             throw new RuntimeException(e);
         }
         return bookList;
     }



     public void searchByISBN(long id,List<Book> ls)
     {
         int c=0;
         for (Book book : bookList)
         {
             long isbn = book.getISBN();
             if (isbn==id)
             {
                 c = c + 1;
                 System.out.println(" Book is available  :: "+book);
             }
         }
             if (c!=1)
             {
                 System.out.println(" Book not found");
             }
         }

     public void searchByAuthor(String name,List<Book> ls)
     {
         int c=0;
         for (Book book : bookList)
         {
             String author = book.getAuthor();
             if (author.equalsIgnoreCase(name))
             {
                 c = c + 1;
                 System.out.println(" Book is available  :: "+book);
             }
         }
         if (c!=1)
         {
             System.out.println(" Book not found");
         }
     }
     public void searchByGerne(String g,List<Book> ls)
     {
         int c=0;
         for (Book book : bookList)
         {
             String gerne = book.getGerne();
             if (gerne.equalsIgnoreCase(g))
             {
                 c = c + 1;
                 System.out.println(" Book is available  :: "+book);
             }
         }
         if (c!=1)
         {
             System.out.println(" Book not found");
         }
     }
     public void searchByTitle(String name,List<Book> ls)
     {
         int c=0;
         for (Book book : bookList)
         {
             String title = book.getBookTitle();
             if (title.equalsIgnoreCase(name))
             {
                 c = c + 1;
                 System.out.println(" Book is available  :: "+book);
             }
         }
         if (c!=1)
         {
             System.out.println(" Book not found");
         }
     }
     public void display(List<Book> ls)
     {
         for (Book book : bookList)
         {
             System.out.println(book);
         }
     }

     public void usingMap(List<Book> list)
     {

         for (Book book : bookList)
         {
             titleMap.put(book.getBookTitle(),list);
             authorMap.put(book.getAuthor(), list);
             isbnMap.put(book.getISBN(),list);
             gerneMap.put(book.getGerne(), list);
         }
     }

     public static void main(String[] args) {
         runner ob=new runner();
         List<Book> list=ob.getBookListFromCsv();
         ob.searchByTitle("Pride and Prejudice",list);
         ob.searchByISBN(2308202444L,list);
         ob.searchByAuthor("Jane Austen",list);
         ob.searchByGerne("Romance/Tragicomedy",list);
         ob.usingMap(list);

         //ob.display(list);


     }
 }