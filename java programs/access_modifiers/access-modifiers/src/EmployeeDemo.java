
class Employee {
    private int id;
    private String name;
    private double salary;

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("vimal raj");
        emp.setSalary(45000.50);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Salary: ₹" + emp.getSalary());
    }
}