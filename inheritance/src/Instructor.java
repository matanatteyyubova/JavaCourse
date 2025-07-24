public class Instructor extends Person{
    String subject;
    String department;
    void  printInstructorInfo(){
        System.out.println("\n[INSTRUCTOR INFO]");
        printInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }

     boolean isSubjectStartsWith(String prefix){
        return  subject.toLowerCase().startsWith(prefix.toLowerCase());
     }
}
