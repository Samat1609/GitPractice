package oop.agregation_compozition;

public class Laptop {
    String mark;
    int id;
    Monitor monitor;
    TrackPad trackPad;
    Keyboard keyboard;

    public Laptop(String mark, int id, Monitor monitor, TrackPad trackPad, Keyboard keyboard) {
        this.mark = mark;
        this.id = id;
        this.monitor = monitor;
        this.trackPad = trackPad;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "mark='" + mark + '\'' +
                ", id=" + id +
                ", monitor=" + monitor +
                ", trackPad=" + trackPad +
                ", keyboard=" + keyboard +
                '}';
    }
}
