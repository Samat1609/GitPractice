package Switch1;

public class Switch2 {
    public static void main(String[] args) {
        int mongt = 5;
        String vb;

        switch (mongt) {
            case 1: vb = "Январь";
            break;
            case 2: vb="Февраль";
            break;
            case 3: vb="Март";
            break;
            default: vb="Нету такого месяца";
        }
        System.out.println(vb);
    }
}
