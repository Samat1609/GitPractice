package agregation_compozition_practic;

public class Door {
    private  String color;

    public Door(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Door{" +
                "color='" + color + '\'' +
                '}';
    }
}
