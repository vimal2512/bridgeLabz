class Person {
    void speak() {
        System.out.println("Person speaks");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages team");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.speak();   // from Person
        m.work();    // from Employee
        m.manage();  // from Manager
    }
}
