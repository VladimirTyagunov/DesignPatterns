package com.Matrix;

import com.Paint.IPainter;

public interface IMatrix {
    double getM(int rowIndex, int colIndex);
    String getStringM(int rowIndex, int colIndex);
    void setM(int rowIndex, int colIndex, double value);

    int getRowsNumber();
    int getColumnsNumber();

    void draw(IPainter p);

    default void notAnIterator(TriFunction<IMatrix, Integer, Integer> triFunction){
        for (int i=0; i<getRowsNumber(); i++)
            for (int j=0; j<getColumnsNumber(); j++)
                triFunction.accept(this, i, j);
    }
}
