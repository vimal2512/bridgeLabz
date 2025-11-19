import java.util.Scanner;

public class FriendsComparison {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter age and height of amar:");
    int ageAmar = sc.nextInt();
    double heightAmar = sc.nextDouble();
    
    System.out.println("Enter age and height of akbar:");
    int ageAkbar = sc.nextInt();
    double heightAkbar = sc.nextDouble();

    System.out.println("Enter age and height of Anthony:");
    int ageAnthony = sc.nextInt();
    double heightAnthony = sc.nextDouble();

 
    String youngest;
    if(ageAmar <= ageAkbar && ageAmar <= ageAnthony){
       youngest = "Amar";
    }else if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony){
       youngest = "Akbar";
    }else{
       youngest = "Anthony";
    }

    String tallest;
    if(heightAmar >= heightAkbar && heightAmar >= heightAnthony){
       tallest = "Amar";
    }else if(heightAkbar >= heightAmar && heightAkbar >= heightAnthony){
         tallest = "Akbar";
    }else{
          tallest = "Anthony";
    }
       System.out.println("\nYoungest friend is: " + youngest);
       System.out.println("Tallest friend is: " + tallest);
       
       sc.close();

}
}