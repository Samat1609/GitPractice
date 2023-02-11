package ts.kg.absrtact;

abstract public class Figuire {

    private int length;
    private double width;

    public Figuire(int length, double width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract public double perimetr();

    abstract public double square();

    public void showInfo(){
        System.out.println(perimetr()+"\n"+square());
    }

    @Override
    public String toString() {
        return "Figuire{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
