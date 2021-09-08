package com.company;

public class Task2 {
    private String[] arrayStr;

    public Task2() {
        this.arrayStr = new String[]{"12", "1", "12134","121"};
    }

    public int CountString(char symbol) {
        int amount = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 0; j<arrayStr[i].length(); j++) {
                if (arrayStr[i].charAt(j) == symbol) {
                    amount++;
                }
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        Task2 A = new Task2();
        System.out.println( A.CountString('1'));

    }
}
