package agregation.car;

public class Car {
    private  String mark;
    private  String model;
    private  int yearOfRelease;
    Engine engine;
    Wheel wheel;
    Polik polik;

    public Car(String mark, String model, int yearOfRelease, Polik polik) {
        this.mark = mark;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.engine = new Engine(5.5);
        this.wheel =new Wheel("black","ruber");
        this.polik = polik;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Polik getPolik() {
        return polik;
    }

    public void setPolik(Polik polik) {
        this.polik = polik;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", polik=" + polik +
                '}';
    }
}
