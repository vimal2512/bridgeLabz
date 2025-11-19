class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParamConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student("Vimal Raj", 23);
        s.display();
    }
}
