import java.util.Scanner;

public class SearchInMatrix {
 public static void main(String[] args){
   int[][] matrix = {
     {10,20,30},
     {40,50,60},
     {70,80,90}
   };

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number to search: ");

  int target = sc.nextInt();
  Boolean found = false;

  for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
    if(matrix[i][j] == target){
      System.out.println("Found at row " + i + ",column " + j);
      found = true;
    }
  }
  }
  if(!found){
   System.out.println("Not Found");
  }
sc.close();
}
}