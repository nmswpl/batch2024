package in.co.nmsworks.week3.assignment.Day5;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private String name;
    private Long id;
    private String category;
    private String author;

    public Books() {
    }

    public Books(Long id, String name, String author, String category, boolean b) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", booksList=" + booksList +
                '}';
    }

    List<String> booksList = new ArrayList<>();

    public List<String> getBooksListFromCsv() {
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
                booksList.add(String.valueOf(book));// sample code
                //System.out.println(booksList);
                return booksList;

            }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return java.util.Collections.emptyList();
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.getBooksListFromCsv();
        //books.searchById(2308202401L);
        books.searchByName(" To Kill a Mockingbird ");
        books.searchByAuthor("Vladimir Nabokov");
        books.searchByCategory("Fiction");
    }

   /*public void searchById(Long id) {
        for (String value : booksList) {
            if (Long.parseLong(value) == id){
                System.out.println(booksList.get(value));
            }
        }
    }*/
    public void searchByName(String name){
        for(String bookName : booksList){
            if(name.equals(bookName)){
                System.out.println(bookName);
            }
        }

    }
    public void searchByAuthor(String author){
        for(String authorName : booksList){
            if(author.equals(authorName)){
                System.out.println(booksList);
            }
        }
    }
    public void searchByCategory(String category){
        for(String categoryName : booksList){
            if(category.equals(categoryName)){
                System.out.println(categoryName);
            }
        }
    }
}

