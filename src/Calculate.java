public class Calculate implements Calculator {
    @Override
    public int findSum(int a, int b) {
        return a + b;
    }

    @Override
    public int findDifference(int a, int b) {
        return a - b;
    }

    public boolean compareMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        return (firstMatrix.getColumnAmount() == secondMatrix.getColumnAmount() && firstMatrix.getLineAmount() == secondMatrix.getLineAmount());
    }

    public void resultSum(Matrix firstMatrix, Matrix secondMatrix) {
        if (compareMatrices(firstMatrix, secondMatrix)) {
            try {
                Matrix resultMatrix = new Matrix(firstMatrix.getLineAmount(), firstMatrix.getColumnAmount(), "Sum of matrices");
                for (int i = 0; i < resultMatrix.getLineAmount(); i++) {
                    for (int j = 0; j < resultMatrix.getColumnAmount(); j++) {
                        resultMatrix.setElement(i, j, findSum(firstMatrix.getElement(i, j), secondMatrix.getElement(i, j)));
                    }
                }
                System.out.println(resultMatrix);
            } catch (MatrixException e) {
                e.printStackTrace();
            }
        } else System.err.println("Matrices are not equal");
    }

    public void resultDifference(Matrix firstMatrix, Matrix secondMatrix) {
        if (compareMatrices(firstMatrix, secondMatrix)) {
            try {
                Matrix resultMatrix = new Matrix(firstMatrix.getLineAmount(), firstMatrix.getColumnAmount(), "Difference between matrices");
                for (int i = 0; i < resultMatrix.getLineAmount(); i++) {
                    for (int j = 0; j < resultMatrix.getColumnAmount(); j++) {
                        resultMatrix.setElement(i, j, findDifference(firstMatrix.getElement(i, j), secondMatrix.getElement(i, j)));
                    }
                }
                System.out.println(resultMatrix);
            } catch (MatrixException e) {
                e.printStackTrace();
            }
        }
        else System.err.println("Matrices are not equal");
    }
}
