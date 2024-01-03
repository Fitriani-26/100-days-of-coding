public class Day072 {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Hello Fitri,");
        // Menambahkan teks
        sc.append(" Apa Kabar");
        System.out.println("Isi Awal: " + sc);
        
        // Menghapus teks pada posisi tertentu
        sc.delete(12, 22);
        System.out.println("Setelah Penghapusan: " + sc);
        
        // Menyisipkan Teks
        sc.insert(11, "ani");
        System.out.println("Setelah Penyisipan: " + sc);
    }
    
}
