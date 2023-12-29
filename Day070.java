public class Day070 {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("Hello, Fitri");
        
        // Menampilkan isi awal
        System.out.println("Isi Awal: " + sc);
        
        // Mengganti teks pada posisi tertentu
        sc.delete(5, 12);
        
        // Menampilkan hasil setelah penggantian
        System.out.println("Setelah Penghapusan: " + sc);
    }
    
}
