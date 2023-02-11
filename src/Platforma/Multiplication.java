package Platforma;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "*" + num + " =" + i * num);
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "*" + num2 + " =" + i * num2);
        }
        System.out.println();
        for (int i=1;i<=5;i++){
            System.out.println(i+"* "+num3+"= "+i*num3);
        }
        System.out.println();
        for (int i=1;i<=5;i++){
            System.out.println(i+"* "+num4+"= "+i*num4);
        }
        System.out.println();
        for (int i=1;i<=5;i++){
            System.out.println(i+"* "+num5+"= "+i*num5);
        }
    }
}
