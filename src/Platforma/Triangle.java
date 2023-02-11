package Platforma;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the width");
        int widtch= scanner.nextInt();
        System.out.println("Enter the height");
        int height= scanner.nextInt();

        int area=(height*widtch)/2;
        System.out.println("Area : "+area);
    }
}
