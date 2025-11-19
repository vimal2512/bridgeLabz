public class Fibonacci {
   int fib(int n){
     if(n <= 1) return n;
     return fib(n-1) + fib(n-2);
   }
  public static void main(String[] args){
     Fibonacci f = new Fibonacci();
     for(int i=0;i<7;i++){
      System.out.print(f.fib(i) + " ");
   }
}
}