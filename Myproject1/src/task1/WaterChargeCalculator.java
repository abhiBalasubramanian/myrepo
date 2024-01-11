package task1;

import java.util.Scanner;

public class WaterChargeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units of water consumed: ");
        int unitsConsumed = scanner.nextInt();

        double totalCharge = calculateWaterCharge(unitsConsumed);

        System.out.println("\nTotal charge for " + unitsConsumed + " units: Rs " + totalCharge);

        scanner.close();
    }

    private static double calculateWaterCharge(int unitsConsumed) {
        double rateForFirst100Units = 2.00;
        double rateForNext200Units = 3.00;
        double rateForAbove300Units = 5.00;
        double surchargeRate = 0.025; 

        double totalCharge = 0;

        if (unitsConsumed <= 100) {
            totalCharge = unitsConsumed * rateForFirst100Units;
        } else if (unitsConsumed <= 300) {
            totalCharge = 100 * rateForFirst100Units +
                          (unitsConsumed - 100) * rateForNext200Units;
        } else {
            totalCharge = 100 * rateForFirst100Units +
                          200 * rateForNext200Units +
                          (unitsConsumed - 300) * rateForAbove300Units;

            
            double surcharge = totalCharge * surchargeRate;
            totalCharge += surcharge;
        }

        return totalCharge;
    }
}
