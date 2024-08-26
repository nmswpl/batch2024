package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class BooksWithMap {
    Map<Long,Book> idToBook=new HashMap<>();
    Map<String,Book> nameToBook=new HashMap<>();
    Map<String,List<Book>> authorToBook=new HashMap<>();
    Map<String,List<Book>> categoryToBook=new HashMap<>();

    public void fileParsing(){
        try (FileReader reader = new FileReader("/home/nms/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null){
                Long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                Integer releaseYear = Integer.parseInt(bookDetails[4].trim());
                Book book = new Book(ISBN, bookName, author, category, releaseYear);
                idToBook.put(ISBN, book);       // sample code
                nameToBook.put(bookName, book);       // sample code
                if (authorToBook.containsKey(author)) {
                    List<Book> listOfBook1 = new ArrayList<>(authorToBook.get(author));
                    listOfBook1.add(book);
                    authorToBook.put(author, listOfBook1);
                } else {
                    List<Book> listOfBook2 = new ArrayList<>();
                    listOfBook2.add(book);
                    authorToBook.put(author, listOfBook2);
                }
                if (categoryToBook.containsKey(category)) {
                    List<Book> listOfBook = new ArrayList<>(categoryToBook.get(category));
                    listOfBook.add(book);
                    categoryToBook.put(category, listOfBook);
                } else {
                    List<Book> listOfBook = new ArrayList<>();
                    listOfBook.add(book);
                    categoryToBook.put(category, listOfBook);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void searchByid(Long id){
         System.out.println("the id of the book is::"+idToBook.get(id).getId());
         System.out.println("the name is  " + idToBook.get(id).getBookName());
         System.out.println("the author of the book is::" + idToBook.get(id).getAuthor());
         System.out.println("the category of the book is::" + idToBook.get(id).getCategory());
         System.out.println("the year of the release  of the book is::" + idToBook.get(id).getYearOfRelease());
        System.out.println();

    }

    public void searchByName(String name){
         System.out.println("the id of the book is::"+nameToBook.get(name).getId());
         System.out.println("the name is  " + nameToBook.get(name).getBookName());
         System.out.println("the author of the book is::" + nameToBook.get(name).getAuthor());
         System.out.println("the category of the book is::" + nameToBook.get(name).getCategory());
         System.out.println("the year of the release  of the book is::" + nameToBook.get(name).getYearOfRelease());
        System.out.println();
    }
    public void searchByAuthorName(String author){
        if (authorToBook.get(author)!=null) {
            List<Book> booksList = authorToBook.get(author);
            for (Book book : booksList) {
                System.out.println("the id of the book is::" + book.getId());
                System.out.println("the name is  " + book.getBookName());
                System.out.println("the author of the book is::" + book.getAuthor());
                System.out.println("the category of the book is::" + book.getCategory());
                System.out.println("the year of the release  of the book is::" + book.getYearOfRelease());
                System.out.println();
            }
        }else
            System.out.println("not found");
    }
    public void searchByCategory(String category){
        if(categoryToBook.get(category)!=null) {
            List<Book> booksList = categoryToBook.get(category);
            for (Book book : booksList) {
                System.out.println("the id of the book is::" + book.getId());
                System.out.println("the name is  " + book.getBookName());
                System.out.println("the author of the book is::" + book.getAuthor());
                System.out.println("the category of the book is::" + book.getCategory());
                System.out.println("the year of the release  of the book is::" + book.getYearOfRelease());
                System.out.println();
            }
        }
        else
            System.out.println("not found");
    }

}
