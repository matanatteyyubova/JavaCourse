public class Library {
    public  static  final String libraryName="City Library";

    public  static  void  printWelcomeMessage(){
        System.out.println("Welcome to" +libraryName +"!\n");
    }

    public void printLibraryRules() {
        System.out.println("Library Rules:");
        System.out.println("- No food or drinks allowed");
        System.out.println("- Return books within 2 weeks");
    }
}
