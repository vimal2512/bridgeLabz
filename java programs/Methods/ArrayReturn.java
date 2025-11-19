public class ArrayReturn {
 public static int[] getArray(){
   return new int[] {1,2,3,4,5};
}
 public static void main(String[] args) {
   int[] arr = getArray();
   for(int n : arr){
    System.out.print(n + " ");
  }

}
}