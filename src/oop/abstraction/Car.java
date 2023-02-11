package oop.abstraction;

public class Car extends Vechicle {

    public Car(String name, int weels, String color) {
        super(name, weels, color);
    }

    @Override
    public String hong() {
        return "Cars : BEEP BEEP";
    }
    public  String refuel(){
        return "refuiling";
    }
}
