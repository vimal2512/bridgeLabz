public class Login {
   boolean authenticate(String username,String password){
     return username.equals("admin") && password.equals("1234");
   }
  public static void main(String[] args){
     Login l = new Login();
     System.out.println("Login success? " + l.authenticate("admin", "1234"));
  }
}