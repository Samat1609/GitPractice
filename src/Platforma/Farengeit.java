package Platforma;

import java.util.Scanner;

public class Farengeit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int farengeit= scanner.nextInt();
        double celcii=(farengeit-32)*5/9;
        System.out.println(celcii);
    }
}
