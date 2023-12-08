public class Day059 {
    public static void main(String[] args) {
        int matriks [] [] = {
            {1,5,3},
            {3,4,2},
            {2,3,5}
        };
        System.out.println("Isi Array 2D");
        menampilkan(matriks);
        int nilai = matriks[1][1];
        System.out.println("Nilai matriks pada baris kedua, kolom kedua adalah : "+nilai);
        int nilai1 = matriks[0][2];
        System.out.println("Nilai matriks pada baris pertama, kolom terakhir adalah : "+nilai1);
        int nilai2 = matriks[2][0];
        System.out.println("Nilai matriks pada baris terakhir, kolom pertama adalah : "+nilai2);
        matriks[0][2] = 8;
        matriks[2][1] = 6; 
        System.out.println("Isi Array Setelah Diubah");
        menampilkan(matriks);
    }
    public static void menampilkan(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();  // Pindah ke baris baru setelah setiap baris array
        }
    }  
}
