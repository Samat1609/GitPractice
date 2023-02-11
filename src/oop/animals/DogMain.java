package oop.animals;

public class DogMain {

    public static void main(String[] args) {
        Dog ob=new Dog("Rex");
        System.out.println(ob.toString());
        ob.sleep(ob.name);

        Dog ob2=new Dog(23);
        System.out.println(ob2.toString());
        System.out.println(Dog.run(ob2.age));


    }
}
