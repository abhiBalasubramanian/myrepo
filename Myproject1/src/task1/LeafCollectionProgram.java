package task1;

import java.util.Scanner;

public class LeafCollectionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSamplesCollected = 0;
        int rounds = 0;

        System.out.println("Asif is collecting leaf samples in the park.");

        while (true) {
            System.out.print("Enter the number of leaf samples collected during this round (enter 0 to finish): ");
            int samplesInThisRound = scanner.nextInt();

            if (samplesInThisRound == 0) {
                break; // Exit the loop if the user enters 0
            }

            totalSamplesCollected += samplesInThisRound;
            rounds++;
            
            if (totalSamplesCollected >= 30) {
                break; // Exit the loop if at least 30 samples are collected
            }
        }

        System.out.println("\nAsif completed " + rounds + " rounds around the park.");
        System.out.println("He collected a total of " + totalSamplesCollected + " leaf samples.");

        scanner.close();
    }
}