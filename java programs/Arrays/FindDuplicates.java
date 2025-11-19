import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20, 50, 10};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : arr) {
       if (frequencyMap.containsKey(num)) {
             frequencyMap.put(num, frequencyMap.get(num) + 1);
       } else {
             frequencyMap.put(num, 1);
        }
        }

        // Step 2: Print only those elements whose count is more than 1
        System.out.println("Duplicate elements:");
        boolean foundDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → appears " + entry.getValue() + " times");
                foundDuplicate = true;
}
 }
if (!foundDuplicate) {
   System.out.println("No duplicates found.");
 }
}
}
