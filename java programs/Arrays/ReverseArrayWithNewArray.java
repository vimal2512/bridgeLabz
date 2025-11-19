public class ReverseArrayWithNewArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] reversed = new int[original.length];

        // Fill reversed array with elements from the end of original array
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Print reversed array
        System.out.print("Reversed array (new array): ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
