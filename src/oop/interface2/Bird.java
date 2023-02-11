package oop.interface2;

public class Bird {
    public String name;
    private boolean isFly;

    public Bird(String name, boolean isFly) {
        this.name = name;
        this.isFly = isFly;
    }

    public boolean getisFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFly=" + isFly +
                '}';
    }
}
