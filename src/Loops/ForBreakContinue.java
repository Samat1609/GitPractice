package Loops;

public class ForBreakContinue {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 6) {
            if (num==4){
                num++;
                continue;
            }

            System.out.println(num);
            num++;


        }

    }
}
