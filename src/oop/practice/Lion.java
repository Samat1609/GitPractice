package oop.practice;

public class Lion extends Predator{
    public Lion(String name, int age, int id) {
        super(name, age, id);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +" id= "+getId()+
                '}';
    }
}
