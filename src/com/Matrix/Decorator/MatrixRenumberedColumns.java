package com.Matrix.Decorator;

import com.Matrix.IMatrix;
import com.Matrix.TriFunction;
import com.Paint.IPainter;

public class MatrixRenumberedColumns implements IMatrix {
    private IMatrix matrix;
    private int col1, col2;

    public MatrixRenumberedColumns(IMatrix matrix, int col1, int col2){
        this.matrix = matrix;
        this.col1 = col1;
        this.col2 = col2;
    }

    public double getM(int rowIndex, int colIndex) {
        int i, j;
        j = colIndex;
        i = rowIndex;
        if (j==col1) j=col2;
        else if (j==col2) j=col1;
//        System.out.println("I'm here!\n");
        return matrix.getM(i,j);
    }

    public String getStringM(int rowIndex, int colIndex) {
        int i, j;
        j = colIndex;
        i = rowIndex;
        if (j==col1) j=col2;
        else if (j==col2) j=col1;

        return matrix.getStringM(i,j);
    }

    public void setM(int rowIndex, int colIndex, double value) {
        int i, j;
        j = colIndex;
        i = rowIndex;
        if (j==col1) j=col2;
        else if (j==col2) j=col1;
       matrix.setM(i,j,value);
    }

    public int getRowsNumber() {
        return matrix.getRowsNumber();
    }

    public int getColumnsNumber() {
        return matrix.getColumnsNumber();
    }

    public void draw(IPainter p) {
        {
           p.beginPaint(matrix);

           notAnIterator(p::drawCell);

           p.endPaint(matrix);
        }

    }

    public void notAnIterator(TriFunction<IMatrix, Integer, Integer> triFunction) {
        for (int i = 0; i < getRowsNumber(); i++)
            for (int j = 0; j < getColumnsNumber(); j++)
                triFunction.accept(this, i, j);
    }
}
