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
        System.out.println(m);
    }

    public void userFilling(Matrix m) {
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
    }
}
