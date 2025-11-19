public class StringBasics {
  public static void main(String[] args) {
    String str = "vimal";
    System.out.println("String: " + str);
    System.out.println("Length: " + str.length());

   for(int i=0;i<str.length();i++){
    System.out.println("Character at index " + i + ": " +str.charAt(i));
   }
}
}