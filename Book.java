/*******************************************
  * A class to implement a Book 
  * Modified from the code in Chapter 4 (October) and Chapter 8 (November)
  * Ready to be used in the Library code, Spring 
  * 
  * @author Hathaway Brown APCS
  * @version February 2017
  */

public class Book
{
  private int numPages;
  private String title;
  private String authorFirst, authorLast;

  //------------------------------------------------------------------
  // Constructor
  //------------------------------------------------------------------
  /**
   * @param title Title of the Book
   * @param last Author Last Name
   * @param first Author First Name
   * @param pages number of pages in the Book
   */
  public Book(String title, String last, String first, int pages)
  {
    this.title = title;
    this.authorLast = last;
    this.authorFirst = first;
    numPages = pages;
  }

  //------------------------------------------------------------------
  // Accessor methods
  //------------------------------------------------------------------
  /** Returns the number of pages in the Book
   * @return the number of pages in the Book
   */
  public int getNumPages()
  {
    return numPages;
  }

  
   /**  Returns the title of the Book
   * @return the title of the Book
   */
  public String getTitle()
  {
    return title;
  }
  
   /** Returns the author's name
     * @return the author's name in the format "Last, First"   */
  public String getAuthor()
  {
    return authorLast + ", " + authorFirst;
  }  
  
  
//-----------------------------------------------------
//  Public Methods for Manipulating a Book
//-----------------------------------------------------
  
  /**
   * Overloads the default toString() method
   * @return book information in a four-line String
   */
  public String toString()
  {
    return getAuthor() + ".  " + getTitle() + "  (" + getNumPages() + " pages)";
  }
  
   /**
   * Searches for a keyword in the Book's title or author fields
   * 
   * @param keyword the word to search for
   * @return whether the keyword is found in the Book's title or author fields
   */
  public boolean findKeyword (String keyword)
  {
    String word = keyword.toLowerCase();
    return (title.toLowerCase().indexOf(word) >= 0) ||
           (authorLast.toLowerCase().indexOf(word) >= 0) ||
           (authorFirst.toLowerCase().indexOf(word) >= 0);
  }
}
