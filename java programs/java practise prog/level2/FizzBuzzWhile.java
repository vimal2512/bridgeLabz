import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Step 2: Validate
        if (number < 1) {
            System.out.println(" Please enter a valid positive integer.");
        } else {
            System.out.println("FizzBuzz result from 0 to " + number + ":");

            // Step 3: Use while loop
            int i = 0;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 && i != 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0 && i != 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}
