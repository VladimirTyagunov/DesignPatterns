package com.Command;

import com.Matrix.IMatrix;

import java.util.ArrayList;

public class MatrixHolder {
    private static MatrixHolder instance;
    private ArrayList<IMatrix> matrixList;

    private MatrixHolder() {
    }

    public static MatrixHolder getInstance() {
        if (instance == null) {
            instance = new MatrixHolder();
        }
        return instance;
    }

    public ArrayList<IMatrix> getMatrixList() {
        return matrixList;
    }

    public void setMatrixList(ArrayList<IMatrix> matrixList) {
        this.matrixList = matrixList;
    }
}
