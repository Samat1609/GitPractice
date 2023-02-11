package oop.flowers;

public class SpreyRoza extends Roza {

    public SpreyRoza(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "SpreyRoza{" +
                "name='" + name + " color= "+getColor()+'\'' +
                '}';
    }

    public boolean blossom(){
        return true;
    }
}
