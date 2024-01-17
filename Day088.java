import java.util.ArrayList;

public class Day088 {
    public static void main(String[] args) {
        ArrayList<String> namaList = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        namaList.add("Alice");
        namaList.add("Bob");
        namaList.add("Charlie");
        namaList.add("David");

        System.out.println(namaList);

        System.out.println("Indeks kedua = "+namaList.get(1));
        System.out.println("Indeks ke Tiga = "+namaList.get(2));
    }
    
}
