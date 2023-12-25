public class Day064 {
    public static void main(String[] args) {
        int hasilPenjumlahan = tambah(5, 3);
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        double hasilPerkalian = kali(4.5, 2.0);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
        
        // Fungsi untuk penjumlahan dengan parameter dan return value
        public static int tambah(int a, int b) {
            return a + b;
        }
        
        // Fungsi untuk perkalian dengan parameter dan return value
        public static double kali(double x, double y) {
                return x * y;
        }
}
    
