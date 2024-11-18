import java.util.Scanner;

public class  IT24104177Lab5Q3 {
    // Constants
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int NO_DISCOUNT = 0;
    public static final int DISCOUNT_10_PERCENT = 10;
    public static final int DISCOUNT_20_PERCENT = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.println("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Invalid date entered. Start and end dates must be between 1 and 31.");
            scanner.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Invalid date range. Start date should be less than end date.");
            scanner.close();
            return;
        }

                int daysReserved = endDate - startDate;

                int discountRate;
        if (daysReserved < 3) {
            discountRate = NO_DISCOUNT;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10_PERCENT;
        } else {
            discountRate = DISCOUNT_20_PERCENT;
        }


        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * discountRate / 100;
        double finalAmount = totalAmount - discountAmount;

        
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + finalAmount);

        scanner.close();
    }
}
 