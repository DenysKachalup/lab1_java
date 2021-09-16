package com.company;

public class Task9 extends Task8_CustomDouble {
    public Task9(final int integer, final double fractions) {
        super(integer, fractions);
    }

    public Task9(final int integer) {
        super(integer, 0);
    }

    public double operations(final Task9 b, final char symbol) {
        switch (symbol) {
            case '+':
                return this.add(b).toDouble();
            case '-':
                return this.subtraction(b).toDouble();
            case '*':
                return this.multiplication(b).toDouble();
            case '/':
                return this.divide(b).toDouble();
            default:
                throw new RuntimeException("Такої дії не існує!!!");


        }
    }

    public Task9 multiplication(final Task9 b) {
        final Task9 res = new Task9(0);

        final double result = this.toDouble() * b.toDouble();

        res.setInteger((int) result);
        res.setFractions(result % 1);

        return res;
    }

    public Task9 divide(final Task9 b) {
        final Task9 res = new Task9(0);

        final double result = this.toDouble() / b.toDouble();

        res.setInteger((int) result);
        res.setFractions(result % 1);

        return res;
    }

    public static void main(final String[] args) {

        try {
            final Task9 task1 = new Task9(-6,0.9);
            final Task9 task2 = new Task9(-2,0.3);

            System.out.println(task1.operations(task2,'+'));
            System.out.println(task1.operations(task2,'-'));
            System.out.println(task1.operations(task2, '*'));
            System.out.println(task1.operations(task2, '/'));
        } catch (final RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
