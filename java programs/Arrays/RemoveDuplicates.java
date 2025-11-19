import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args){
       int[] arr = {10,20,10,30,20,40,50,30};

   // Step 1: Create a LinkedHashSet to store unique elements
       Set<Integer> uniqueElements = new LinkedHashSet<>();

   // Step 2: Add elements from the array to the set
       for(int num : arr){
          uniqueElements.add(num);
        }
     // Step 3: Print the unique elements
       for(int num:uniqueElements){
         System.out.print(num + " ");
       }
} 
}