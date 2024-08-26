package in.co.nmsworks.week3.day5;

import in.co.nmsworks.week3.day5.Library;

import java.util.*;
//Books
//  * Add Book
//  * Search Book
//Search by ISBN
//Search by Name
//Search by Author
//Search by Category
//  * Delete Book
//
//Operations
//  * Rent a Book
//  * Return a Book
//  * Check Book Availabilit

public class LibraryFunction {
    public static void main(String[] args){

            Library l = new Library();

            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("\n***********************************************\n Welcome to Library");
                System.out.println("1. books");
                System.out.println("2. rent or return");
                System.out.println("3. Quit \n");
                System.out.print("Enter Your Choice (1/2/3) :: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("\n\nChoose function \n\t 1. Add a Book\n\t 2.Search a  book\n\t 3. Delete book \nEnter Choice (1/2/3) :: ");
                        int value = scanner.nextInt();
                        if (value < 1 || value > 3) {
                            System.err.println("Invalid  number.");
                            break;
                        }
                        if (value == 1) {
                            l.addBook();
                        } else if (value == 3) {
                            System.out.println("enter the book name to delete::");
                            String bookname = scanner.nextLine();
                            l.deletebook(bookname);
                        } else {
                            System.out.print("\n\nChoose function \n\t 1. Search by id\n\t 2.Search by name\n\t 3.search by author\n\t4.search by category \nEnter Choice (1/2/3/4) ::");
                            int searchnum = scanner.nextInt();
                            switch (searchnum) {
                                case 1:
                                    System.out.println("enter the id to search::");
                                    long id = scanner.nextLong();
                                    l.searchBookbyID(id);
                                    break;
                                case 2:
                                    System.out.println("enter the name to search::");
                                    String name = scanner.nextLine();
                                    l.searchBookbyName(name);
                                    break;
                                case 3:
                                    System.out.println("enter the author to search::");
                                    String author = scanner.nextLine();
                                    l.searchBookbyAuthor(author);
                                    break;
                                case 4:
                                    System.out.println("enter the category to search::");
                                    String category = scanner.nextLine();
                                    l.searchBookbyCategory(category);
                                    break;
                                default:
                                    System.out.println("invalid number");
                            }

                        }

                    case 2:
                        System.out.print("\n\nChoose operation \n\t 1. rent a book\n\t 2. return a book\n\t 3. check Availability\nEnter Choice (1/2/3) :: ");
                        int val = scanner.nextInt();
                        if (val < 1 || val > 3) {
                            System.out.println("Invalid screen number.");
                            break;
                        }
                        switch (val) {
                            case 1:
                                System.out.println("enter the book name::");
                                String name = scanner.nextLine();
                                l.rentBook(name);
                                break;
                            case 2:
                                System.out.println("enter the book name::");
                                String bname = scanner.nextLine();
                                l.returnBook(bname);
                                break;
                            case 3:
                                System.out.println("enter the book name::");
                                String bookname = scanner.nextLine();
                                l.checkAvailability(bookname);
                                break;
                        }


                    case 3:
                        System.out.println("Thank You for visiting our Library");
                        return;

                    default:
                        System.out.println("Invalid Option !!");
                }
            }

    }

}
