package Platforma;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        if (num1<num2||num2>num1){
            System.out.println("The first number is smaller");
        }else{
            System.out.println("The second number is smaller");
        }

    }
}
