class ExamplePrivate {
    private int a = 100;

    void display() {
        System.out.println(a);  // ✅ Accessible inside same class
    }
}

public class PrivateAccessTest {
    public static void main(String[] args) {
        ExamplePrivate obj = new ExamplePrivate();
        // System.out.println(obj.a); ❌ Error → 'a' has private access
        obj.display(); // ✅ OK
    }
}
