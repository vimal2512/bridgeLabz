public class BufferSetCharAt {
 public static void main(String[] args){
   StringBuffer sb = new StringBuffer("Rat");
   sb.setCharAt(0, 'C');
   System.out.println("Modified: " + sb);
}
}