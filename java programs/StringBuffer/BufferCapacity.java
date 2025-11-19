public class BufferCapacity {
  public static void main(String[] args){
    StringBuffer sb = new StringBuffer();
    System.out.println("Initial Capacity: " + sb.capacity());
    sb.append("Java is awesome");
    System.out.println("After append: " + sb.capacity());
    System.out.println("Length: " + sb.length());
}
}