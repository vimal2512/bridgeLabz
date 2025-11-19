public class CountEvenOdd {
  public static void main(String[] args){
    int[] arr = {12,7,9,20,33,18,5};

    int evenCount = 0;
    int oddCount = 0;

for(int num : arr){
  if(num % 2 == 0){
   evenCount++;
}else{
   oddCount++;
 }
}
System.out.println("Even numbers count: " + evenCount);
System.out.println("Odd numbers count: " + oddCount);
}
}