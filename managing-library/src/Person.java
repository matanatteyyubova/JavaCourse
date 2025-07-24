public class Person {
  protected   String fullName ;
  protected  int age;

  public Person(String fullName,int age){
      this.fullName = fullName;
      this.age =age;
  }

 void  printInfo(){
     System.out.println("Full Name:"+ fullName);
     System.out.println("Age:"+ age);

 }
}
