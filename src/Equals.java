import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your login");
        String userlogin= scanner.nextLine();
        System.out.println("Enter your password");
        String userpassword= scanner.nextLine();
        System.out.println(user(userlogin,userpassword));

    }
    public static String user(String userlogin,String userpassword){
        String login="Samat";
        String password="Abdraev";

        String login2="Molmol";
        String password2="Osmonova";

        String login3="Aidin";
        String password3="Mambetkaziev";
        if (userlogin.equals(login) && userpassword.equals(password) ){
            return "Вы успешно вошли в аккаунт: "+login+" "+ password;
        }else if (userlogin.equals(login2) && userpassword.equals(password2)){
            return login2+password2;
        }else if (userlogin.equals(login3) && userpassword.equals(password3)){
            return login3+password3;
        }else{
            return "No";
        }
    }
}
