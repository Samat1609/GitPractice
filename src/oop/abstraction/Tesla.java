package oop.abstraction;

public class Tesla extends Car{
    public Tesla(String name, int weels, String color) {
        super(name, weels, color);
    }
    public String driving(){
        return "mute";
    }

    @Override
    public String refuel() {
        return "charging";
    }
}
