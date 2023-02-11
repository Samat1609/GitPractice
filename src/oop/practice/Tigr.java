package oop.practice;

public class Tigr extends Predator{
    public Tigr(String name, int age, int id) {
        super(name, age, id);
    }
    public String striped(){
        return "striped";
    }

    @Override
    public String toString() {
        return "Tigr{" +
                "name='" + name + '\'' +
                ", age=" + age +" id= "+getId()+
                '}';
    }
}
