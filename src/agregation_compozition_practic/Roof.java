package agregation_compozition_practic;

public class Roof {
    private  String ofWhatMaterial;

    public Roof(String ofWhatMaterial) {
        this.ofWhatMaterial = ofWhatMaterial;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "ofWhatMaterial='" + ofWhatMaterial + '\'' +
                '}';
    }
}
