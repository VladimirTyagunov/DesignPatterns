package Client;

import com.Matrix.Composite.CompositeMatrix;
import com.Matrix.Decorator.MatrixRenumberedColumns;
import com.Matrix.Decorator.MatrixRenumberedRows;
import com.Matrix.IMatrix;
import com.Matrix.OrdinaryMatrix;
import com.MatrixOperations.MatrixInitiator;
import com.MatrixOperations.MatrixStats;
import com.Matrix.SparseMatrix;
import com.Paint.ConsolePainter;
import com.Paint.IPainter;
import com.Paint.InWindowPainter;

class Main {
    public static void main(String[] args) {
        MatrixStats m;

//        IMatrix A1 = new OrdinaryMatrix(4, 5);
        IMatrix A1 = new SparseMatrix(4, 5);

        MatrixInitiator.InitMatrix(A1, 7, 100);

        IPainter p1 = new ConsolePainter();
        IPainter p2 = new InWindowPainter();

//        A1.draw(p1);
//        A1.draw(p2);
//
//        m = new MatrixStats(A1);
//        System.out.print("\n\nA1 Stats\nsum: " + m.sum + "\naverage: " + m.average + "\nmax: " +
//                m.max + "\nNoNullNumber: " + m.NoNullNumber + "\n\n");
//
//
//        IMatrix A2 = new MatrixRenumberedColumns(A1,0,1);
//        A2.draw(p1);
//        A2.draw(p2);
//
//        IMatrix A3 = new MatrixRenumberedRows(A2, 0, 1);
//        A3.draw(p1);
//        A3.draw(p2);

        IMatrix m1 = new SparseMatrix(1, 3);
        MatrixInitiator.InitMatrix(m1, 2, 100);
        IMatrix m2 = new OrdinaryMatrix(4, 2);
        MatrixInitiator.InitMatrix(m2, 6, 100);
        IMatrix m3 = new MatrixRenumberedColumns(m1, 0, 1);

        m1.draw(p2);
        m2.draw(p2);
        m3.draw(p2);


        IMatrix m4 = new CompositeMatrix(m1, m2, m3);
        m4.draw(p2);

        IMatrix m5 = new MatrixRenumberedRows(m4, 0, 3);
        m5.draw(p2);
    }
}
