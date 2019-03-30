package com.Paint;

import com.Matrix.IMatrix;

public interface IPainter {

    void beginPaint(IMatrix m);
    void printMatrixBorder();
    void printElementsLeftBorder(int i, int j);
    void printElementsRightBorder(int i, int j);
    void printElement(int i, int j);
    void endPaint();
}
