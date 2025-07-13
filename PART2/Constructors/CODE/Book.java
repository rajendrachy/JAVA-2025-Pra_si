package PART2.Constructors.CODE;
//---------Create a Book class for the library system.--------------

class Book{
  static int totalnoOfBooks;
  String author;
  String title;
  String isbn;

  boolean isBorrow;

  static {
    totalnoOfBooks = 0;
    
  }

  { // object init
    totalnoOfBooks++;

  }

  Book(String isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
   

  }


  Book(String isbn) {
    this(isbn, "Unknown", "Unknown");
  }


  static int getTotalNoofBooks() {
    return totalnoOfBooks;
  }

  void borrowBook() {
    if(isBorrow) {
      System.out.println("Book is already borrowed.");
      
    } else {
    this.isBorrow = true;
      System.out.println("Book borrowed successfully.");
    }
    

  }


  void returnBook() {
    if(!isBorrow) {
      System.out.println("Book is not borrowed.");
      
    } else {
      this.isBorrow = false;
      System.out.println("Book returned successfully.");
    }
    
  }



  public static void main(String[] args) {
    Book book1 = new Book("1234567890", "Java Programming", "John Doe");
    Book book2 = new Book("0987654321", "Python Programming", "Jane Smith");
    Book book3 = new Book("1122334455");

    System.out.println("Total number of books: " + Book.getTotalNoofBooks());

    book1.borrowBook();
    book2.borrowBook();
    book1.returnBook();
    book3.borrowBook();

    System.out.println("Total number of books after borrowing: " + Book.getTotalNoofBooks());
  }

}


