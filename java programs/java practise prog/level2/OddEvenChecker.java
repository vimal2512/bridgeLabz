import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Step 2: Validate input
        if (number < 1) {
            System.out.println("Please enter a valid natural number (1 or greater).");
        } else {
            // Step 3: Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        sc.close();
    }
}
