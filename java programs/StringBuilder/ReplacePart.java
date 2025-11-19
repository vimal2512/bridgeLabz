public class ReplacePart {
 public static void main(String[] args){
   StringBuilder sb = new StringBuilder("hello world");
   sb.replace(6,11,"Java");
   System.out.println("Replaced: " + sb);
}
}