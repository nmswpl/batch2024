package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Book {
    private Long bookId;
    private String title;
    private String author;
    private String category;
    private int yearOfRealese;
    private boolean availabilty = true;

    private static Map<Long, Book> bookIdToBookMap = new HashMap<>();
    private static Map<String, Book> bookNameToBookMap = new HashMap<>();
    private static Map<String, List<Book>> bookAuthorToBooksMap = new HashMap<>();
    private static Map<String, List<Book>> bookCategoryToBooksMap = new HashMap<>();

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYearOfRealese() {
        return yearOfRealese;
    }

    public void setYearOfRealese(int yearOfRealese) {
        this.yearOfRealese = yearOfRealese;
    }

    public boolean isAvailabilty() {
        return availabilty;
    }

    public void setAvailabilty(boolean availabilty) {
        this.availabilty = availabilty;
    }

    public Book() {
    }

    public Book(Long bookId, String title, String author, String category, int yearOfRealese) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.yearOfRealese = yearOfRealese;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", yearOfRealese=" + yearOfRealese +
                ", availabilty=" + availabilty +
                '}';
    }

    public void showBookDetails() {
        System.out.println("Book Id : " + getBookId());
        System.out.println("Book Name : " + getTitle());
        System.out.println("Book Author : " + getAuthor());
        System.out.println("Book Category : " + getCategory());
        System.out.println("Book YearOfRealese : " + getYearOfRealese());
    }

    public static void initalizeMap() {
        try (FileReader fileReader = new FileReader("/home/nms/Downloads/Library.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("[\"\\s]+", "").trim();
                String[] entry = line.split(",");
                Long bookId = Long.parseLong(entry[0]);

                String title = entry[1];
                String author = entry[2];
                String category = entry[3];
                int yearOfRelease = Integer.parseInt(entry[4]);

                Book book = new Book(bookId, title, author, category, yearOfRelease);

                bookIdToBookMap.put(bookId, book);
                bookNameToBookMap.put(title, book);
                List<Book> booksByAuthor = bookAuthorToBooksMap.get(author);
                if (booksByAuthor == null) {
                    booksByAuthor = new ArrayList<>();
                    bookAuthorToBooksMap.put(author, booksByAuthor);
                }
                booksByAuthor.add(book);

                List<Book> booksByCategory = bookCategoryToBooksMap.get(category);
                if (booksByCategory == null) {
                    booksByCategory = new ArrayList<>();
                    bookCategoryToBooksMap.put(category, booksByCategory);
                }
                booksByCategory.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void searchById(Long id) {
        Book book = bookIdToBookMap.get(id);
        if (book != null) {
            System.out.println("The Book Details ....");
            book.showBookDetails();
        } else {
            System.out.println("The bookId was wrong....");
        }
    }

    public static void searchByName(String name) {
        Book book = bookNameToBookMap.get(name);
        if (book != null) {
            System.out.println("The Book Details ....");
            book.showBookDetails();
        } else {
            System.out.println("The bookName was wrong....");
        }
    }

    public static void searchByAuthor(String author) {
        List<Book> books = bookAuthorToBooksMap.get(author);
        if (books != null && !books.isEmpty()) {
            System.out.println("Books by Author " + author + " ....");
            for (Book book : books) {
                book.showBookDetails();
            }
        } else {
            System.out.println("The author was wrong....");
        }
    }

    public static void searchByCategory(String category) {
        List<Book> books = bookCategoryToBooksMap.get(category);
        if (books != null && !books.isEmpty()) {
            System.out.println("Books in Category " + category + " ....");
            for (Book book : books) {
                book.showBookDetails();
            }
        } else {
            System.out.println("The category was wrong....");
        }
    }

    public static void main(String[] args) {
        initalizeMap();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nMenu Options:");
            System.out.println("1. Search ById");
            System.out.println("2. Search ByName");
            System.out.println("3. Search ByAuthor");
            System.out.println("4. Search ByCategory");
            System.out.println("Type q to quit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().trim().toLowerCase();
            switch (choice) {
                case "1":
                    searchById(2308202401L);
                    break;
                case "2":
                    searchByName("Lolita");
                    break;
                case "3":
                    searchByAuthor("Sun Tzu");
                    break;
                case "4":
                    searchByCategory("Philosophy");
                    break;
                case "exit":
                case "e":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("q"));
        scanner.close();
    }
}