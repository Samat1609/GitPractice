package oop.abstraction.gadget;

public class Nokia extends Gadget{

    private int pernumber;


    public Nokia(String model, String mark) {
        super(model, mark);
    }

    @Override
    public void getmodel(String model) {
        System.out.println(getModel()+"мощно");
    }


    public Nokia(String model, String mark, int pernumber) {
        super(model, mark);
        this.pernumber = pernumber;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "pernumber=" + pernumber +
                '}';
    }
}
