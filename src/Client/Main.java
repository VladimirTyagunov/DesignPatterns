package Client;

import com.Command.*;
import com.Paint.ConsolePainter;
import com.Paint.IPainter;
import com.Paint.InWindowPainter;

import java.util.ArrayList;
import java.util.Arrays;

class Main {

    static void addOrdMatrix(int matrixNum, int rows, int columns) {
        ICommand command = new CommandAddOrdinaryMatrix(matrixNum, rows, columns);
        command.execute();
    }

    static void addSparseMatrix(int matrixNum, int rows, int columns) {
        ICommand command = new CommandAddSparseMatrix(matrixNum, rows, columns);
        command.execute();
    }

    static void setMatrixElement(int matrixNum, int i, int j, double value) {
        ICommand command = new CommandSetElement(matrixNum, i, j, value);
        command.execute();
    }

    static void printMatrix(int matrixNum, IPainter painter) {
        ICommand command = new CommandPrintMatrix(matrixNum, painter);
        command.execute();
    }

    static void composeMatrixs(ArrayList<Integer> matrixNums) {
        ICommand command = new CommandCompose(matrixNums);
        command.execute();
    }

    static void undoButton(){
        CommandManager CM = CommandManager.getInstance();
        CM.undo();
    }


    public static void main(String[] args) {

        ICommand commandINIT = new CommandZero();
        commandINIT.execute();


        addSparseMatrix(1,3,3);
        setMatrixElement(1,1,1,-19);
        setMatrixElement(1,0,0,-19);
//        undoButton();


        composeMatrixs(new ArrayList<Integer>(Arrays.asList(0, 1)));
        setMatrixElement(2,3,3,9.5);
        setMatrixElement(0,3,3,9.5);
//        undoButton();

        printMatrix(1, new ConsolePainter());
        printMatrix(2, new InWindowPainter());

    }
}
