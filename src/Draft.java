import java.util.Scanner;

public class Draft {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите фразу");
        String str= scanner.nextLine();

        world(str);




    }public static void world(String str) {

        StringBuilder sb = new StringBuilder(str);
        String name=sb.reverse().toString();
        if (name.equals(str)) {
            System.out.println("полиндрон");
        } else {
            System.out.println("но");
        }

    }
}


