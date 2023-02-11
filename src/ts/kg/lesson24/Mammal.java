package ts.kg.lesson24;

abstract public class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }
    abstract public void run();
}
