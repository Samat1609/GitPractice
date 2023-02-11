package homeWork;

import java.util.Scanner;

public class Pifagor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println();
        }
    }
}
