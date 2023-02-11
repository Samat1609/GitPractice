package agregation;

public class Fhone {
     public  int id;
     public String mark;
     public  String model;
     private double memory;
     public Battery battery;
     public HeadFhone headFhone;


    public Fhone(int id, String mark, String model, double memory, HeadFhone headFhone) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.battery = new Battery(30);
        this.headFhone =headFhone;
    }

    public Fhone(int id, String mark, String model, double memory, Battery battery) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Fhone{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", battery=" + battery +
                ", headFhone=" + headFhone +
                '}';
    }
}
