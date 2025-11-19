public class Student {
 void display(String name){
  System.out.println("Name: " + name);
}

void display(String name, int age){
 System.out.println("Name: " + name + ",Age: " + age);
}

void display(String name, int age, String course){
    System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
}

public static void main(String[] args) {
  Student s = new Student();
  s.display("Vimal");
  s.display("Vimal",21);
  s.display("Vimal",21,"Java");
}
}