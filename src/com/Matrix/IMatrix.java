package com.Matrix;

import com.Paint.IPainter;

public interface IMatrix {
    double getM(int rowIndex, int columnIndex);

    void setM(int rowIndex, int columnIndex, double value);

    int getRowsNumber();

    int getColumnsNumber();

    void draw(IPainter p);
}
