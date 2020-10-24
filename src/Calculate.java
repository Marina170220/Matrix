public class Calculate implements Calculator {

    public boolean compareMatricesForSumOrDifference(Matrix firstMatrix, Matrix secondMatrix) {
        return (firstMatrix.getColumnAmount() == secondMatrix.getColumnAmount() && firstMatrix.getLineAmount() == secondMatrix.getLineAmount());
    }

    public boolean compareMatricesForMultiply(Matrix firstMatrix, Matrix secondMatrix) {
        return (firstMatrix.getColumnAmount() == secondMatrix.getLineAmount());
    }

    public Matrix sumOfMatrices(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        Matrix resultMatrix = new Matrix(firstMatrix.getLineAmount(), firstMatrix.getColumnAmount(), "Sum of matrices");
        if (compareMatricesForSumOrDifference(firstMatrix, secondMatrix)) {


            for (int i = 0; i < resultMatrix.getLineAmount(); i++) {
                for (int j = 0; j < resultMatrix.getColumnAmount(); j++) {
                    resultMatrix.setElement(i, j, (firstMatrix.getElement(i, j) + secondMatrix.getElement(i, j)));
                }
            }
        } else throw new MatrixException("Matrices are not equal");

        return resultMatrix;
    }

    public Matrix differenceBetweenMatrices(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        Matrix resultMatrix = new Matrix(firstMatrix.getLineAmount(), firstMatrix.getColumnAmount(), "Difference between matrices");
        if (compareMatricesForSumOrDifference(firstMatrix, secondMatrix)) {


            for (int i = 0; i < resultMatrix.getLineAmount(); i++) {
                for (int j = 0; j < resultMatrix.getColumnAmount(); j++) {
                    resultMatrix.setElement(i, j, (firstMatrix.getElement(i, j) - secondMatrix.getElement(i, j)));
                }
            }
        } else throw new MatrixException("Matrices are not equal");

        return resultMatrix;
    }

    public Matrix multiplyOfMatrices(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {

        Matrix resultMatrix = new Matrix(secondMatrix.getColumnAmount(), firstMatrix.getLineAmount(), "Multiply between matrices");
        if (compareMatricesForMultiply(firstMatrix, secondMatrix)) {

            for (int i = 0; i < firstMatrix.getLineAmount(); i++) {
                for (int j = 0; j < secondMatrix.getColumnAmount(); j++) {
                    int sum = 0;
                    for (int p = 0; p < firstMatrix.getColumnAmount(); p++) {
                        sum += (firstMatrix.getElement(i, p) * secondMatrix.getElement(p, j));
                    }
                    resultMatrix.setElement(i, j, sum);
                }
            }
        } else throw new MatrixException("Matrix's sizes do not match");

        return resultMatrix;
    }

    @Override
    public Matrix transposeMatrices(Matrix a) throws MatrixException {
        Matrix resultMatrix = new Matrix(a.getColumnAmount(), a.getLineAmount(), "Transpose matrix");
        for (int i = 0; i < a.getLineAmount(); i++) {
            for (int j = 0; j < a.getColumnAmount(); j++) {
                resultMatrix.setElement(j, i, a.getElement(i, j));
            }
        }
        return resultMatrix;
    }
}
