import java.util.Scanner;

public class FactorFinder {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a positive integer to find its factors: ");
      int number = sc.nextInt();

      if(number <= 0){
         System.out.println("Please enter a number greater than 0.");
      }else{
         System.out.println("Factors of " + number + " are:");
          
         for(int i=1;i<=number;i++){
          if(number %i == 0){
            System.out.println(i);
         }
         }
      }
  sc.close();
}
}