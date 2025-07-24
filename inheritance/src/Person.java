public class Person {
    String fullName;
    int age;

    void printInfo(){
        System.out.println("Full Name:"+ fullName);
        System.out.println("Age:"+ age);
    }
    int countVowelsInName(){
        int count =0;
        String vowels ="aeiou";
        String name = fullName.toLowerCase();
        for(int j=0; j< name.length();j++){
           if(vowels.indexOf(name.charAt(j)) != -1){
               count++;
           }
        }
        return  count;
    }

    boolean isNameLongerThan (int length){
        return  fullName.length() > length;
    }
}
