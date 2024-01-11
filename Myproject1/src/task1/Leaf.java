package task1;

public class Leaf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSamplesCollected = 0;
        int rounds = 0;
           while (true) {
            System.out.print("the number of  samples collected in this round: ");
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

        System.out.println("\nAsif went for " + rounds + " rounds around the park.");
        System.out.println("total samples is" + totalSamplesCollected + " leaves");

        scanner.close();
    }
}
