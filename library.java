// using HasMap

package librarymanagementsystem;
import java.util.HashMap;
import java.util.Scanner;

class Book{
    String bookname;
    public Book(String string) {
        bookname= string;
    }
    
}


public class library {
    // String listOfBooks[]=new String[10];
    // static ArrayList<String> listOfBooks = new ArrayList<String>(); 
    static HashMap<String, Integer> listOfBooks = new HashMap<String, Integer>();

    public static void addBook(String bookname){
        listOfBooks.put(bookname,1);
        System.out.println("Book added!");
    }
    public static void displayAllBooks(){
        for (String i : listOfBooks.keySet()) {
            System.out.println(i);
          }
    }
    public static void displayAvailableBooks(){
       for (String i : listOfBooks.keySet()) {
            if(listOfBooks.get(i)==1){
                System.out.println(i);
            }    
          }
    }
    public static void borrowBook(String bookname){
        for (String i : listOfBooks.keySet()) {
            // System.out.println("key: " + i + " value: " + listOfBooks.get(i));
            if(i.equals(bookname) && listOfBooks.get(i)==1){
                System.out.println("You can have the " +bookname + " book. Return after 5 days");
                listOfBooks.put(i, 0);
                return;
            }    
          }
          System.out.println("Sorry the book "+bookname+" is out of stock. Come back tomorrow!");
    }
    public static void returnBook(String bookname) {

        if (listOfBooks.containsKey(bookname)) {
            if (listOfBooks.get(bookname) == 0) {
                listOfBooks.put(bookname, 1);
                System.out.println("Thank you for returning the book: " + bookname);
            } else {
                System.out.println("This book is not currently borrowed.");
            }
        } else {
            System.out.println("Sorry the book " + bookname + " doesn't exist.");
        }
    }
    
    public static void main(String[] args) {
        // Book book1=new Book("harrypotter");
        // System.out.println(book1.bookname);
        // addBook("ritika");
        // addBook("chaitanya");
        // addBook("eee");
        // displayAllBooks();
        // borrowBook("ritika");
        // displayAllBooks();
        // borrowBook("ritika");
        // returnBook("ritika");

        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Choose your option");
        System.out.println("1.Add a book");
        System.out.println("2.Borrow a book");
        System.out.println("3.Return a book");
        System.out.println("4.Display all books");
        System.out.println("5.Display available books");
        System.out.println("6.exit");
        int option=sc.nextInt();
        sc.nextLine(); // Consume newline character
        switch (option) {
            case 1:
                System.out.println("Book name?");
                String bookname=sc.nextLine();
                if(bookname!=""){
                    addBook(bookname);
                }
                break;
            case 2:
            System.out.println("Book name?");
            String bookToBorrow=sc.nextLine();
                borrowBook(bookToBorrow);
                break;
            case 3:
            System.out.println("Book name?");
            String bookToReturn=sc.nextLine();
                returnBook(bookToReturn);
                break;
            case 4:
                displayAllBooks();
                break;
            case 5:
                displayAvailableBooks();
                break;
            case 6:
                System.out.println("Exiting from library management system!");
                return;

        }
    }
    }
}
