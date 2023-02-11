package interface1;

public class DemoMain {
    public static void main(String[] args) {
        GarryPotter garryPotter=new GarryPotter("Garry Potter","Rouling",600);
        System.out.println(garryPotter.listening());
        garryPotter.setAudioBook(true);
        System.out.println(garryPotter.listening());
        System.out.println(garryPotter.print());
        System.out.println(garryPotter.read());

    }
}
