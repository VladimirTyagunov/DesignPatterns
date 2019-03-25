package com.Matrix;

import com.Paint.IPainter;
import com.Vector.Vector;

abstract class Matrix implements IMatrix {
    private final Vector[] mm;
    private final int rows, columns;

    Matrix(int n, int m) {
        rows = n;
        columns = m;
        mm = new Vector[n];
        for (int i = 0; i < n; i++)
            mm[i] = this.create(m);
    }

    abstract Vector create(int m);

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

    abstract public void draw(IPainter p);
//
//    public void draw(IPainter p){
//        p.beginPaint(this);
//
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<columns; j++) {
//                p.printElementsBorder(i, j);
//                p.printElement(i, j);
//            }
//        }
//
//        p.endPaint();
//    }

}