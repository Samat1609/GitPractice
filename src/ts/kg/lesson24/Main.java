package ts.kg.lesson24;

public class Main {
    public static void main(String[] args) {
        Mechenosek mechenosek=new Mechenosek("Меченосек");
        System.out.println(mechenosek.getName());
        System.out.println(mechenosek.swim());
        mechenosek.eat();
        mechenosek.sleep();

        Speakable speakable=new Pingvin("Лоло");
        System.out.println(speakable.speak());

        Animal animal=new Lev("Simba");

        animal.eat();
        animal.sleep();

        Mammal mammal=new Lev("Leo");

        mammal.run();
        System.out.println(mammal.speak());
        mammal.eat();
        mammal.sleep();

    }
}
