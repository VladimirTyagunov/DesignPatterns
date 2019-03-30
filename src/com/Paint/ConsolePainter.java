package com.Paint;

import com.Matrix.IMatrix;

public class ConsolePainter implements IPainter {

    private IMatrix matrix;

    private String border = "_ ";
    private String elementBorder1 = "|";
    private String elementBorder2 = "   ";

    private int borderSize = elementBorder2.length()*2;


    public void beginPaint(IMatrix m) {

        matrix = m;

        System.out.print("Hey, I've just started drawing your matrix in console!\n");

        printMatrixBorder();
    }


    public void printMatrixBorder(){
        System.out.print(" ");
        for (int i = 0; i<(borderSize)*matrix.getColumnsNumber(); i++)
            System.out.print(border);
        System.out.println();
    }


    public void printElementsLeftBorder(int i, int j) {
        if ((j==0) && (i > 0))
            System.out.println();

        System.out.print(elementBorder1 + elementBorder2);
    }


    public void printElementsRightBorder(int i, int j) {
        System.out.print(elementBorder2 + elementBorder1);
    }


    public void printElement( int i, int j) {
        System.out.printf("%.2f", matrix.getM(i, j) );
    }


    public void endPaint() {

        System.out.println();
        printMatrixBorder();

        System.out.print("Hey, I've just finished drawing your matrix in console!\n\n");
    }
}
