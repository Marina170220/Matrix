import java.util.Random;
import java.util.Scanner;

public class MatrixCreator {

    public void randomFilling(Matrix m, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < m.getLineAmount(); i++) {
            for (int j = 0; j < m.getColumnAmount(); j++) {
                try {
                    m.setElement(i, j, min + random.nextInt(max - min + 1));
                } catch (MatrixException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*public void userFilling(Matrix m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.getLineAmount(); i++) {
            for (int j = 0; j < m.getColumnAmount(); j++) {
                System.out.println("Enter value of matrix element");
                try {
                    m.setElement(i, j, scanner.nextInt());
                } catch (MatrixException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(m);
    }*/

    /*public String [] splitStringToSymbols (String enteredString) {
        if (enteredString.contains(' ')||)

        switch (separator) {
            case " ":
            case "-":
            case "_":
            case "+":
            case "/":
            case ";":
            case ",":
            case ".":
            case "*":

        }
        String[] line=enteredString.split(separator);
        return line;
    }*/

    public void userFillingByLines(Matrix matrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.getLineAmount(); i++) {
            System.out.println("Enter " + matrix.getColumnAmount() + " elements for filling " + (i + 1) + " line of matrix.\nUse space to separate elements");
            String matrixLine = scanner.nextLine();
            String[] line = matrixLine.split(" ");
            for (int j = 0; j < matrix.getColumnAmount(); j++) {
                int value = Integer.parseInt(line[j]);
                try {
                    matrix.setElement(i, j, value);
                } catch (MatrixException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
