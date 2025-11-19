public class Test {
    private int a = 10;     // Only accessible inside class
    public int b = 20;      // Accessible anywhere
    protected int c = 30;   // Same package + subclasses
    int d = 40;             // Default → Same package

    public void show() {
        // All variables accessible inside the same class
        System.out.println("Inside show(): " + a + ", " + b + ", " + c + ", " + d);
    }

    // Add main() inside the same class
    public static void main(String[] args) {
        Test t = new Test();  // Create object of the class
        t.show();             // Call method that prints all values

        // Direct access:
        // System.out.println(t.a);  Cannot access private member
        System.out.println("Public: " + t.b);     // ✅
        System.out.println("Protected: " + t.c);  // ✅
        System.out.println("Default: " + t.d);    // ✅
    }
}
