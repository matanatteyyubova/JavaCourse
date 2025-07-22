import java.util.Scanner;

public class Main {
    public static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Full Name:");
        Student student = new Student();
        student.fullName = scanner.nextLine();

        System.out.println("Enter Student Age:");
        student.age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Student ID:");
        student.studentId = scanner.nextLine();

        System.out.println("Enter Course Name:");
        student.course = scanner.nextLine();

        student.printStudentInfo();

        System.out.println("\nVowels in student name: " + student.countVowelsInName());
        System.out.println("Is name longer than 10? " + student.isNameLongerThan(10));

        System.out.println("Enter a keyword to check in course:");
        String keyword = scanner.nextLine();
        System.out.println("Does course contain '" + keyword + "'? " + student.isCourseNameContains(keyword));

        System.out.println("Enter new course to change:");
        String newCourse = scanner.nextLine();
        student.changeCourse(newCourse);
        System.out.println("-- After changing course --");
        System.out.println("New Course: " + student.course);



    //[INSTRUCTOR INFO]
        System.out.println("Enter Instructor Full Name:");
        Instructor instructor =new Instructor();
        instructor.fullName = scanner.nextLine();

        System.out.println("Enter Instructor Age:");
        instructor.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Instructor subject:");
        instructor.subject =scanner.nextLine();

        System.out.println("Enter Instructor Department:");
        instructor.department=scanner.nextLine();

        System.out.println("\nVowels in in name: " + instructor.countVowelsInName());
        System.out.println("\nIs name longer than 10?" + instructor.isNameLongerThan(10));
        System.out.println("\nEnter prefix to check in subject:");
        String prefix =scanner.nextLine();
        System.out.println("Does subject start with " + prefix + "?" + instructor.isSubjectStartsWith(prefix));


    }
}
