package in.co.nmsworks.week3.day5;

public class Library {
    public static void main(String[] args) {
        Books b1 = new Books();
        b1.readFromFile();
        b1.writeIntoDb(b1.readFromFile());
        b1.addBook(2308202451L,"The Catcher in the Rye".trim(),"J.D. Salinger".trim(),"Young Adult / Fiction".trim(),"1951",true);
        b1.searchBookByISBN(2308202451L);
        b1.searchBookByName("The Great Gatsby".trim());
        b1.searchBookByAuthor("Jane Austen".trim());
        b1.searchBookByCategory("Fiction".trim());
        b1.deleteBook("Othello".trim());
        b1.rentBookByName("The Catcher in the Rye".trim());
        b1.returnBook("The Catcher in the Rye".trim());
        if(b1.checkAvailability("The Great Gatsby".trim())){
            System.out.println("Book is available...");
        }
        else {
            System.out.println("Sorry, Book is unavailable now.");
        }
    }
}