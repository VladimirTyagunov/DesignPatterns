package com.Paint;

import com.Matrix.IMatrix;

import javax.swing.*;
import java.awt.*;

public class InWindowPainter implements  IPainter {

    private IMatrix matrix;

    private JFrame jframe;
    private JPanel jPanel;
    private GridLayout grid;

    private JButton[][] b;


    public void beginPaint(IMatrix m) {
        System.out.print("Hey, I've just started drawing your matrix in separate window!\n");

        jframe = getFrame();
        jPanel = new JPanel();
        grid = new GridLayout(m.getRowsNumber(), m.getColumnsNumber(),5,5);

        jPanel.setLayout(grid);
        jPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        matrix = m;

        b = new JButton[matrix.getRowsNumber()][matrix.getColumnsNumber()];

        for (int i = 0; i < matrix.getRowsNumber();i++)
            for (int j = 0; j < matrix.getColumnsNumber(); j++) {
                b[i][j] = new JButton("");
                b[i][j].setPreferredSize(new Dimension(75, 75));
            }
    }

    public void printElementsLeftBorder(int i, int j) { }
    public void printElementsRightBorder(int i, int j) { }

    public void printMatrixBorder() {
//        jPanel.setBorder(BorderFactory.createLineBorder(Color.black, 10));
    }

    public void printElement(int i, int j) {
        b[i][j].setText(Integer.toString((int)matrix.getM(i,j)));
    }

    public void endPaint() {

        for (int i=0; i< matrix.getRowsNumber();i++)
            for (int j = 0; j <matrix.getColumnsNumber(); j++)
                jPanel.add(b[i][j]);

        jframe.add(jPanel);
        jframe.pack();

        System.out.print("Hey, I've just finished drawing your matrix in separate window!\n\n");
    }

    private JFrame getFrame() {
        JFrame jframe = new JFrame("MatrixPanel");
        jframe.setVisible(true);
        jframe.setLocation(550,200);
//        jframe.setSize(500,500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jframe;
    }
}

