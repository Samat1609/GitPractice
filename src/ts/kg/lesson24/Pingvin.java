package ts.kg.lesson24;

public class Pingvin extends Bird{
    public Pingvin(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {
        System.out.println("Пингвини спять так,прижавшись друг к друге");

    }

    @Override
    public String fly() {
        return "Пингвины не умеют летать";
    }

    @Override
    public String speak() {
        return "Пингвины не умеют петь,как соловьи";
    }
}
