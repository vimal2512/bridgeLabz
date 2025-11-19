import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        // Step 1: Create a HashMap to hold number → count
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Loop through the array
        for (int num : arr) {
            // Check if the number already exists in the map
            if (frequencyMap.containsKey(num)) {
                // If yes, increment the count by 1
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If no, insert the number with count 1
                frequencyMap.put(num, 1);
            }
        }

        // Step 3: Print all key-value pairs (number → frequency)
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
