package com.company;

public class Task9 {
    public static void main(final String[] args) {
        try {
            final Calculator task1 = new Calculator(-6,0.9);
            final Calculator task2 = new Calculator(-2,0.3);

            System.out.println(task1.operations(task2,'+'));
            System.out.println(task1.operations(task2,'-'));
            System.out.println(task1.operations(task2, '*'));
            System.out.println(task1.operations(task2, '/'));
        } catch (final RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
