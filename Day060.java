public class Day060 {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 1, 3}, {3, 2, 6}, {6, 1, 9}};
        int[][] matrix2 = {{2, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] hasil = penjumlahan(matrix1, matrix2);

        displayMatrix("Matrix 1:", matrix1);
        displayMatrix("Matrix 2:", matrix2);
        displayMatrix("Hasil penjumlahan matriks:", hasil);
    }

    public static void displayMatrix(String label, int[][] matrix) {
        System.out.println(label);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] penjumlahan(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] hasil = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return hasil;
    }
}

