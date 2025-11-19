import java.util.*;


public class PairsWithGivenSum {
  public static void main(String[] args){
   int[] arr = {2,4,3,5,7,8,-1};
   int target = 7;

   System.out.println("Pairs with sum " + target + ":");

   for(int i=0;i<arr.length-1;i++){
     for(int j=0;j<arr.length;j++){
       if(arr[i] + arr[j] == target){
         System.out.println(arr[i] + " + " + arr[j] + " = " + target);
     }
    }
   }
}
}