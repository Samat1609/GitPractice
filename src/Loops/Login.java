package Loops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String login = "samat";
        String paswsword = "abdarev";
        Scanner scanner = new Scanner(System.in);


        int i = 0;
        int j = 0;
        while (i < 3) {
            System.out.println("Введите свой логин");
            String userlogin = scanner.nextLine();
            if (userlogin.equals(login)) {
                System.out.println("Вы правильно нашли логин");
                while (j < 4) {
                    System.out.println("Введите пароль");
                    String userpassword = scanner.nextLine();
                    if (userpassword.equals(paswsword)) {
                        System.out.println("Вы правильно ввели пароль");
                        break;
                    }
                    j++;
                }break;

            }
            i++;
        }
    }
}
