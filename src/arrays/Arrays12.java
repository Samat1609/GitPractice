package arrays;

import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите свое фамилия");
        String usersurname= scanner.nextLine();
        System.out.println("Введите свое имя");
        String username= scanner.nextLine();
        System.out.println("Введите свое отчество");
        String userlastname=scanner.nextLine();

        String[]arrays={usersurname,username,userlastname};
        String surnamekoren=arrays[0].substring(0,usersurname.length()-3);
        String lastnamekoren=arrays[2].substring(0,userlastname.length()-4);


        if (arrays[0].endsWith("ova") || arrays[0].endsWith("eva")){
            if (arrays[2].endsWith("ovna") || arrays[2].endsWith("evna")){
                if (surnamekoren.equals(lastnamekoren)){
                    System.out.println("Однокоренные");
                }else {
                    System.err.println("Не однокоренние");
                }

            }
        }



    }
}
