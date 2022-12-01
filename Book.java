package librarycatalogue;

public class Book{

  String title;
  int pageCount;
  int ISBN;
  boolean isCheckOut;
  int dayCheckOut = -1;

  public Book(String bookTitle, int bookPageCount, int bookISBN){
    this.title = bookTitle;
    this.pageCount = bookPageCount;
    this.ISBN = bookISBN;
    isCheckOut = false;
  }
}
