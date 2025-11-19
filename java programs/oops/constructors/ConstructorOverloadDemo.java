class Employee {
    String name;
    int id;

    // Overloaded constructors
    Employee() {
        name = "Unknown";
        id = 0;
    }

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void show() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Vimal", 101);

        e1.show();
        e2.show();
    }
}
