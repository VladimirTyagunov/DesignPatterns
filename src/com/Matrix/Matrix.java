package com.Matrix;

import com.MatrixOperations.TriFunction;
import com.Paint.IPainter;
import com.Vector.Vector;

import java.text.DecimalFormat;

abstract class Matrix implements IMatrix {
    private final Vector[] mm;
    private final int rows, columns;
    protected DecimalFormat decimalFormat = new DecimalFormat("0.00");


    TriFunction<IMatrix, Integer, Integer> triFunction;

    Matrix(int n, int m) {
        rows = n;
        columns = m;
        mm = new Vector[n];
        for (int i = 0; i < n; i++)
            mm[i] = this.create(m);
    }

    abstract Vector create(int m);

    public abstract String getStringM(int i, int j);

    public double getM(int rowIndex, int columnIndex) {
        return mm[rowIndex].get(columnIndex);
    }

    public void setM(int rowIndex, int columnIndex, double value) {
        mm[rowIndex].set(columnIndex, value);
    }

    public int getRowsNumber() {
        return rows;
    }

    public int getColumnsNumber() {
        return columns;
    }

    public void draw(IPainter p) {

        triFunction = (matrix, i, j) ->p.drawCell(matrix, i, j);

        p.beginPaint(this);

        notAnIterator(triFunction);

        p.endPaint(this);
    }

    abstract void notAnIterator(TriFunction triFunction);

}