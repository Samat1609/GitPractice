package ts.kg.lesson24;

abstract public class Bird extends Animal implements Speakable{
    public Bird(String name) {
        super(name);
    }
    abstract public String fly();

    @Override
    public String speak() {
        return getName()+" sings";
    }
}
