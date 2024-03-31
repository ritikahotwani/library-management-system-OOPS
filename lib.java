// using ArrayList 

package librarymanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String bookname;
    public Book(String string) {
        bookname= string;
    }
    
}


public class lib {
    // String listOfBooks[]=new String[10];
    static ArrayList<String> listOfBooks = new ArrayList<String>(); 
    public static void addBook(String bookname){
        listOfBooks.add(bookname);
        System.out.println("Added!");
    }
    public static void displayAllBooks(){
 

            if (listOfBooks.isEmpty()){
                System.out.println("No available books!");
            }
            else{
                System.out.print("[");
                for (int i = 0; i < listOfBooks.size(); i++) {
            
                    System.out.println(listOfBooks.get(i));
                    
                }
                System.out.print("]");
            }
  
        System.out.print("]");
        System.out.println();
    }
    public static void borrowBook(String bookname){
        Boolean exists=listOfBooks.contains(bookname);
        if (exists){
            listOfBooks.remove(bookname);
            System.out.println("You can have the " +bookname + " book. Return after 5 days");
        }
        else{
            System.out.println("Sorry the book "+bookname+" is out of stock. Come back tomorrow!");
        }
    }
    public static void returnBook(String bookname)
    {
        listOfBooks.add(bookname);
        System.out.println("Thank you! Visit again");
    }
    public static void searchBook(String bookname){
        if(listOfBooks.contains(bookname)){
            
        }
    }
    public static void main(String[] args) {
        Book book1=new Book("harrypotter");
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
        System.out.println("4.Display available books");
        System.out.println("5.Search a book");
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
                System.out.println("Exiting from library management system!");
                return;

        }
    }
    }
}
