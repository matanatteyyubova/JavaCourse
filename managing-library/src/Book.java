public class Book {
    String title ;
    String author;
    String isbn;

    public Book( String title,String author,String isbn){
        this.title =title;
        this.author=author;
        this.isbn=isbn;
    }

    public  void printBookDetails(){
        System.out.println("\nBOOK INFO");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
