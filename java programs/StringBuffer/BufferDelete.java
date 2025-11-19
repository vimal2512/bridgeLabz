public class BufferDelete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("DeleteMe");
        sb.delete(6, 8); // removes "Me"
        System.out.println("After delete: " + sb);
    }
}
