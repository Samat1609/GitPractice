package ts.kg.lesson24;

abstract public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать,как спять рыбы");
    }
    abstract public String swim();
}
