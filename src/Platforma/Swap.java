package Platforma;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number= scanner.nextInt();
        System.out.println("Enter the second number");
        int number2= scanner.nextInt();
        int num=-9;
        int num2=9;
        number=num;
        number2=num2;
        System.out.println("After the swap, the first Integer is : "+number+ "\n"+"the second Integer is : "+number2);

    }
}
