package Loops;

public class Char {
    public static void main(String[] args) {
        String name="nomad";
        String res="";
        for (int i = 0; i <name.length() ; i++) {
            res=res+name.charAt(i)+name.charAt(2);

        }
        System.out.println(res);
    }
}
