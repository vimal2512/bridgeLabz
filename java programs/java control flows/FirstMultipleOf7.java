public class FirstMultipleOf7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("First multiple of 7: " + i);
                break;
            }
        }
    }
}
