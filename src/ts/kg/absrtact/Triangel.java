package ts.kg.absrtact;

public class Triangel extends Figuire{
    private int length1;
    public Triangel(int length, double width,int length1) {
        super(length, width);
        this.length1=length1;
    }

    public int getLength1() {
        return length1;
    }

    @Override
    public double perimetr() {
        return getLength()+getWidth()+length1;
    }

    @Override
    public double square() {
        return getWidth()*getLength();
    }
}
