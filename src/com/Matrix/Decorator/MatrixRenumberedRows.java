//package com.Matrix.Decorator;
//
//import com.Matrix.IMatrix;
//import com.Paint.IPainter;
//
//public class MatrixRenumberedRows implements IMatrix{
//    private IMatrix matrix;
//    private int row1, row2;
//
//    public MatrixRenumberedRows(IMatrix matrix, int row1, int row2){
//        this.matrix = matrix;
//        this.row1 = row1;
//        this.row2 = row2;
//    }
//
//    public double getM(int rowIndex, int columnIndex) {
//        int i, j;
//        j = columnIndex;
//        i = rowIndex;
//
//        if (i==row1) i=row2;
//        else if (i==row2) i=row1;
//
//        return matrix.getM(i,j);
//    }
//
//    public void setM(int rowIndex, int columnIndex, double value) {
//        int i, j;
//        j = columnIndex;
//        i = rowIndex;
//
//        if (i==row1) i=row2;
//        else if (i==row2) i=row1;
//
//        matrix.setM(i,j,value);
//    }
//
//    public int getRowsNumber() {
//        return matrix.getRowsNumber();
//    }
//
//    public int getColumnsNumber() {
//        return matrix.getColumnsNumber();
//    }
//
//    private void notAnIterator() {
//
//    }
//
//}