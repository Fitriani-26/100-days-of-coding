import java.util.ArrayList;
public class Day031 {
    public static void main(String[] args) {
        ArrayList <String> namaBarang = new ArrayList<>();

        namaBarang.add("Laptop");
        namaBarang.add("Baju");
        namaBarang.add("Sepatu");
        namaBarang.add("Handphone");
        namaBarang.add("Komputer");

        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Barang yang ada pada urutan ke-3 : " + namaBarang.get(2));
        namaBarang.remove("Sepatu");
        System.out.println("Nama Barang setelah dihapus : " + namaBarang);
        namaBarang.set(0, "Jilbab");
        System.out.println("Nama Barang setelah diubah : " + namaBarang);;





        
    }
    
}
