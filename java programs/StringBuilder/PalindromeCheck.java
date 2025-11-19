public class PalindromeCheck {
  public static void main(String[] args){
    String str = "madam";
    StringBuilder sb = new StringBuilder(str);
    String reversed = sb.reverse().toString();

    if(str.equals(reversed)){
        System.out.println("Palindrome: true");
    }else{
       System.out.println("Palindrome: false");
     }
}
}