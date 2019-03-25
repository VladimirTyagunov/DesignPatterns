package com.Decorator;

import com.Matrix.IMatrix;

public class MatrixRenumberedRows extends Decorator{

    private int row1, row2;

    public MatrixRenumberedRows(IMatrix matrix, int row1, int row2){
        super(matrix);
        this.row1 = row1;
        this.row2 = row2;
    }

    @Override
    public double getM(int rowIndex, int columnIndex) {
        int i, j;
        j = columnIndex;
        i = rowIndex;
        if (i==row1) i=row2;
        else if (i==row2) i=row1;
//        System.out.println("I'm here!\n");
        return super.getM(i,j);
    }

    @Override
    public void setM(int rowIndex, int columnIndex, double value) {
        int i, j;
        j = columnIndex;
        i = rowIndex;
        if (i==row1) i=row2;
        else if (i==row2) i=row1;
        super.setM(i,j,value);
    }

}
