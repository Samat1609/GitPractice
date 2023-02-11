package oop;

public class CarMain {
    public static void main(String[] args) {
        Car ob=new Car();
        ob.color="White";
        ob.engine="v8";
        ob.speed=80;
        System.out.println(ob.tormoz(30));

        ob.showinfo(ob.color, ob.engine, ob.speed);
    }
}
