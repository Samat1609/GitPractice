package Platforma;

import java.util.Scanner;

public class DayOfTheWeek2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        String str="";
        switch (num){
            case 1: str="Понедельник";
            break;
            case 2: str="Вторник";
            break;
            case 3: str="Среда";
            break;
            case 4: str="Четверг";
            break;
            case 5: str="Пятница";
            break;
            case 6: str="Суббота";
            break;
            case 7: str="Воскресенье";
            break;
            default: str="Не правильно";
        }
        System.out.println(str);
    }
}
