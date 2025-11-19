public class BufferCSV {
  public static void main(String[] args) {
    String[] names = {"Alice","Bob","Charlie"};
    StringBuffer sb = new StringBuffer();
    
    for(String name : names){
      sb.append(name).append(", ");
    }
   sb.delete(sb.length() - 2, sb.length()); // remove last comma and space
   System.out.println("CSV: " + sb);

}

}