package com.Matrix;

public class MatrixStats {
    public final double sum, average, max;
    public final int NoNullNumber;

    public MatrixStats(IMatrix mat) {
        double s = 0, m = 0;
        int count = 0;

        int r = mat.getRowsNumber();
        int c = mat.getColumnsNumber();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                double tmp = mat.getM(i, j);
                if (tmp != 0) count++;
                s += tmp;
                if (tmp > m) m = tmp;
            }
        sum = s;
        max = m;
        average = sum / (c * r);
        NoNullNumber = count;
    }
}
