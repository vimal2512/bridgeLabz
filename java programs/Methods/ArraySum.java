public class ArraySum {
   public static int sum(int[] arr){
     int total = 0;
     for(int num : arr){
       total += num;
     }
return total;
}
  public static void main(String[] args){
     int[] nums = {10,20,30};
     System.out.println("Total: " + sum(nums));
}
}