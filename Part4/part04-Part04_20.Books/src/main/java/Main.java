import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        // Start an empty array to  hold the values of the books
        ArrayList<Book> books = new ArrayList<>();
        
        // while loop to keep asking for books
        while(true) {
            System.out.println("Title: ");
            String title = scan.nextLine();
            if(title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scan.nextLine());
            
            // Add the info collected to the books list
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed? ");
        String info = scan.nextLine();
        
        // Loop through the books in the list
        for(Book livro: books) {
            if(info.equals("everything")) {
                System.out.println(livro);
            } else if (info.equals("name")) {
                System.out.println(livro.getName());
            }
        }

    }
}
