package Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        byte num=14;
        Byte num1=12;
        Float num3=12.4f;
        System.out.println(num3.byteValue());
        int nums=Integer.max(num,num1);
        System.out.println(nums);
        System.out.println(Integer.compare(num, num1));
        int num4=12;
        Integer num5=num4;
        Integer num6=23;
        int num7=num6;
        Integer num8=34;
        System.out.println(num8.doubleValue());

        String name="12";
        int a=Integer.parseInt(name);
        System.out.println(a);


    }
}
