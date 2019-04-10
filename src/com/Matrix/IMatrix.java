package com.Matrix;

import com.Paint.IPainter;

public interface IMatrix {
    double getM(int rowIndex, int columnIndex);

    String getStringM(int rowIndex, int columndIndex);

    void setM(int rowIndex, int columnIndex, double value);

    int getRowsNumber();

    int getColumnsNumber();

    void draw(IPainter p);

}
