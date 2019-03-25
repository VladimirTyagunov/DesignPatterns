package com.Vector;

public class OrdinaryVector implements Vector {
    private double values[];
    private int dim = 0;

    public OrdinaryVector(int n) {
        values = new double[n];
        dim = n;
    }

    public double get(int index) {
        return values[index];
    }

    public void set(int index, double value) {
        values[index] = value;
    }

    public int getDim() {
        return dim;
    }
}
