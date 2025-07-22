public class Student extends  Person{
   String studentId;
   String course;

    void printStudentInfo(){
        System.out.println("\n[STUDENT INFO]");
        printInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);

    }
    void changeCourse(String newCourse){
        course =newCourse;
    }

    boolean isCourseNameContains(String keyword){
        return  course.toLowerCase().contains(keyword.toLowerCase());
    }
}
