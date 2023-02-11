package if_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        boolean java = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you married?");
        String useranswer = scan.next();
        String basenaswer = "Yes";
        String vb1 = "no";
        String divorsed="divorced";

        if (useranswer.equals(basenaswer)) {
            System.out.println("You are married");
        } else if (useranswer.equals(vb1)) {
            System.err.println("You are not married");
        }else if (useranswer.equals(divorsed)){
            System.out.println("You are divorced");
        }
        else {
            System.out.println("Fail");
        }
    }
}

