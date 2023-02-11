package agregation.car;

public class CarMain {
    public static void main(String[] args) {
        Engine engine=new Engine(3);
        Wheel wheel=new Wheel("ddd","kdcdcd");
        Polik polik=new Polik("black");

        Car mersedes=new Car("Mresedes","S CLASS",2005,polik);
        System.out.println(mersedes);
        System.out.println(mersedes.engine.voice());
    }
}
