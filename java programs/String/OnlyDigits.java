public class OnlyDigits {
  public static void main(String[] args){
   String str = "123456";
   Boolean isDigitOnly = true;

  for(char ch : str.toCharArray()){
    if(!Character.isDigit(ch)){
      isDigitOnly = false;
      break;
    }
  }
  System.out.println("Contains only digits? " + isDigitOnly);
}
}