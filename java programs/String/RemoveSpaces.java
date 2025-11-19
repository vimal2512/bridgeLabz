public class RemoveSpaces {
  public static void main(String[] args){
    String str = " Hello Java World ";
    str = str.replaceAll(" ", "");
    System.out.println("Without spaces: " + str);
}
}