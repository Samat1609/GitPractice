package homeWork;

public class Zvezdochka {
    public static void main(String[] args) {

        for (int i=1;i<=8;i++){
            for (int j=i;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
