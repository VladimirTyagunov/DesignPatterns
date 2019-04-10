package com.Matrix;

import com.MatrixOperations.TriFunction;
import com.Vector.OrdinaryVector;
import com.Vector.Vector;


public class OrdinaryMatrix extends Matrix {
    public OrdinaryMatrix(int n, int m) {
        super(n,m);
    }

    @Override
    public Vector create(int m) {
        return new OrdinaryVector(m);
    }

    @Override
    public String getStringM(int i, int j) {
        return decimalFormat.format(getM(i,j));
    }

    @Override
    public void notAnIterator(TriFunction triFunction) {
        for (int i=0; i<getRowsNumber(); i++)
            for (int j=0; j<getColumnsNumber(); j++)
                triFunction.accept(this, i, j);

    }

}
