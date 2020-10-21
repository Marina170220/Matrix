public class Runner {
    public static void main(String[] args) {
        MatrixCreator matrixCreator = new MatrixCreator();
        Calculate calculate = new Calculate();

        try {
            Matrix firstMatrix = new Matrix(4, 3, "First Matrix");
            Matrix secondMatrix = new Matrix(4, 3, "Second Matrix");
            matrixCreator.randomFilling(firstMatrix, 0, 100);
            matrixCreator.userFilling(secondMatrix);
            calculate.resultSum(firstMatrix, secondMatrix);
            calculate.resultDifference(firstMatrix, secondMatrix);

        } catch (MatrixException e) {
            e.printStackTrace();
        }
    }
}
