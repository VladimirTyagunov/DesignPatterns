package com.Matrix.Decorator;

import com.Matrix.IMatrix;
import com.Matrix.TriFunction;
import com.Paint.IPainter;

public class MatrixTransp implements IMatrix {

    private IMatrix matrix;

    public MatrixTransp(IMatrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public double getM(int rowIndex, int colIndex) {
        return matrix.getM(colIndex, rowIndex);
    }

    @Override
    public String getStringM(int rowIndex, int colIndex) {
        return matrix.getStringM(colIndex, rowIndex);
    }

    @Override
    public void setM(int rowIndex, int colIndex, double value) {
        matrix.setM(colIndex, rowIndex, value);
    }

    @Override
    public int getRowsNumber() {
        return matrix.getColumnsNumber();
    }

    @Override
    public int getColumnsNumber() {
        return matrix.getRowsNumber();
    }

    @Override
    public void draw(IPainter p) {
        p.beginPaint(this);

        notAnIterator(p::drawCell);

        p.endPaint(this);
    }

    @Override
    public void notAnIterator(TriFunction<IMatrix, Integer, Integer> triFunction){
        for (int i=0; i<getRowsNumber(); i++)
            for (int j=0; j<getColumnsNumber(); j++)
                triFunction.accept(this, i, j);
    }
}
