import java.util.Scanner;

public class Task_048_TransposeMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Matris satır sayısını girin: ");
        int row = scanner.nextInt();

        System.out.print("Matris sütun sayısını girin: ");
        int col = scanner.nextInt();


        int[][] matrix = new int[row][col];
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int[][] transposeMatrix = findTranspose(matrix);


        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoz:");
        printMatrix(transposeMatrix);

        scanner.close();
    }


    private static int[][] findTranspose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposeMatrix = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }



}
