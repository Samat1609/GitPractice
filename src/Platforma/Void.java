package Platforma;

public class Void {
    public static void main(String[] args) {
        passedOrFailed(81);

    }
    static void passedOrFailed(int mark){
        if (mark<=49){
            System.out.println("A");
        }else if (mark>=50&&mark<60){
            System.out.println("B");
        }else  if (mark>=60 && mark<80){
            System.out.println("C");
        }else if (mark>=80){
            System.out.println("D");
        }
    }


}
