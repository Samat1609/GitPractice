package agregation.car;

public class Wheel {
    private  String color;
    private String ofWhatMaterial;

    public Wheel(String color, String ofWhatMaterial) {
        this.color = color;
        this.ofWhatMaterial = ofWhatMaterial;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "color='" + color + '\'' +
                ", ofWhatMaterial='" + ofWhatMaterial + '\'' +
                '}';
    }
}
