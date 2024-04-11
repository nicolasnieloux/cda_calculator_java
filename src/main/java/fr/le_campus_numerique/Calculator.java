package fr.le_campus_numerique;

public class Calculator {

    public int addTwoInt(int a, int b) {
        return a + b;
    }

    public int subTwoInt(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public float divTwoInt(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division par 0 impossible");
        }
        return a / b;
    }
}
