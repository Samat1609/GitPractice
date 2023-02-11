package homeWork;

import java.util.Scanner;

public class HomeWork_else {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите свой логин пожалуйста");
        String userlogin= scanner.next();
        String login="samat";
        String login2="Samat";

        if (userlogin.equals(login)){
            System.out.println("Вы успешно вошли в аккаунт");
        } else if (userlogin.equals(login2)){
            System.out.println("Введите логин с маленькой буквы");
        }else{
            System.err.println("Вы ввели неправильный логин");
        }
    }
}
