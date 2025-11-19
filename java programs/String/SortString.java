import java.util.Arrays;

public class SortString {
 public static void main(String[] args){
   String str = "zebra";
   char[] chars = str.toCharArray();
   Arrays.sort(chars);
   
   System.out.println("Sorted: " + new String(chars));
}
}