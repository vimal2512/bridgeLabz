//based on single linked list

class Employee {
    int id;
    String name;
    double salary;
    Employee next;           //pointer or ref to next emp in the list

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.next = null;       //next is set to null by default because the new employee is not linked to anyone yet.
    }
}

public class EmployeeManagement {
    Employee head = null;      // head points to the first employee in the list.,Initially, it’s null because the list is empty.

    // Add new employee
    public void addEmployee(int id, String name, double salary) {
        Employee newEmp = new Employee(id, name, salary);          //newEmp is now a node with its own data and next = null
 
 // If this is the first employee, set head to point to newEmp.

        if (head == null) {
            head = newEmp;
        } else {
          
            Employee temp = head;
                                             // If the list already has employees Start from head and move through the list using temp = temp.next;.
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newEmp;
        }
        System.out.println("✅ Employee Added: " + name);
    }

    // Display all employee records
    public void displayEmployees() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        System.out.println("\n📋 Employee Records:");
        Employee temp = head;    // Start from head, and print each employee’s details.

 // Keep moving forward with temp = temp.next; until temp == null.
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int id) {   //If the list is empty, you can’t delete anything.
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
//If the employee to delete is the first one, just move the head to point to the second one.
        if (head.id == id) {
            head = head.next;
            System.out.println("🗑️ Employee with ID " + id + " deleted.");
            return;
        }

//Otherwise, move forward until you find the previous node of the target
//If you reached the end (temp.next == null), the ID was not found.
//Else, delete by skipping the node: temp.next = temp.next.next.

        Employee temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("❌ Employee not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("🗑️ Employee with ID " + id + " deleted.");
        }
    }

    // Search employee by ID

                                                    //Start from head, go one by one, and check temp.id == id.
                                                    //If found, print details.
                                                    //If not, go to the next.
                                                    //If list ends, say not found.
 public void searchEmployee(int id) {
        Employee temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("🔍 Employee Found: ID: " + temp.id + ", Name: " + temp.name + ", Salary: " + temp.salary);
                return;
            }
            temp = temp.next;
        }
        System.out.println("❌ Employee with ID " + id + " not found.");
    }

    // Main method to test
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(101, "Alice", 50000);
        em.addEmployee(102, "Bob", 55000);
        em.addEmployee(103, "Charlie", 60000);

        em.displayEmployees();

        em.searchEmployee(102);
        em.deleteEmployee(102);

        em.displayEmployees();
    }
}
