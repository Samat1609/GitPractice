package Platforma;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark=51;
        System.out.println("The mark is "+mark);
        if (mark>=50){
            System.out.println("Pass");
        }else{
            System.err.println("Fail");
        }
        System.out.println("Done");
    }
}
