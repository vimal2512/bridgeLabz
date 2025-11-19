class Parent {
    protected void greet() {
        System.out.println("Hello from parent");
    }
}

class Child extends Parent {
    void greetChild() {
        greet(); // ✅ inherited
    }
}

public class ProtectedAccessTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.greetChild(); // ✅ OK
    }
}
