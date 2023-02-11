package oop.practice;

public class Predator extends Animal{
    public Predator(String name, int age, int id) {
        super(name, age, id);
    }
    public String eating(){
        return "nyam nyam";
    }

    @Override
    public String toString() {
        return "Predator{" +
                "name='" + name + '\'' +
                ", age=" + age + " id='"+getId()+
                '}';
    }
}
