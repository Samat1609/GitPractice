package methods;

public class Lesson3 {
    public static void main(String[] args) {

        int num=Math.max(3,6);
        System.out.println(num);
        int num1=Math.min(5,7);
        System.out.println(num1);

        Lesson3 ob=new Lesson3();
        System.out.println(ob.findMax((int) 34.4f,23));
        System.out.println(num(3,6));


    }
    public double findMax(int a,float b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
    public static int num(int b,int y){
        int result=(b>y) ? b:y;
        return result;
    }

}
