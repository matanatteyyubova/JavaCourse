public class Member extends  Person{
    String memberId;
    public Member(String fullName, int age, String memberId) {
        super(fullName, age);
        this.memberId = memberId;
    }

    public void borrowBook(String bookTitle) {
        System.out.println("Member " +fullName +" borrowed " + bookTitle);
    }

}
