package com.Paint;

import com.Matrix.IMatrix;

public interface IPainter {
    void beginPaint(IMatrix m);
    void drawCell(IMatrix m, int i, int j);
    void endPaint(IMatrix m);
}
