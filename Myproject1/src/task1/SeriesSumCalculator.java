package task1;

import java.util.Scanner;

public class SeriesSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of p: ");
        int p = scanner.nextInt();

        double seriesSum = calculateSeriesSum(p);

        System.out.println("\nSum of the series up to term " + p + ": " + seriesSum);

        scanner.close();
    }

    private static double calculateSeriesSum(int p) {
        double sum = 0;
        double term = 2.5;

        for (int i = 1; i <= p; i++) {
            sum += term;
            term += 2; 
        }

        return sum;
    }
}