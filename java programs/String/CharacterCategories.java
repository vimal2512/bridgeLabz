public class CharacterCategories {
  public static void main (String[] args){
    String str = "Hello java 123";
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    str = str.toLowerCase();
for(int i=0;i< str.length();i++){
  char ch = str.charAt(i);

if("aeiou".indexOf(ch) != -1) vowels++;
else if(Character.isLetter(ch)) consonants++;
else if(Character.isDigit(ch)) digits++;
else if(Character.isWhitespace(ch)) spaces++;
}
 System.out.println("Vowels: " + vowels);
 System.out.println("Consonants: " + consonants);
 System.out.println("Digits: " + digits);
 System.out.println("Spaces: " + spaces);
}
}