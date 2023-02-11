package methods;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  the word");
        String word = scanner.nextLine();

        Lesson7 ob = new Lesson7();
        System.out.println(ob.palindrom(word));
    }

    String palindrom(String word) {
        StringBuilder str = new StringBuilder(word);
        String vb = str.reverse().toString();
        if (vb.equals(word)) {
            return "Палиндрам";

        } else
            return "Не палиндран";
    }
}
