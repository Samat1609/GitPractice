package Platforma;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
//        Напишите Java-программу для печати площади и периметра круга.
//        Тестовые данные:
//        Примечание: Радиус следует вводить с клавиатуры.
//                Формула: Периметр=2*радиус*3,14; Площадь=3,14*радиус*радиус;
//                Радиус = 7,5
//        Ожидаемый результат
//        Периметр = 47.12388980384689
//        Площадь = 176.71458676442586
        Scanner scanner=new Scanner(System.in);
        double radius= scanner.nextDouble();
        System.out.println("Периметр= "+2*radius*3.14);
        System.out.println("Площадь= "+3.14*radius*radius);
    }
}
