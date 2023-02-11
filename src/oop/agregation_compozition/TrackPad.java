package oop.agregation_compozition;

public class TrackPad {
    String size;

    public TrackPad(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TrackPad{" +
                "size='" + size + '\'' +
                '}';
    }
}
