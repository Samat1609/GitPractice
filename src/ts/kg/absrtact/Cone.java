package ts.kg.absrtact;

public class Cone extends Figuire{
    private double length2;
    public Cone(int length, double width,double length2) {
        super(length, width);
        this.length2=length2;
    }

    @Override
    public double perimetr() {
        return getLength()+getWidth()+length2;
    }

    @Override
    public double square() {
        return getLength()*getWidth();
    }
}
