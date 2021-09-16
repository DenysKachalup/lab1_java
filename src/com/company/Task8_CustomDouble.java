package com.company;


import java.util.Objects;

public class Task8_CustomDouble {
    private int integer;
    private double fractions;
    private boolean minus;

    public Task8_CustomDouble(final int integer, final double fractions) {
        setInteger(integer);
        setFractions(fractions);
    }

    public boolean isMinus() {
        return minus;
    }

    public void setMinus(final boolean minus) {
        this.minus = minus;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(final int integer) {
        if (integer < 0) {
            setMinus(true);
        }

        this.integer = Math.abs(integer);
    }

    public double getFractions() {
        return fractions;
    }

    public void setFractions(final double fractions) {
        if (fractions < 0) {
            setMinus(true);
        }

        if (Math.abs(fractions) >= 1) {
            this.fractions = Math.abs(fractions) % 1;
            setInteger((int) fractions + getInteger());
        } else {
            this.fractions = Math.abs(fractions);
        }
    }

    public Task8_CustomDouble add(final Task8_CustomDouble b) {
        final Task8_CustomDouble res = new Task8_CustomDouble(0, 0);

        final double result = this.toDouble() + b.toDouble();

        res.setInteger((int) (result));
        res.setFractions(result % 1);

        return res;
    }

    public Task8_CustomDouble subtraction(final Task8_CustomDouble b) {
        final Task8_CustomDouble res = new Task8_CustomDouble(0, 0);

        final double result = this.toDouble() - b.toDouble();

        res.setInteger((int) (result));
        res.setFractions(result % 1);

        return res;
    }

    public double toDouble() {
        double res = this.fractions + this.integer;
        if (this.minus == true) {
            res *= -1;
        } else {
            res *= 1;
        }

        return res;
    }

    public boolean equalsMax(final Task8_CustomDouble b) {
        return this.toDouble() > b.toDouble();
    }

    public boolean equalsMin(final Task8_CustomDouble b) {
        return this.toDouble() < b.toDouble();
    }

    @Override
    public String toString() {
        return "Figure {" +
                "integer=" + integer +
                ", fractions=" + fractions +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o.getClass() == this.getClass())) return false;
        final Task8_CustomDouble that = (Task8_CustomDouble) o;
        return getInteger() == that.getInteger()
                && that.getFractions() == getFractions()
                && isMinus() == that.isMinus();
    }

    @Override
    public int hashCode() {
        return getInteger() + (int) getFractions() + Boolean.hashCode(isMinus());
    }

    public static void main(final String[] args) {
        final Task8_CustomDouble task1 = new Task8_CustomDouble(-2, 0.3);
        final Task8_CustomDouble task2 = new Task8_CustomDouble(4, 0.8);

        System.out.println(task1.subtraction(task2).toDouble());
        System.out.println(task1.add(task2).toDouble());
    }

}
