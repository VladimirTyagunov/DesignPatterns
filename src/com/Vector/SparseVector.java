package com.Vector;

import java.util.HashMap;
import java.util.Map;


public class SparseVector implements Vector {
    private Map<Integer, Double> valuesSparse = new HashMap<>();
    private int dim = 0;

    public SparseVector(int n) {
        dim = n;
    }

    public double get(int index) {
        if (!valuesSparse.containsKey(index))
            return 0;
        return valuesSparse.get(index);
    }

    public void set(int index, double value) {
        valuesSparse.put(index, value);
    }

    public int getDim() {
        return dim;
    }
}
