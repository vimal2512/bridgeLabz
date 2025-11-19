public class BufferWordReverse {
 public static void main(String[] args) {
   String sentence = "Java is powerful";
   String[] words = sentence.split(" ");
   StringBuffer sb = new StringBuffer();
   
   for(int i = words.length -1; i>=0; i--){
    sb.append(words[i]).append(" ");
   }
  System.out.println("Reversed sentence: " + sb.toString().trim());
}
}