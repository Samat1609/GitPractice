package agregation;

public class HeadFhone {

    public String first;
    public String second;

    public HeadFhone(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "HeadFhone{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
