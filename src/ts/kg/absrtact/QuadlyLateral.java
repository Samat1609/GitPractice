package ts.kg.absrtact;

public class QuadlyLateral extends Figuire{
    public QuadlyLateral(int length, double width) {
        super(length, width);
    }

    @Override
    public double perimetr() {
        return getLength()+getLength()+getWidth()+getWidth();

    }

    @Override
    public double square() {
        return getLength()*getWidth();
    }
}
