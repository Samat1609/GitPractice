package oop.agregation_compozition;

public class Monitor {

    String model;
    int id;

    public Monitor(String model, int id) {
        this.model = model;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
