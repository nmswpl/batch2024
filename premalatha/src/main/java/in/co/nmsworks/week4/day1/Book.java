package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private long isbn;
    private String bookName;
    private String category;
    private String author;
    private int releaseYear;



    public Book(long isbn, String bookName, String author, String category, int releaseYear) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.category = category;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public long getIsbn() {

        return isbn;
    }

    public void setIsbn(long isbn) {

        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn=" + isbn +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                '}';
    }
}

