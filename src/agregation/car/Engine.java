package agregation.car;

public class Engine {
    private double engineCapacity;

    public Engine(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String voice(){
        return  "aaaaaaaaaa";
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                '}';
    }
}
