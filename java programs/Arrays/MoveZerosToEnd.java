import java.util.Arrays;

public class MoveZerosToEnd {
  public static void main(String[] args){
    int[] arr = {0,3,0,5,0,1,0,4};

    int index = 0;

   // Step 1: Move non-zero elements forward
   for(int num : arr){
    if(num != 0){
      arr[index++] = num;
    }
   }
   // Step 2: Fill remaining positions with zeros
   while(index < arr.length){
     arr[index++] = 0;
   }
   System.out.println("After moving zeros: " + Arrays.toString(arr));
}
}