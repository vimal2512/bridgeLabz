public class RemoveVowels {
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder("education");
    for(int i=0;i<sb.length();i++){
      char c = sb.charAt(i);
      if("aeiou".indexOf(c) != -1){
        sb.deleteCharAt(i);
        i--;
      }
    }
   System.out.println("No vowels: " + sb);
}
}