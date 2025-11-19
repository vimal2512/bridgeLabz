public class MaxMinArray {
  public static void main(String[] args) {
     int[] numbers = {45,12,87,3,64,29,7};

     int max = numbers[0];
     int min = numbers[0];

for(int i=1;i<numbers.length;i++){
   if(numbers[i] > max) {
     max = numbers[i];
   }
   if(numbers[i] < min) {
     min = numbers[i];
   }
}

System.out.println("Maximum value in array: " + max);
System.out.println("Minimum value in array: " + min);

}
}