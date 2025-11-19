// File: AccessModifierDemo.java

// Parent class
class Parent {
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default (Package-private) Variable"; // no modifier
    private String privateVar = "Private Variable";

    public void showVariables() {
        System.out.println("Inside Parent class:");
        System.out.println(publicVar);     // Accessible
        System.out.println(protectedVar);  // Accessible
        System.out.println(defaultVar);    // Accessible
        System.out.println(privateVar);    // Accessible (only inside same class)
    }
}

// Child class in the same package
class Child extends Parent {
    public void accessParentVariables() {
        System.out.println("\nInside Child class:");
        System.out.println(publicVar);     // Accessible (public)
        System.out.println(protectedVar);  // Accessible (protected + inheritance)
        System.out.println(defaultVar);    // Accessible (same package)
        // System.out.println(privateVar); // Not accessible (private)
    }
}

// Main class
public class AccessModifierDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.showVariables();

        Child child = new Child();
        child.accessParentVariables();

        System.out.println("\nAccessing from main method:");
        System.out.println(parent.publicVar);     //  Accessible
        System.out.println(parent.protectedVar);  //  Accessible (same package)
        System.out.println(parent.defaultVar);    //  Accessible (same package)
        // System.out.println(parent.privateVar); //  Error (private)
    }
}
