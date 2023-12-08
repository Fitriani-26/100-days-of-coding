public class Day058 {
    public static void main(String[] args) {
        // Membuat array 2D (3x3) dengan tipe data int
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Isi array 2D:");
        display2DArray(array2D);
    }
    public static void display2DArray(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();  // Pindah ke baris baru setelah setiap baris array
        }
    }
}
