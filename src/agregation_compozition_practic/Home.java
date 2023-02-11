package agregation_compozition_practic;

public class Home {
    private String adress;
    private int square;
    private int room;
    Wall wall;
    Roof roof;
    Door door;

    public Home(String adress, int square, int room, Wall wall, Roof roof, Door door) {
        this.adress = adress;
        this.square = square;
        this.room = room;
        this.wall = wall;
        this.roof = roof;
        this.door = door;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    void info(){
        System.out.println(adress+"\n"+square+"\n"+room+"\n"+wall+"\n"+roof+"\n"+door);
    }

    @Override
    public String toString() {
        return "Home{" +
                "adress='" + adress + '\'' +
                ", square=" + square +
                ", room=" + room +
                ", wall=" + wall +
                ", roof=" + roof +
                ", door=" + door +
                '}';
    }
}
