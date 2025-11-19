public class MaxRowSum {
  public static void main(String[] args){
    int[][] matrix = {
      {1,2,3},
      {9,8,7},
      {4,5,6}
    };

  int maxSum = Integer.MIN_VALUE;
  int maxRow = -1;

  for(int i=0;i<matrix.length;i++){
   int rowSum = 0;
  
   for(int j=0;j<matrix[i].length;j++){
     rowSum += matrix[i][j];
   }
   
   if(rowSum > maxSum){
    maxSum = rowSum;
    maxRow = i;
  }
  }
System.out.println("Row " + maxRow + " has the maximum sum: " + maxSum);
}
}