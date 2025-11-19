public class MergeSortedArrays {
  public static void main(String[] args){
    int[] arr1 = {10,20,30,40};
    int[] arr2 = {15,25,35,50,60};

    int n = arr1.length;
    int m = arr2.length;

    int[] merged = new int[n+m];

    int i=0,j=0,k=0;
    
    //Merge until one array is exhausted
    while(i<n && j<m){
      if(arr1[i] < arr2[j]){
         merged[k++] = arr1[i++];
       }else{
         merged[k++] = arr2[j++];
       }
    }
  
    // Add remaining elements of arr1
    while(i<n) {
      merged[k++] = arr1[i++];
    }

    //Add remaining elements of arr2
    while(j<m){
     merged[k++] = arr2[j++];
    }

    //print the merged sorted array
    System.out.print("Merged sorted array: ");
    for(int val : merged){
     System.out.print(val + " ");
    }
}
}