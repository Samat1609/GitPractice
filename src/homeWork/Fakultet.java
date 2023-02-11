package homeWork;

import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("На каком факультете учишся");
        String userfakultet= scan.next();
        String ekonom="Экономический";
        String pedagog="Педагогический";

        System.out.println("На каком курсе ты учишся");
        String userkurs= scan.next();
        String kurs1="Первый";
        String kurs2="Второй";
        String kurs3="Третий";

        if (userfakultet.equals(ekonom)){
            if (userkurs.equals(kurs2)){
                System.out.println("Факультет: Экономический\n"+"Курс: Второй");
            }else{
                System.err.println("Не правильно указан курс");
            }
        }else {
            System.err.println("Не правильно указан факультет");
        }
    }
}
