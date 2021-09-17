package com.company;

public class Calculator extends CustomDouble {
    public Calculator(final int integer, final double fractions) {
        super(integer, fractions);
    }

    public Calculator(final int integer) {
        super(integer, 0);
    }

    public double operations(final Calculator b, final char symbol) {
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

    public Calculator multiplication(final Calculator b) {
        final Calculator res = new Calculator(0);

        final double result = this.toDouble() * b.toDouble();

        res.setInteger((int) result);
        res.setFractions(result % 1);

        return res;
    }

    public Calculator divide(final Calculator b) {
        final Calculator res = new Calculator(0);

        final double result = this.toDouble() / b.toDouble();

        res.setInteger((int) result);
        res.setFractions(result % 1);

        return res;
    }
}
