package methods;

public class Lesson1 {
    public static void main(String[] args) {
        firstMethod();
        Lesson1 ob=new Lesson1();
        ob.secondMethod();
        System.out.println(ob.sum(12,23));
        System.out.println(greeting("Samat"));
        System.out.println(ob.sumOf(12,23,7));


    }
    public static void firstMethod(){
        System.out.println("This is my first method");
    }
    public void secondMethod(){
        System.out.println("This is my second method");
    }private void Samat(){
        System.out.println("djdj");
    }
    public int sum(int a, int b){
        return a+b;
    }
    public static String greeting(String name){
        return name;
    }
    public int sumOf(int a,int b,int c){
    return a+b+c;
    }


}
