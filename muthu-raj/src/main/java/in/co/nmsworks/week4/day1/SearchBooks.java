package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.*;

public class SearchBooks {

    private static Map<Long, Book> idMap = new HashMap<>();
    private static  Map<String, List<Book>> authorMap = new HashMap<>();
    private static Map<String, List<Book>> titleMap = new HashMap<>();
    private static Map<String, List<Book>> categoryMap = new HashMap<>();

    public static void main(String[] args) {

        List<Book> booksList = getBookListFromCSV();

//        id
        for (Book books : booksList) {
            idMap.put(books.getId(), books);
        }

//        Authors
        for (Book books : booksList) {
            List<Book> temp;
            if(!(authorMap.containsKey(books.getAuthor())))
            {
                temp = new ArrayList<>();
                temp.add(books);
            }
            else
            {
                temp = authorMap.get(books.getAuthor());
                temp.add(books);
            }
            authorMap.put(books.getAuthor(), temp);
        }

// Title
        for (Book books : booksList) {
            List<Book> temp;
            if(!(titleMap.containsKey(books.getTitle())))
            {
                temp = new ArrayList<>();
                temp.add(books);
            }
            else
            {
                temp = titleMap.get(books.getTitle());
                temp.add(books);
            }
            titleMap.put(books.getTitle(), temp);
        }

// Category
        for (Book books : booksList) {
            List<Book> temp;
            if(!(categoryMap.containsKey(books.getCategory())))
            {
                temp = new ArrayList<>();
                temp.add(books);
            }
            else
            {
                temp = categoryMap.get(books.getCategory());
                temp.add(books);
            }
            categoryMap.put(books.getCategory(), temp);
        }
        
        searchBookList();

    }

    private static void searchBookList() {

        Scanner sc = new Scanner(System.in);
        int value;

        do {
            System.out.println("1. Search by ISBN" +
                    "\n2. Search by Name" +
                    "\n3. Search by Author" +
                    "\n4. Search by Category" +
                    "\n5. Exit search"
            );
            System.out.println("Enter your choice :: ");
            value = sc.nextInt();

            switch (value) {
                case 1:
                    System.out.print("Enter ISBN :: ");
                    sc.nextLine();
                    String id = sc.next();
                    System.out.println(idMap.get(Long.parseLong(id)));
                    break;

                case 2:
                    System.out.print("Enter Name :: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    for (Book book : titleMap.get(name)) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.println("Enter Author :: ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    for (Book book : authorMap.get(author)) {
                        System.out.println(book);
                    }
                    break;

                case 4:
                    System.out.println("Enter Category :: ");
                    sc.nextLine();
                    String category = sc.nextLine();
                    for (Book book : categoryMap.get(category)) {
                        System.out.println(book);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while (value != 5);
    }



    private static List<Book> getBookListFromCSV() {
        List<Book> bookList = new ArrayList<>();
        Book b;
        try (FileReader fr = new FileReader("/home/nms/Library.csv");
             CSVReader cr = new CSVReaderBuilder(fr).withSkipLines(1).build())
        {
            String[] row = cr.readNext();

            while (row != null) {
                b = new Book();
                b.setId(Long.parseLong(row[0].trim()));
                b.setTitle(row[1].trim());
                b.setAuthor(row[2].trim());
                b.setCategory(row[3].trim());
                b.setYearOfRelease(Integer.parseInt(row[4].trim()));

                bookList.add(b);
                row = cr.readNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
