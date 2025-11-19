public class BufferConversion {
  public static void main(String[] args){
    String str = "Immutable";
    StringBuffer sb = new StringBuffer(str);
    sb.reverse();
    System.out.println("Reversed with buffer: " + sb.toString());
}
}