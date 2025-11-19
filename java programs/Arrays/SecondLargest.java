public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 50, 45};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE;   // Largest
        int second = Integer.MIN_VALUE;  // Second largest

        // Loop through array
        for (int num : arr) {
            if (num > first) {
                second = first;  // update second
                first = num;     // update first
            } else if (num > second && num != first) {
                second = num;    // update second only
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are equal)");
        } else {
            System.out.println("Second largest element: " + second);
        }
    }
}
