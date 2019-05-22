package com.Command;

import com.Matrix.IMatrix;
import com.Matrix.OrdinaryMatrix;

import java.util.ArrayList;

public class CommandAddOrdinaryMatrix extends  Command{
    private int matrixNum;
    private int rows, columns;

    @Override
    protected void doExecute() {
        MatrixHolder holder = MatrixHolder.getInstance();
        if (matrixNum >= holder.getMatrixList().size())
            holder.getMatrixList().add(new OrdinaryMatrix(rows,columns));
        else {
            IMatrix matrix = holder.getMatrixList().get(matrixNum);
            matrix = new OrdinaryMatrix(rows, columns);
        }
    }

    public CommandAddOrdinaryMatrix(int matrixNum, int rows, int columns) {
        this.matrixNum = matrixNum;
        this.rows = rows;
        this.columns = columns;
    }
}

