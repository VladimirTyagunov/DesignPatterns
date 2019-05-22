package com.Command;

import com.Matrix.IMatrix;
import com.Matrix.OrdinaryMatrix;

import javax.swing.*;
import java.util.ArrayList;

public class CommandZero extends Command {
    private ArrayList<IMatrix> matrixList = new ArrayList<IMatrix>();

    @Override
    protected void doExecute() {
        reset();
        MatrixHolder holder = MatrixHolder.getInstance();
        holder.setMatrixList(matrixList);
    }

    public CommandZero(){
        reset();
    }

    private void reset() {
        matrixList.clear();
        IMatrix matrix = new OrdinaryMatrix(4,4);
        matrixList.add(matrix);
    }

}
