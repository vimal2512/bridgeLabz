class ExampleDefault {
    int x = 50; // default

    void show() {
        System.out.println("x = " + x);
    }
}

public class DefaultAccessTest {
    public static void main(String[] args) {
        ExampleDefault obj = new ExampleDefault();
        System.out.println(obj.x); // ✅ OK (same package)
    }
}
