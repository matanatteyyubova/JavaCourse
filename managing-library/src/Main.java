import java.util.Scanner;

public class Main {
   public  static  void  main(String[] args){
       Scanner scanner = new Scanner(System.in);
       Library.printWelcomeMessage();
       // Member info
       System.out.print("Enter member name: ");
       String name = scanner.nextLine();

       System.out.print("Enter member age: ");
       int age = scanner.nextInt();
       scanner.nextLine(); // consume newline

       System.out.print("Enter member ID: ");
       String memberId = scanner.nextLine();

       // Book info
       System.out.print("\nEnter book title: ");
       String bookTitle = scanner.nextLine();

       System.out.print("Enter book author: ");
       String bookAuthor = scanner.nextLine();

       System.out.print("Enter book ISBN: ");
       String bookIsbn = scanner.nextLine();

       Member member = new Member(name, age, memberId);
       Book book = new Book(bookTitle, bookAuthor, bookIsbn);
       Library library = new Library();

       book.printBookDetails();
       System.out.println();
       member.borrowBook(bookTitle);
       System.out.println();
       library.printLibraryRules();
   }

}
