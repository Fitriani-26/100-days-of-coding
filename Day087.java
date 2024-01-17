import java.util.ArrayList;

public class Day087 {
    public static void main(String[] args) {
        ArrayList<String> namaList = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        namaList.add("Alice");
        namaList.add("Bob");
        namaList.add("Charlie");
        namaList.add("David");

        System.out.println(namaList);

        namaList.remove("Alice");
        namaList.remove(2);
        System.out.println("Data Setelah di Hapus :");
        System.out.println(namaList);


    }
    
}
