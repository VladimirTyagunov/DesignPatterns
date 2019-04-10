package com.Matrix.Decorator;

import com.Matrix.IMatrix;
import com.Matrix.TriFunction;
import com.Paint.IPainter;

public class MatrixRenumberedRows implements IMatrix{
    private IMatrix matrix;
    private int row1, row2;

    public MatrixRenumberedRows(IMatrix matrix, int row1, int row2){
        this.matrix = matrix;
        this.row1 = row1;
        this.row2 = row2;
    }

    public double getM(int rowIndex, int columnIndex) {
        int i, j;
        j = columnIndex;
        i = rowIndex;

        if (i==row1) i=row2;
        else if (i==row2) i=row1;

        return matrix.getM(i,j);
    }

    public String getStringM(int rowIndex, int colIndex) {
        int i, j;
        j = colIndex;
        i = rowIndex;
        if (i==row1) i=row2;
        else if (i==row2) i=row1;

        return matrix.getStringM(i,j);
    }

    public void setM(int rowIndex, int columnIndex, double value) {
        int i, j;
        j = columnIndex;
        i = rowIndex;

        if (i==row1) i=row2;
        else if (i==row2) i=row1;

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