package artist;

public class Singer extends Artist{
    public Singer(String name, String style) {
        super(name, style);
    }

    @Override
    public String performanceofTheCompozition() {
        return "song";
    }
}
