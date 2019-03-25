package com.Decorator;

import com.Matrix.IMatrix;

public class MatrixRenumberedColumns extends Decorator{

    private int col1, col2;

    public MatrixRenumberedColumns(IMatrix matrix, int col1, int col2){
        super(matrix);
        this.col1 = col1;
        this.col2 = col2;
    }

    @Override
    public double getM(int rowIndex, int columnIndex) {
        int i, j;
        j = columnIndex;
        i = rowIndex;
        if (j==col1) i=col2;
        else if (i==col2) i=col1;
//        System.out.println("I'm here!\n");
        return super.getM(i,j);
    }

    @Override
    public void setM(int rowIndex, int columnIndex, double value) {
        int i, j;
        j = columnIndex;
        i = rowIndex;
        if (j==col1) i=col2;
        else if (i==col2) i=col1;
        super.setM(i,j,value);
    }


}
