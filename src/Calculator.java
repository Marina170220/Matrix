public interface Calculator {

    Matrix sumOfMatrices(Matrix a, Matrix b) throws MatrixException;

    Matrix differenceBetweenMatrices(Matrix a, Matrix b) throws MatrixException;

    Matrix multiplyOfMatrices (Matrix a, Matrix b) throws MatrixException;

    Matrix transposeMatrices(Matrix a) throws MatrixException;



}
