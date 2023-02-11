package Platforma;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        int sum = num + num2;
        int dif = num / num2;
        int prodact = num * num2;
        int average = (num + num2) / 2;
        System.out.println("Sum : " + sum + "\n" + "Difference : " + dif + "\n" + "Prodact : " + prodact + "\n" + "Average : " + average);

        if (num < num2) {
            System.out.println(num);
            }else{
            System.out.println(num2);
        }
        }
    }

