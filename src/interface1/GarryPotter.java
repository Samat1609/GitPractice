package interface1;

public class GarryPotter extends Book{

    public GarryPotter(String name, String author, int pages) {
        super(name, author, pages);
    }

    @Override
    public String published() {
        return "Published";
    }

    @Override
    public String print() {
        return "Samat";
    }

    @Override
    public String read() {
        return "Reading";
    }
}
