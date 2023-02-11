package artist;

public class Reper extends Artist{
    public Reper(String name, String style) {
        super(name, style);
    }

    @Override
    public String performanceofTheCompozition() {
        return "rep";
    }
}
