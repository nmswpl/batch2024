package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        Library library = new Library();
        library.csvToList();

    }

    public  List<Book> csvToList(){
        try {
            FileReader fr = new FileReader("/home/nms/Downloads/Library.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            List<Book> listOfBooks = new ArrayList<>();

            while ( (line =  br.readLine()) != null){
                String[] words = line.split(",");
                System.out.println(Arrays.toString(words));
                Book book = new Book(Long.parseLong(words[0].trim()),words[1].trim(),
                        words[2].trim(),words[3].trim(),Integer.parseInt(words[4].trim()));
                listOfBooks.add(book);
            }
            for (Book books : listOfBooks){
                System.out.println(books);
            }
            br.close();
            fr.close();
            return listOfBooks;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
