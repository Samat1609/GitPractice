package Platforma;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1= scanner.nextInt();
        System.out.println("Введите второе число");
        int num2= scanner.nextInt();
        if (num1>num2){
            System.out.println("The greatest "+num1);
        }else{
            System.out.println("The greatest "+num2);
        }
    }
}
