package Client;

import com.Command.*;
import com.Paint.ConsolePainter;
import com.Paint.IPainter;
import com.Paint.InWindowPainter;

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
        printMatrix(1, new ConsolePainter());



//
//        ICommand commandPrintMatrix0 = new CommandPrintMatrix(0, new ConsolePainter());
//        ICommand commandPrintMatrix1 = new CommandPrintMatrix(1, new InWindowPainter());
//
//        ICommand command1 = new CommandAddOrdinaryMatrix(0,4,5);
//        ICommand command2 = new CommandAddSparseMatrix(1,2,3);
//        ICommand command3 = new CommandSetElement(1,0,0,-1000);
//        ICommand command4 = new CommandSetElement(0, 1, 3, 999);
//
//
//
//        commandINIT.execute();
//        command1.execute();
//        command2.execute();
//        command3.execute();
//        command4.execute();
//        commandManager.undo();
//
//        commandPrintMatrix0.execute();
//        commandPrintMatrix1.execute();

    }
}
