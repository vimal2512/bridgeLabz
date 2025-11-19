public class InsertText {
  public static void main(String[] args){
   StringBuilder sb = new StringBuilder("Java");
   sb.insert(2,"cool");
   System.out.println("Modified: " + sb);
}
}