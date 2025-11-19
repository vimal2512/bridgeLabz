import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Step 2: Validate input
        if (number < 1) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            System.out.println("FizzBuzz result from 0 to " + number + ":");

            // Step 3: Loop from 0 to number
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 && i != 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0 && i != 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
