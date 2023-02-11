package oop.abstraction;

abstract public class Vechicle {
    private String name;
    private  int weels;
    private String color;

    public String getName() {
        return name;
    }

    public int getWeels() {
        return weels;
    }

    public String getColor() {
        return color;
    }

    public Vechicle(String name, int weels, String color) {
        this.name = name;
        this.weels = weels;
        this.color = color;
    }
    public String  driving(){
        return "Vrooooom vrooom";
    }
    public String breaking(){
        return "Stop";
    }
    public String accelering(){
        return  "go go";
    }
    abstract public String hong();

    @Override
    public String toString() {
        return "Vechicle{" +
                "name='" + name + '\'' +
                ", weels=" + weels +
                ", color='" + color + '\'' +
                '}';
    }
}
