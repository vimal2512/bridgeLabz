import java.util.Arrays;

public class SplitAndRotate {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int k = 2;

    int n = arr.length;
    int[] result = new int[n];

    // Copy second part to the beginning
    int index = 0;
    for(int i=k;i<n;i++){
      result[index++] = arr[i];
    }

     // Copy first part to the end
     for(int i=0;i<k;i++) {
       result[index++] = arr[i];
     }
  System.out.println("Array after split and rotate: " + Arrays.toString(result));
}
}