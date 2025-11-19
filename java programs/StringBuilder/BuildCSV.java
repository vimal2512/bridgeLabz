public class BuildCSV {
 public static void main(String[] args){
    String[] items = {"apple", "banana" ,"cherry"};
    StringBuilder sb = new StringBuilder();
    for(String item : items){
     sb.append(item).append(",");
    }
  sb.deleteCharAt(sb.length() -1); // remove last comma
  System.out.println("CSV: " + sb);
}
}