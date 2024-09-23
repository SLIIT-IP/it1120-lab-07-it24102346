import java.util.Scanner;

public class IT24102346Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_CUSTOMERS = 5;
        final double DISCOUNT_RATE = 0.05;

        for (int i = 1; i <= NUM_CUSTOMERS; i++) {
            System.out.print("Enter total bill amount for customer " + i + ": ");
            double billAmount = scanner.nextDouble();
            System.out.print("Enter mode of payment (C/c for cash, O/o for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * DISCOUNT_RATE;
                double amountToBePaid = billAmount - discount;
                System.out.printf("Discount: %.2f\n", discount);
                System.out.printf("Amount to be paid: %.2f\n", amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.printf("Amount to be paid: %.2f\n", billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }

        scanner.close();
    }
}