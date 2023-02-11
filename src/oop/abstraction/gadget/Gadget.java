package oop.abstraction.gadget;

abstract public class Gadget {

    private String model;
    private String mark;

    public Gadget(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    abstract public void getmodel(String model);

    @Override
    public String toString() {
        return "Gadget{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}



