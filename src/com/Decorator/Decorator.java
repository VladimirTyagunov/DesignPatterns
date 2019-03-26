package com.Decorator;

import com.Matrix.IMatrix;
import com.Paint.IPainter;

public abstract class Decorator implements IMatrix {
    final private IMatrix matrix;

    protected Decorator(IMatrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public double getM(int rowIndex, int columnIndex) {
        return matrix.getM(rowIndex, columnIndex);
    }

    @Override
    public void setM(int rowIndex, int columnIndex, double value) {
        matrix.setM(rowIndex, columnIndex, value);
    }

    @Override
    public int getRowsNumber() {
        return matrix.getRowsNumber();
    }

    @Override
    public int getColumnsNumber() {
        return matrix.getColumnsNumber();
    }


    @Override
    public void draw(IPainter p) {
        matrix.draw(p);

    }

//    @Override
//    public void draw(IPainter p){
//        p.beginPaint(this);
//
//        for (int i=0; i<getRowsNumber(); i++){
//            for (int j=0; j<getColumnsNumber(); j++) {
//                p.printElementsBorder(i, j);
//                p.printElement(i, j);
//            }
//        }
//
//        p.endPaint();
//    }

}
