package com.Paint;

import com.Matrix.IMatrix;

public interface IPainter {

    void beginPaint(IMatrix m);
    void printMatrixBorder(IMatrix m);
    void printElementsLeftBorder(IMatrix m, int i, int j);
    void printElementsRightBorder(IMatrix m, int i, int j);
    void printElement(IMatrix m, int i, int j);
    void endPaint(IMatrix m);
}
