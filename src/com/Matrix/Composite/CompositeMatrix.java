package com.Matrix.Composite;

import com.Matrix.IMatrix;
import com.Matrix.TriFunction;
import com.Paint.IPainter;

import java.util.ArrayList;
import java.util.List;

public class CompositeMatrix implements IMatrix {

    private ArrayList<IMatrix> matrixList = new ArrayList<IMatrix>();

    public void addMatrix(IMatrix m) {
        matrixList.add(m);
    }

    public CompositeMatrix(IMatrix ... matrixL) {
        for (IMatrix m:matrixL)
            addMatrix(m);
    }

    @Override
    public double getM(int rowIndex, int colIndex) {
        int i = rowIndex;
        int j = colIndex;

        for (IMatrix matrix:matrixList) {
            if ((j < matrix.getColumnsNumber()) && (j>=0)) {
                if (i < matrix.getRowsNumber())
                    return matrix.getM(i, j);
            }
            j-=matrix.getColumnsNumber();
        }
        return 0;
    }

    @Override
    public String getStringM(int rowIndex, int colIndex) {
        int i = rowIndex;
        int j = colIndex;

        for (IMatrix matrix:matrixList) {
            if ((j < matrix.getColumnsNumber()) && (j>=0)) {
                if (i < matrix.getRowsNumber())
                    return matrix.getStringM(i, j);
                return " / ";
            }
            j-=matrix.getColumnsNumber();
        }
        return " / ";
    }

    @Override
    public void setM(int rowIndex, int colIndex, double value) {
        int i = rowIndex;
        int j = colIndex;

        for (IMatrix matrix:matrixList) {
            if ((j < matrix.getColumnsNumber()) && (j>=0)) {
                if (i < matrix.getRowsNumber())
                    matrix.setM(i, j, value);
            }
            j-=matrix.getColumnsNumber();
        }
        return;
    }

    @Override
    public int getRowsNumber() {
        int rowNumber = 0;

        for (IMatrix matrix:matrixList) {
            if (matrix.getRowsNumber() > rowNumber)
                rowNumber = matrix.getRowsNumber();
        }
        return rowNumber;
    }

    @Override
    public int getColumnsNumber() {
        int colNumber = 0;
        for (IMatrix matrix:matrixList) {
            colNumber = colNumber + matrix.getColumnsNumber();
        }
        return colNumber;
    }

    @Override
    public void draw(IPainter p) {
        {
            p.beginPaint(this);

            notAnIterator(p::drawCell);

            p.endPaint(this);
        }

    }

    @Override
    public void notAnIterator(TriFunction<IMatrix, Integer, Integer> triFunction){
        for (int i=0; i<getRowsNumber(); i++)
            for (int j=0; j<getColumnsNumber(); j++)
                triFunction.accept(this, i, j);
    }
}
