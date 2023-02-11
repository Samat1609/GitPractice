package ts.kg.lesson24;

public class Mechenosek extends Fish{
    public Mechenosek(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Мечненосек обычная рыба,и она есть обычный корм");

    }

    @Override
    public String swim() {
        return "Меченосек красивая рыба,которая быстро плавает";
    }
}
