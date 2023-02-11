package ts.kg.lesson24;

public class Lev extends Mammal{
    public Lev(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Лев как любой хищник,любят мясо");

    }

    @Override
    public void sleep() {
        System.out.println("Большую часть дня лев спит");

    }

    @Override
    public void run() {
        System.out.println("Лев это не самая быстрая кошка");

    }
}
