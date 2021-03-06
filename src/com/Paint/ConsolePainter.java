package com.Paint;

import com.Matrix.IMatrix;

public class ConsolePainter implements IPainter {
    private String border = "_ ";
    private String elementBorder1 = "|";
    private String elementBorder2 = "   ";

    private int borderSize = elementBorder2.length()*2;


    public void beginPaint(IMatrix m) {

        System.out.print("Hey, I've just started drawing your matrix in console!\n");

        printMatrixBorder(m);
    }

    public void endPaint(IMatrix m) {

        System.out.println();
        printMatrixBorder(m);

        System.out.print("Hey, I've just finished drawing your matrix in console!\n\n");
    }

    public void drawCell(IMatrix m, int i, int j) {
        printElementsLeftBorder(m, i, j);
        printElement(m, i, j);
        printElementsRightBorder(m, i, j);
    }

    private void printMatrixBorder(IMatrix m){
        System.out.print(" ");
        for (int i = 0; i<(borderSize)*m.getColumnsNumber(); i++)
            System.out.print(border);
        System.out.println();
    }

    private void printElementsLeftBorder(IMatrix m, int i, int j) {
        if ((j==0) && (i > 0))
            System.out.println();

        System.out.print(elementBorder1 + elementBorder2);
    }

    private void printElementsRightBorder(IMatrix m, int i, int j) {
        System.out.print(elementBorder2 + elementBorder1);
    }

    private void printElement(IMatrix m, int i, int j) {
        System.out.print( m.getStringM(i, j) );
    }
}
