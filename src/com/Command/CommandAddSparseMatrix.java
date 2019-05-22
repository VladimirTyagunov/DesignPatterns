package com.Command;

import com.Matrix.SparseMatrix;

public class CommandAddSparseMatrix extends Command{
    private int matrixNum;
    private int rows, columns;

    @Override
    protected void doExecute() {
        MatrixHolder holder = MatrixHolder.getInstance();
        holder.getMatrixList().add(new SparseMatrix(rows,columns));
    }

    public CommandAddSparseMatrix(int matrixNum, int rows, int columns) {
        this.matrixNum = matrixNum;
        this.rows = rows;
        this.columns = columns;
    }
}

