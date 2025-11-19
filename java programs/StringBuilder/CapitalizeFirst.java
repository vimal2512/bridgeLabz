public class CapitalizeFirst {
  public static void main(String[] args){
   StringBuilder sb = new StringBuilder("vimal");
   char first = Character.toUpperCase(sb.charAt(0));
   sb.setCharAt(0,first);
   System.out.println("Capitalized: " + sb);
}
}