// Tests the expanded Book class, used with Chapter 8.

import java.util.*;

public class BookList
{
  public static Book getBookFromKeyboard ()
  {
    Scanner keyboard = new Scanner (System.in);
    System.out.println("Add a book of your own!");
    System.out.print("Enter the title of the book: ");
    String title = keyboard.nextLine();
    
    System.out.print("Author\'s last name: ");
    String authorLast = keyboard.nextLine();
    
    System.out.print("Author\'s first name: ");
    String authorFirst = keyboard.nextLine();
    
    System.out.print("Number of pages: ");
    int pages = keyboard.nextInt();
    String dummy = keyboard.nextLine ();  // clear the input line
    
    keyboard.close();
    return new Book(title, authorLast, authorFirst, pages);
    
  }
    
  
  public static void main(String[] args)
  {
    List<Book> bookList = new ArrayList<Book>();
    bookList.add(new Book ("Java Methods", "Litvin", "Maria", 688));
    bookList.add(new Book ("1984", "Orwell", "George", 688));
    bookList.add(new Book ("To Kill a Mockingbird", "Lee", "Harper", 281));
    bookList.add(getBookFromKeyboard());

    for (Book b : bookList)
     System.out.println(b);
  }
}
