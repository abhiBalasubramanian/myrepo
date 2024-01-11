package task1;

import java.util.Scanner;

public class NumberNamesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 9: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 9) {
            String[] numberNames = {
                    "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
            };

            System.out.println("Number Name: " + numberNames[number]);
        } else {
            System.out.println("Please enter a number between 0 and 9.");
        }

        scanner.close();
    }
}