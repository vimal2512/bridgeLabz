public class BufferReplace {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("I love C++");
    sb.replace(7,10,"Java");
    System.out.println("Replaced: " + sb);
}
}