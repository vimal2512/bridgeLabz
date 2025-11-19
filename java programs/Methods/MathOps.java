public class MathOps {

   //Declaration + Definition
   int add(int a, int b){
   return a + b;
   }

   //Recursion
   int factorial(int n){
     if(n <= 1)
       return 1;
     return n * factorial(n-1);
   }
  public static void main(String[] args){
    MathOps m = new MathOps();
  
    //Calling add()
    int sum = m.add(10,20);
    System.out.println("Sum: " + sum);

    System.out.println("Factorial: " + m.factorial(5));
}
}