package oop.agregation_compozition;

import java.util.Arrays;

public class Keyboard {
    char[]symbols=new char[38];

    public Keyboard(char[] symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "symbols=" + Arrays.toString(symbols) +
                '}';
    }
}
