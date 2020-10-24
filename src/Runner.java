public class Runner {
    public static void main(String[] args) {
        MatrixCreator matrixCreator = new MatrixCreator();
        Calculate calculate = new Calculate();

        try {
            Matrix firstMatrix = new Matrix(3, 3, "First Matrix");
            Matrix secondMatrix = new Matrix(3, 3, "Second Matrix");
            matrixCreator.randomFilling(firstMatrix, 0, 100);
            System.out.println(firstMatrix);
            matrixCreator.userFillingByLines(secondMatrix);
            System.out.println(secondMatrix);
            System.out.println(calculate.sumOfMatrices(firstMatrix, secondMatrix));
            System.out.println(calculate.differenceBetweenMatrices(firstMatrix, secondMatrix));
            System.out.println(calculate.multiplyOfMatrices(firstMatrix, secondMatrix));
            System.out.println(calculate.transposeMatrices(firstMatrix));

        } catch (MatrixException e) {
            e.printStackTrace();
        }
    }
}
