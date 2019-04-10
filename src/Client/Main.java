package Client;

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

        A1.draw(p1);
        A1.draw(p2);

        m = new MatrixStats(A1);
        System.out.print("\n\nA1 Stats\nsum: " + m.sum + "\naverage: " + m.average + "\nmax: " +
                m.max + "\nNoNullNumber: " + m.NoNullNumber + "\n\n");



//        IMatrix A2 = new MatrixRenumberedRows(A1,0,1);
//        A2.draw(p1);
//        A2.draw(p2);
//
//        System.out.println(A2.getM(1,1));
    }
}
