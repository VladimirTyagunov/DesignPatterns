package com.Matrix;

import com.Paint.IPainter;
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
    public void draw(IPainter p){
        p.beginPaint(this);

        for (int i=0; i<getRowsNumber(); i++){
            for (int j=0; j<getColumnsNumber(); j++) {
                p.printElementsBorder(i, j);
                p.printElement(i, j);
            }
        }

        p.endPaint();
    }

}
