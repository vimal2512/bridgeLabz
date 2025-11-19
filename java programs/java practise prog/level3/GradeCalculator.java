import java.util.Scanner;

public class GradeCalculator {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter physics marks: ");
    int physics = sc.nextInt();

    System.out.print("Enter Chemistry marks: ");
    int chemistry = sc.nextInt();

    System.out.print("Enter Maths marks: ");
    int maths = sc.nextInt();

    int total = physics + chemistry + maths;
    double percentage = total / 3.0;

    System.out.println("Total marks =" + total);
    System.out.println("Percentage =" + percentage + "%");

    if(percentage >= 80) {
      System.out.println("Grade: A(level 4,above agency-normalized standards)");
    }else if(percentage >= 70){
       System.out.println("Grade: B (Level 3, at agency-normalized standards)");
     }else if(percentage >= 60){
       System.out.println("Grade: C (Level 2, below, but approaching standards)");
     }else if(percentage >= 50) {
       System.out.println("Grade: D (Level 1, well below standards)");
     }else if(percentage >= 40){
       System.out.println("Grade: R (Remedial standards)");
     }
sc.close();

}
}