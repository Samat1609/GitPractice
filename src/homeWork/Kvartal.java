package homeWork;

import java.util.Scanner;

public class Kvartal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите любое число");

        int num= scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Первый квартал");
                break;
            case 2:
                System.out.println("Второй квартал");
                break;
            case 3:
                System.out.println("Третий квартал");
                break;
            case 4:
                System.out.println("Четвертый квартал");
                break;
            default:
                System.out.println("В году есть четыре квартала");
        }
    }
}
