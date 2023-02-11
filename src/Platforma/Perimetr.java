package Platforma;

import java.util.Scanner;

public class Perimetr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Ширина = 5,6 Высота = 8,5
//        Ожидаемый результат
//        Площадь составляет 5,6 * 8,5 = 47,60
//        Периметр равен 2 * (5,6 + 8,5) = 28,20
        double sh = scanner.nextDouble();
        double vy = scanner.nextDouble();
        System.out.println("Площадь составляет " + sh * vy);
        System.out.println("Периметр составляет " + 2 * (sh + vy));

    }
}


