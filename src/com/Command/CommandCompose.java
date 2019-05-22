package com.Command;

import com.Matrix.Composite.CompositeMatrix;
import com.Matrix.IMatrix;
import com.Matrix.SparseMatrix;

import java.util.ArrayList;

public class CommandCompose extends Command {
    private ArrayList<Integer> matrixNums = new ArrayList<Integer>();
    private ArrayList<IMatrix> matrixList = new ArrayList<IMatrix>();
    private int rows, columns;

    @Override
    protected void doExecute() {
        MatrixHolder holder = MatrixHolder.getInstance();
        matrixList.clear();
        for (int num : matrixNums)
            matrixList.add(holder.getMatrixList().get(num));
        holder.getMatrixList().add(new CompositeMatrix(matrixList));
    }

    public CommandCompose(ArrayList<Integer> matrixNums) {
        this.matrixNums = matrixNums;
    }
}

