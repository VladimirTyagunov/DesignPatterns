//package com.Matrix.Decorator;
//
//import com.Matrix.IMatrix;
//import com.Paint.IPainter;
//
//public class MatrixRenumberedColumns implements IMatrix {
//    private IMatrix matrix;
//    private int col1, col2;
//
//    public MatrixRenumberedColumns(IMatrix matrix, int col1, int col2){
//        this.matrix = matrix;
//        this.col1 = col1;
//        this.col2 = col2;
//    }
//
//    public double getM(int rowIndex, int columnIndex) {
//        int i, j;
//        j = columnIndex;
//        i = rowIndex;
//        if (j==col1) j=col2;
//        else if (j==col2) j=col1;
////        System.out.println("I'm here!\n");
//        return matrix.getM(i,j);
//    }
//
//    public void setM(int rowIndex, int columnIndex, double value) {
//        int i, j;
//        j = columnIndex;
//        i = rowIndex;
//        if (j==col1) j=col2;
//        else if (j==col2) j=col1;
//       matrix.setM(i,j,value);
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
//    public void draw(IPainter p) {
//
//    }
//
//}
