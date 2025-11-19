import java.util.Scanner;

public class ElementOccurrences {
 public static void main(String[] args){
  int[] arr = {10,20,10,30,40,10,50,30};
 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number to count: ");
  int target = sc.nextInt();

  int count = 0;
   
  // Loop through the array and count the target number
  for(int num : arr){
    if(num == target){
      count++;
   }
  }
  System.out.println(target + " appears " + count + " times in the array.");
}
}