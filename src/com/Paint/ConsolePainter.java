package com.Paint;

import com.Matrix.IMatrix;

public class ConsolePainter implements IPainter {

    private IMatrix matrix;

    private String border = "_ ";
    private String border1 = "|";
    private String border2 = "   ";

    public void beginPaint(IMatrix m) {

        matrix = m;

        System.out.print("Hey, I've just started drawing your matrix in console!\n");


        for (int i = 0; i<(6)*matrix.getColumnsNumber(); i++)
            System.out.print(border);
        System.out.println();
    }


    public void printElementsBorder(int i, int j) {
        if ((j==0) && (i > 0))
            System.out.print(border1 +"\n");

        System.out.print(border1 + border2);
    }


    public void printElement( int i, int j) {
        System.out.printf("%.2f" + border2, matrix.getM(i, j) );
    }

    public void endPaint() {

        System.out.println(border1);
        for (int i = 0; i<(6)*matrix.getColumnsNumber(); i++)
            System.out.print(border);
        System.out.println();

        System.out.print("Hey, I've just finished drawing your matrix in console!\n\n");
    }
}
