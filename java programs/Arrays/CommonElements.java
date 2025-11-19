import java.util.*;

public class CommonElements {
  public static void main(String[] args){
    int[] arr1 = {10,20,30,40,50};
    int[] arr2 = {30,40,60,70,10};

// Use HashSet to store elements of first array
   Set<Integer> set1 = new HashSet<>();

   for(int num : arr1){
     set1.add(num);
   }

// Check which elements in arr2 exist in set1
List<Integer> common = new ArrayList<>();

for(int num : arr2) {
  if(set1.contains(num)){
    common.add(num);
    set1.remove(num); // avoid printing duplicates
  }
}
// Print common elements
System.out.println("Common Elements");
for(int num : common){
 System.out.print(num + " ");
}

}
}