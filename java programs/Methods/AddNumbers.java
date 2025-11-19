public class AddNumbers {
  int add(int a, int b){
     return a + b;
 }
  public static void main(String[] args){
    AddNumbers obj = new AddNumbers();
    System.out.println("Sum: " + obj.add(10,20));
}
}