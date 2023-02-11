package agregation_compozition_practic;

public class HomeMain {
    public static void main(String[] args) {

        Door door = new Door("White");
        Roof roof = new Roof("shingles");
        Wall wall = new Wall("white", 3);

        Home home = new Home("Osmonkul 356B", 63, 5, wall, roof, door);

        System.out.println(home);


    }
}
