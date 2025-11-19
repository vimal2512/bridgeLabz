public class ManualSort {
  public static void main(String[] args){
   int[] arr = {40,10,30,50,20};

   //Bubble sort
   for(int i=0;i<arr.length-1;i++){
     for(int j=0;j<arr.length-1-i;j++){
       if(arr[j] > arr[j+1]){
         int temp = arr[j];
         arr[j] = arr[j+1];
         arr[j+1] = temp;
       }
   }
   }
//print sorted array
System.out.print("Sorted array: ");
for(int num:arr){
  System.out.print(num + " ");
}
}
}