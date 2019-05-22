package com.Command;

import com.Matrix.OrdinaryMatrix;
import com.Paint.IPainter;

public class CommandPrintMatrix extends Command{
    private IPainter painter;
    private int matrixNum;

    @Override
    protected void doExecute() {
        MatrixHolder holder = MatrixHolder.getInstance();
        holder.getMatrixList().get(matrixNum).draw(painter);
    }

    public CommandPrintMatrix(int matrixNum, IPainter painter) {
        this.painter = painter;
        this.matrixNum = matrixNum;
    }
}
