public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        boolean isSorted = true; 

        // Loop through the array and compare each element to the next
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;  // Found an unsorted pair
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
        }
    }
}
