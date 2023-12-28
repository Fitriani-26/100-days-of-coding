public class Day068 {
    public static void main(String[] args) {
        StringBuffer nama = new StringBuffer("Hello, Apa Kabar?");

        // Menampilkan isi awal
        System.out.println("Isi Awal: " + nama);

        // Menyisipkan teks pada posisi tertentu
        nama.insert(5, " Fitriani");

        // Menampilkan hasil setelah penyisipan
        System.out.println("Setelah Penyisipan: " + nama);
        
    }
    
}
