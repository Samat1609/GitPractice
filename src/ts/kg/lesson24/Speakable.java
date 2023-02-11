package ts.kg.lesson24;

public interface Speakable {
    default public String speak(){
        return "Somebady speaks";
    }
}
