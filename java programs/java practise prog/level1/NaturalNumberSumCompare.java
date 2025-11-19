import java.util.Scanner;

public class NaturalNumberSumCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Step 2: Using formula
            int sumFormula = n * (n + 1) / 2;

            // Step 3: Using while loop
            int sumLoop = 0;
            int i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            // Step 4: Show both results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumLoop);

            // Step 5: Compare results
            if (sumFormula == sumLoop) {
                System.out.println("✅ Both results match!");
            } else {
                System.out.println("❌ Results do not match.");
            }
        }

        sc.close();
    }
}
