public class Students {
   String name;
   public void display() {
     System.out.println("Student Name: " + name);
}
  public static void main(String[] args) {
    Students s = new Students();
    s.name = "Vimal";
    s.display();
}
}