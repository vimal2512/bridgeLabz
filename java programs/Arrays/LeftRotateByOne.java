public class LeftRotateByOne {
  public static void main(String[] args){
 int[] arr = {10,20,30,40,50};

// Step 1: Store the first element
 int first = arr[0];

  // Step 2: Shift all elements to the left by one position
 for(int i=0;i<arr.length-1;i++){
   arr[i] = arr[i+1];
 }

// Step 3: Move the first element to the end
  arr[arr.length-1] = first;

// Print the result
System.out.print("Array after left rotation by 1: ");
for(int num : arr){
  System.out.print(num + " ");
}

}
}