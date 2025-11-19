public class AddOverload {
 int add(int a, int b){
    return a+b;
 }

 double add(double a, double b){
    return a+b;
 }
  public static void main(String[] args){
     AddOverload obj = new AddOverload();
     System.out.println("Sum of ints: " + obj.add(5,7));
     System.out.println("Sum of doubles: " + obj.add(5.5,3.3));
}
}