package oop.flowers;

public class Roza extends Plant{
    public Roza(String name, String color) {
        super(name, color);

}

    public boolean blossom(){
        return  true;
    }

    @Override
    public String toString() {
        return "Roza{" +
                "name='" + name + " color= "+getColor()+'\'' +
                '}';
    }
}
