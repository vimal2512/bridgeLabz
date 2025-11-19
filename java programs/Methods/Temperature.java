public class Temperature {
 static double toFahrenheit(double celcius){
   return (celcius * 9/5) + 32;
}

public static void main(String[] args){
   System.out.println("Celcius to Farenheit: " + toFahrenheit(30));
}

}