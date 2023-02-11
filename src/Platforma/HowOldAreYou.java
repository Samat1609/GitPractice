package Platforma;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name= scanner.nextLine();
        System.out.println("Enter the number");
        int age = scanner.nextInt();
        System.out.println("Your name : "+name);
        System.out.println("Your age : "+age);
        if (age < 16) {
            System.out.println("You can't drive.");
        }
    }
}
