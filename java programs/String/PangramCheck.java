import java.util.HashSet;

public class PangramCheck {
   public static void main(String[] args){
    String str = "The quick brown fox jumps over the lazy dog";
    str = str.toLowerCase().replaceAll(" ","");

    HashSet<Character> set = new HashSet<>();
    for(char ch : str.toCharArray()){
     if(Character.isLetter(ch)){
       set.add(ch);
     }
    }
 System.out.println("Is pangram? " + (set.size() == 26));
}
}