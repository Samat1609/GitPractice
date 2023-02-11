package oop.abstraction.gadget;

public class Samsung extends Gadget{

    private int number;

    public Samsung(String model, String mark) {
        super(model, mark);
    }

    @Override
    public void getmodel(String model) {
        System.out.println(getModel()+"локум");
    }


    public Samsung(String model, String mark, int number) {
        super(model, mark);
        this.number = number;
    }


}
