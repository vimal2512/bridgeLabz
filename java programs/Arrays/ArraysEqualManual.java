public class ArraysEqualManual {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};

        boolean areEqual = true;

        // Step 1: Check lengths first
        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
            // Step 2: Compare elements one by one
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        // Final result
        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
    }
}
