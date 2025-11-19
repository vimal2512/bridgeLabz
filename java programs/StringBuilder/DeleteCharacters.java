public class DeleteCharacters {
  public static void main(String[] args){
  StringBuilder sb = new StringBuilder("Learning");
  sb.delete(1,4);
  System.out.println("After delete: " + sb);
}
}