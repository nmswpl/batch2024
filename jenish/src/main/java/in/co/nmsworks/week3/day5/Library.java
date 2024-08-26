package in.co.nmsworks.week3.day5;

import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n***********************************************\n Welcome to the Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book by ISBN");
            System.out.println("3. Search Book by Name");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Search Book by Category");
            System.out.println("6. Delete Book");
            System.out.println("7. Rent Book");
            System.out.println("8. Return Book");
            System.out.println("9. Check Book Availability");
            System.out.println("10. Load Books from CSV and Insert into DB");
            System.out.println("11. Quit \n");
            System.out.print("Enter Your Choice (1-10) :: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    long ISBN = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Release Year: ");
                    String releaseYear = scanner.nextLine();
                    System.out.print("Is the book available (true/false): ");
                    boolean status = scanner.nextBoolean();
                    books.addBook(ISBN, bookName, author, category, releaseYear, status);
                    break;

                case 2:
                    System.out.print("Enter ISBN to search: ");
                    ISBN = scanner.nextLong();
                    books.searchBookByISBN(ISBN);
                    break;

                case 3:
                    System.out.print("Enter Book Name to search: ");
                    bookName = scanner.nextLine();
                    books.searchBookByName(bookName);
                    break;

                case 4:
                    System.out.print("Enter Author to search: ");
                    author = scanner.nextLine();
                    books.searchBookByAuthor(author);
                    break;

                case 5:
                    System.out.print("Enter Category to search: ");
                    category = scanner.nextLine();
                    books.searchBookByCategory(category);
                    break;

                case 6:
                    System.out.print("Enter Book Name to delete: ");
                    bookName = scanner.nextLine();
                    books.deleteBook(bookName);
                    break;

                case 7:
                    System.out.print("Enter Book Name to rent: ");
                    bookName = scanner.nextLine();
                    books.rentBookByName(bookName);
                    break;

                case 8:
                    System.out.print("Enter Book Name to return: ");
                    bookName = scanner.nextLine();
                    books.returnBook(bookName);
                    break;

                case 9:
                    System.out.print("Enter Book Name to check availability: ");
                    bookName = scanner.nextLine();
                    boolean isAvailable = books.checkAvailability(bookName);
                    if (isAvailable) {
                        System.out.println("The book is available.");
                    } else {
                        System.out.println("Sorry, Book is unavailable now.");
                    }
                    break;

                case 10:
                    List<Books> booksList = books.readFromFile();
                    books.writeIntoDb(booksList);
                    break;

                case 11:
                    System.out.println("Thank You for using the Library Management System");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Option !!");
            }
        }
    }
}