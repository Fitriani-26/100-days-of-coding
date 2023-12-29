public class Day069 {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("Hello, World!");
        
        // Menampilkan isi awal
        System.out.println("Isi Awal: " + sc);
        
        // Mengganti teks pada posisi tertentu
        sc.replace(7, 12, "Fitri");
        
        // Menampilkan hasil setelah penggantian
        System.out.println("Setelah Penggantian: " + sc);
    }
}
