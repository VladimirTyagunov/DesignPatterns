package com.Matrix;

import com.Paint.IPainter;
import com.Vector.SparseVector;
import com.Vector.Vector;

public class SparseMatrix extends Matrix {
    public SparseMatrix(int n, int m) {
        super(n,m);
    }

    @Override
    public Vector create(int m) {
        return new SparseVector(m);
    }

    public void draw(IPainter p){
        p.beginPaint(this);

        for (int i=0; i<getRowsNumber(); i++){
            for (int j=0; j<getColumnsNumber(); j++) {
                p.printElementsLeftBorder(i, j);
                if (getM(i,j)!=0) p.printElement(i, j);
                p.printElementsRightBorder(i, j);
            }
        }

        p.endPaint();
    }
}
