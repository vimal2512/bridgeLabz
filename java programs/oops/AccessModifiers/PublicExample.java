public class PublicExample {
    public int num = 777;

    public void show() {
        System.out.println("Number: " + num);
    }
}

public class PublicAccessTest {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.show();         // ✅ Access public method
        System.out.println(obj.num); // ✅ Access public field
    }
}
