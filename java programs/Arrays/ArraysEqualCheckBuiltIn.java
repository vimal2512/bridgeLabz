import java.util.Arrays;

public class ArraysEqualCheckBuitIn {
 public static void main(String[] args){
   int[] arr1 = {10,20,30,40};
   int[] arr2 = {10,20,30,40};

 if(Arrays.equals(arr1,arr2)){
   System.out.println("Arrays are equal.");
 }else{
   System.out.println("Arrays are not equal");
}
}
}