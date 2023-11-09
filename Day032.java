import java.util.ArrayList;

public class Day032 {
    public static void main(String[] args) {
         ArrayList <Integer> nilaiMhs = new ArrayList<>();

        nilaiMhs.add(90);
        nilaiMhs.add(80);
        nilaiMhs.add(85);
        nilaiMhs.add(96);
        nilaiMhs.add(78);

        System.out.println("Nilai Mahasiswa : "+ nilaiMhs);
        
        System.out.println("Barang yang ada pada urutan ke-3 : " + nilaiMhs.get(2));
        nilaiMhs.remove(3);
        System.out.println("Nilai Mahasiswa setelah dihapus : " + nilaiMhs);
        nilaiMhs.set(0, 69);
        System.out.println("Nilai Mahasiswa setelah diubah : " + nilaiMhs);

    }
    

}
