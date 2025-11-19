import java.util.Scanner;

public class Strings {

    //. Method to demonstrate string passing
    public static void changeString(String str) {
        str = "Modified";
        System.out.println("Inside method: " + str); // Modified
    }

    public static void main(String[] args) {


        System.out.println("🎯 1. What is a String?");
        String greeting = "Hello Java!";
        System.out.println("Greeting: " + greeting); // Hello Java!
        System.out.println();


        System.out.println("🎯 2. String Immutability");
        String str1 = "Hi";
        String str2 = str1.concat(" There");
        System.out.println("Original: " + str1);     // Hi
        System.out.println("Modified: " + str2);     // Hi There
        System.out.println();

        // 🗣️ str1 is unchanged. str2 is a new object — this shows immutability.

        System.out.println("🎯 3. String Pool vs new keyword");
        String pool1 = "Java";
        String pool2 = "Java";
        String heap1 = new String("Java");

        System.out.println("pool1 == pool2: " + (pool1 == pool2)); // true
        System.out.println("pool1 == heap1: " + (pool1 == heap1)); // false
        System.out.println("pool1.equals(heap1): " + pool1.equals(heap1)); // true
        System.out.println();

        // 🗣️ '==' compares memory, '.equals()' compares values.

        System.out.println("🎯 4. StringBuilder vs String");
        String slow = "";
        for (int i = 0; i < 3; i++) {
            slow += i;
        }
        System.out.println("Using String: " + slow); // 012

        StringBuilder fast = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            fast.append(i);
        }
        System.out.println("Using StringBuilder: " + fast.toString()); // 012
        System.out.println();

        // 🗣️ StringBuilder is more memory-efficient for repeated concatenation.

        System.out.println("🎯 5. Escape Sequences");
        System.out.println("New Line:\nSecond Line");
        System.out.println("Tab\tSpace");
        System.out.println("Quotes: \"Hello\"");
        System.out.println();

        // 🗣️ Escape sequences format special characters inside strings.

        System.out.println("🎯 6. Input using Scanner");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Welcome, " + fullName);
        System.out.println();

        // 🗣️ nextLine() reads an entire line including spaces.

        System.out.println("🎯 7. String Arrays");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println();

        // 🗣️ Arrays hold multiple strings. Use for-each loop to print them.

        System.out.println("🎯 8. Passing Strings to Methods");
        String name = "Original";
        System.out.println("Before method: " + name); // Original
        changeString(name);
        System.out.println("After method: " + name);  // Original
        System.out.println();

        // 🗣️ Strings are passed by value (reference copy), so original doesn’t change.

        System.out.println("🎯 9. Exception Handling with Strings");
        String errorTest = null;
        try {
            System.out.println("Length: " + errorTest.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        scanner.close();
    }
}

