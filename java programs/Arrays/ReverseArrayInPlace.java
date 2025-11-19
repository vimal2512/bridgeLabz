public class ReverseArrayInPlace {
  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};

    System.out.print("Original Array");
    printArray(arr);

    int left = 0,right = arr.length-1;
    while(left < right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
System.out.print("Reversed array (in-place): ");
printArray(arr);

}

static void printArray(int[] arr) {
  for(int num : arr){
    System.out.print(num + " ");
  }
System.out.println();
}
}