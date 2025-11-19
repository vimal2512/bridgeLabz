class Student {
    String name;

    Student() { 
        name = "Default Name";
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.display(); // Output: Default Name
    }
}
