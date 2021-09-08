package com.company;

public class Task1 {
    private String arrayStr[];

    public Task1() {
        this.arrayStr = new String[]{"12", "1", "1234","123"};
    }

    public String[] getArrayStr() {
        return arrayStr;
    }

    public void SortBubble() {
        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 1; j < arrayStr.length; j++) {
                if (arrayStr[j - 1].length() < arrayStr[j].length()) {
                    String tmp = arrayStr[j - 1];
                    arrayStr[j - 1] = arrayStr[j];
                    arrayStr[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Task1 A = new Task1();

        A.SortBubble();

        System.out.println(A.getArrayStr()[0]);
        System.out.println(A.getArrayStr()[1]);
        System.out.println(A.getArrayStr()[2]);
        System.out.println(A.getArrayStr()[3]);
    }
}
