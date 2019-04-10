package com.MatrixOperations;

import com.Matrix.IMatrix;
import java.util.Random;

public class MatrixInitiator {
    public static void InitMatrix(IMatrix A, int NoNullNumber, double m) {

        Random ran = new Random();

        for (int p = 0; p < NoNullNumber; p++) {
            int rawInd, colInd;
            double val;
            do {
                rawInd = ran.nextInt(A.getRowsNumber());
                colInd = ran.nextInt(A.getColumnsNumber());
                val = (2 * ran.nextDouble() - 1) * m;
            } while (A.getM(rawInd, colInd) != 0);
            A.setM(rawInd, colInd, val);
        }
    }
}
