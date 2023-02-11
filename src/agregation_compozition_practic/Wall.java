package agregation_compozition_practic;

public class Wall {
    private String color;
    private int height;

    public Wall(String color, int height) {
        this.color = color;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
