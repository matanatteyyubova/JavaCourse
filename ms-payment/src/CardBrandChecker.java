import java.util.Scanner;

public class CardBrandChecker {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your card number:");
        String cardNumber = input.nextLine();
        cardNumber = cardNumber.replaceAll("\\s", "");

        if(cardNumber.length() != 16){
            System.out.println("Card number must be 16 digits!");
            return;
        }

        char firstDigit = cardNumber.charAt(0);

         if(firstDigit == '4') {
             System.out.println("Card brand: Visa");
         } else if (firstDigit == '5' || firstDigit == '6') {
             System.out.println("Card brand: Mastercard");
         }else {
             System.out.println("Unknown card brand");
         }
    }
}

