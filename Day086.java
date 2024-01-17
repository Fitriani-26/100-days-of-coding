import java.util.ArrayList;

public class Day086 {
    public static void main(String[] args) {
         ArrayList<String> namaList = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        namaList.add("Alice");
        namaList.add("Bob");
        namaList.add("Charlie");
        namaList.add("David");

        System.out.println("Isi ArrayList:");
        for (String nama : namaList) {
            System.out.println(nama);
        }
    }  
}
