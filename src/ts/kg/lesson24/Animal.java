package ts.kg.lesson24;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void eat();
    abstract public void sleep();
}
