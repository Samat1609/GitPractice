package agregation;

public class Battery {

    public  int timeForUsing;

    public Battery(int timeForUsing) {
        this.timeForUsing = timeForUsing;
    }

    public String charging(){
        return "Charging>>>";
    }

    @Override
    public String toString() {
        return "Battery{" +
                "timeForUsing=" + timeForUsing +
                '}';
    }
}
