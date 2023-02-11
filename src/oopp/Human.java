package oopp;

public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    Car car=new Car(6,"white",120);
    House house=new House("black",24);

    void info(){
        System.out.println(name+"\n"+car.engine+"\n"+house.sqrt);
    }

}
