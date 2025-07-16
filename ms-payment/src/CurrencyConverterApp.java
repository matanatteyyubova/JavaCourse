import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int converted = 0;
        int skipped = 0;
        double totalUsdPrice = 0;

        System.out.print("How many payments? ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter amount in USD: ");
            double amount = input.nextDouble();

            if (amount < 0) {
                skipped++;
            } else {
                converted++;
                totalUsdPrice += amount;
            }
        }

        double totalAznPrice = totalUsdPrice * 1.7;

        System.out.println("Payments converted: " + converted);
        System.out.println("Payments skipped: " + skipped);
        System.out.println("Total USD: " + totalUsdPrice);
        System.out.println("Total AZN: " + totalAznPrice);
    }
}