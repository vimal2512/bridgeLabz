public class FindDuplicates {
  public static void main(String[] args){
   String str = "successes";
   int[] freq = new int[256];

   for(char ch : str.toCharArray()){
     freq[ch]++;
   }

   for(int i=0;i< freq.length;i++){
     if(freq[i] > 1)
       System.out.println((char)i + " occurs " + freq[i] + " times");
   }
}
}