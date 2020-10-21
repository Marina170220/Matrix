public class Matrix {

    int[][] matrix;
    String name;

    public Matrix(int line, int column, String name) throws MatrixException {
        this.name = name;
        if (line > 0 && column > 0)
            matrix = new int[line][column];
        else throw new MatrixException();
    }

    public int getElement(int lineIndex, int columnIndex) throws MatrixException {
        if (checkRange(lineIndex, columnIndex))
            return matrix[lineIndex][columnIndex];
        else throw new MatrixException();
    }

    public void setElement(int lineIndex, int columnIndex, int value) throws MatrixException {
        if (checkRange(lineIndex, columnIndex))
            matrix[lineIndex][columnIndex] = value;
        else throw new MatrixException();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nMatrix : " + name + " " + matrix.length + "x" + matrix[0].length + "\n");
        for (int[] row : matrix) {
            for (int value : row) {
                s.append(value + " ");
            }
            s.append("\n");
        }
        return s.toString();

    }

    public int getLineAmount() {
        return matrix.length;
    }

    public int getColumnAmount() {
        return matrix[0].length;
    }

    public boolean checkRange(int i, int j) {
        return i < matrix.length && j < matrix[0].length && i >= 0 && j >= 0;
    }

}

