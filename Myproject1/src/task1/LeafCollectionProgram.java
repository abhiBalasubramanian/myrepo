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
                break;
            }

            totalSamplesCollected += samplesInThisRound;
            rounds++;
            
            if (totalSamplesCollected >= 30) {
                break; 
            }
        }

        System.out.println("\nAsif completed " + rounds + " rounds around the park.");
        System.out.println("He collected a total of " + totalSamplesCollected + " leaf samples.");

        scanner.close();
    }
}