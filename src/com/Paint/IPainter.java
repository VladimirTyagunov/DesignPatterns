package com.Paint;

import com.Matrix.IMatrix;

public interface IPainter {

    void beginPaint(IMatrix m);
    void printElementsBorder(int i, int j);
    void printElement(int i, int j);
    void endPaint();
}
