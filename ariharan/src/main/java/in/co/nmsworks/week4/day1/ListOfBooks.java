package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListOfBooks {

    List<Book> booksList = new ArrayList<>();

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
                Integer releaseYear =Integer.parseInt(bookDetails[4].trim());
                Book book = new Book(ISBN, bookName, author, category, releaseYear);
                booksList.add(book);       // sample code
            }
            System.out.println(booksList);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void searchByid(Long id){
        int flag=0;
        for (Book book : booksList) {
            if(Objects.equals(book.getId(), id)){
                System.out.println("the id of the book is::"+book.getId());
                System.out.println("the name is  " + book.getBookName());
                System.out.println("the author of the book is::" + book.getAuthor());
                System.out.println("the category of the book is::" + book.getCategory());
                System.out.println("the year of the release  of the book is::" + book.getYearOfRelease());
                flag=1;
                break;
            }
        }
        if (flag==0)
            System.out.println("the book is not found");
    }

    public void searchByName(String name){
        int flag=0;
        for (Book book : booksList) {
            if(book.getBookName().equals(name)){
                System.out.println("the id of the book is::"+book.getId());
                System.out.println("the name is  " + book.getBookName());
                System.out.println("the author of the book is::" + book.getAuthor());
                System.out.println("the category of the book is::" + book.getCategory());
                System.out.println("the year of the release  of the book is::" + book.getYearOfRelease());
                flag=1;
                break;
            }
        }
        if (flag==0)
            System.out.println("the book is not found");
    }
    public void searchByAuthorName(String author){
        int flag=0;
        for (Book book : booksList) {
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("the id of the book is::"+book.getId());
                System.out.println("the name is  " + book.getBookName());
                System.out.println("the author of the book is::" + book.getAuthor());
                System.out.println("the category of the book is::" + book.getCategory());
                System.out.println("the year of the release  of the book is::" + book.getYearOfRelease());
                flag=1;
            }
        }
        if (flag==0)
            System.out.println("the book is not found");
    }
    public void searchByCategory(String category){
        int flag=0;
        for (Book book : booksList) {
            if(book.getCategory().equalsIgnoreCase(category)){
                System.out.println("the id of the book is::"+book.getId());
                System.out.println("the name is  " + book.getBookName());
                System.out.println("the author of the book is::" + book.getAuthor());
                System.out.println("the category of the book is::" + book.getCategory());
                System.out.println("the year of the release  of the book is::" + book.getYearOfRelease());
                flag=1;
            }
        }
        if (flag==0)
            System.out.println("the book is not found");
    }


}
