package Platforma;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println(isOdd(number));
        System.out.println(name(number));
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static String name(int number) {
        if (number % 2 != 0) {
            return number + " Это нечетное число";
        } else {
            return number + " Это четное число";
        }
    }
}
