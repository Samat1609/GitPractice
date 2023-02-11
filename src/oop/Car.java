package oop;

public class Car {
        String color;
        String engine;
        int speed;

        int gaz(int skorost){
            speed=speed+skorost;
            return speed;
        }
        int tormoz(int skorost){
            speed=speed-skorost;
            return speed;
        }
        void showinfo(String color,String engine,int speed){
            System.out.println("Color : "+color+"\n"+"Engine : "+engine+"\n"+"Speed : "+speed);
        }
}
