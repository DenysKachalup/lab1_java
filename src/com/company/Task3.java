package com.company;

public class Task3 {
    private char[] symbol;
    private int[] figure;
    private String string;

    public Task3() {
        this.figure = new int[]{1,2,3};
        this.symbol = new char[]{'a','b','c','d','e'};
        this.string = "";
    }

    public String getString() {
        return string;
    }


    public void MergeFigureSymbol() {
        for(int i = 0 ; i < EqualsFigureSymbol(symbol,figure); i++) {
            if (i < figure.length)
                this.string = this.string + figure[i];
            if (i < symbol.length)
                this.string = this.string + symbol[i];
        }
    }

    public int EqualsFigureSymbol(final char[] symbol,final int[] figure) {
        if(symbol.length > figure.length)
            return symbol.length;

        else return figure.length;
    }

    public static void main(final String[] args) {
        final Task3 A = new Task3();

        A.MergeFigureSymbol();
        System.out.println(A.getString());
    }
}