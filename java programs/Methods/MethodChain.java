public class MethodChain {
   public static void show(){
  System.out.println("Showing...");
  print();
}
public static void print(){
  System.out.println("Printing...");
}
 public static void main(String[] args){
   show();
}
}