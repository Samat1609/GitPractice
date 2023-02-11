package Platforma;

public class Math {

    public static void main(String[] args) {
//        (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        float num=25.5f;
        float num1=3.5f;
        float num2=40.5f;
        float num3=4.5f;
        System.out.println((num*num1-num1*num1)/(num2-num3));
//        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

        float n=4.0f;
        byte n1=1;
        float n2=1.0f;
        int n3=3;
        int n4=5;
        short n5=7;
        short n6=9;
        int n7=11;

        System.out.println(n*(n1-(n2/n3)+(n2/n4)-(n2/n5)+(n2/n6)-(n2/n7)));
    }
}
