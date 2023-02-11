package oop.incapsulation;

public class CatMain {
    public static void main(String[] args) {

        Cat cat=new Cat(12345,"murka",3);
        System.out.println(cat);
        cat.id=123;
        cat.name="mur";
        System.out.println(cat);
        cat.getAge();
        System.out.println(cat);
        cat.setAge(5);
        System.out.println(cat);
        System.out.println(cat.drimemood(3,1));


    }
}
