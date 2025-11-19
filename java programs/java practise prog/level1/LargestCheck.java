public class LargestCheck {
   public static void main (String[] args) {
      int number1 = 20;
      int number2 = 15;
      int number3 = 10;

      boolean firstIsLargest = number1 > number2 && number1 > number2;
      boolean secondIsLargest = number2 > number1 && number2 > number3;
      boolean thirdIsLargest = number3 > number1 && number2 > number2;

System.out.println("Is the first number the largest? " + firstIsLargest);
System.out.println("Is the second number the largest? " + secondIsLargest);
System.out.println("Is the third number the largest? " + thirdIsLargest);
}
}