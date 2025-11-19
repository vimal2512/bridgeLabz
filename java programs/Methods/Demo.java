public class Demo {
  public void sayHi() {
     System.out.println("Hi from non-static");
  }
public static void sayHello(){
   System.out.println("Hello from Static");
}
 public static void main(String[] args) {
   sayHello();
   new Demo().sayHi();
}

}