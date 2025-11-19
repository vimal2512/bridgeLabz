public class MaxFinder {
    int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        MaxFinder m = new MaxFinder();
        System.out.println("Max: " + m.findMax(10, 40, 25));
    }
}
