package com.Command;

public class CommandSetElement extends Command {

    private int i,j;
    private double val;
    private int matrixNum;

    public CommandSetElement(int matrixNum, int i, int j, double val){
        this.i = i;
        this.j = j;
        this.val = val;
        this.matrixNum = matrixNum;
    }

    @Override
    protected void doExecute() {
        MatrixHolder holder = MatrixHolder.getInstance();
        holder.getMatrixList().get(matrixNum).setM(i,j,val);
    }
}