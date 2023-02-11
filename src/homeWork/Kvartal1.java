package homeWork;

import java.util.Scanner;

public class Kvartal1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите любое число");

        int num= scanner.nextInt();

        if (num == 1) {
            System.out.println("Первый квартал");
        }else if (num==2){
            System.out.println("Второй квартал");
        }else if (num==3){
            System.out.println("Третий квартал");
        }else if (num==4){
            System.out.println("Четвертый квартал");
        }else {
            System.err.println("В году есть четыре квартала");
        }
    }
}
