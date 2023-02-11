package homeWork;

import java.util.Scanner;
public class HomeWorkIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age;
        int weight;
        System.out.println("Инициализируйте свой возраст");
        age = scan.nextInt();
        System.out.println("Инициализируйте свой вес");
        weight = scan.nextInt();
        if (age> 18) {
            if (weight > 50) {
                System.out.println("Этот человек имеет прова сдавать кровь");
            } else if (age > 18) {
                if (weight < 50) {
                    System.err.println("Этот человек не имеет право сдавать кровь");
                }
            }
        }    else{
                    System.err.println("Возраст должен быть больше 18 лет");
            }
        }
    }



