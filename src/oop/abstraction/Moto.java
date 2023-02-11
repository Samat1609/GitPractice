package oop.abstraction;

public class Moto extends Vechicle{
    public Moto(String name, int weels, String color) {
        super(name, weels, color);
    }

    @Override
    public String hong() {
        return "Мото : Члынг члынг";
    }
    public String accelering(){
        return  "arrrrrrrrrr";
    }
}
