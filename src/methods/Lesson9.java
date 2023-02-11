package methods;

import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String word= scanner.nextLine();
        System.out.println(rev(word));

    }
    public static String rev(String word){

        StringBuilder vb=new StringBuilder(word);

        return vb.reverse().toString();
    }
}

