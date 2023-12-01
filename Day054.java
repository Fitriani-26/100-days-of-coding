import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day054 {
    public static void main(String[] args) {
        try {
            // Membuka file untuk dibaca
            File file = new File("input.txt");

            // Membuat objek Scanner untuk membaca dari file
            Scanner sc = new Scanner(file);

            // Membaca isi file dan menampilkannya ke console
            while (sc.hasNextLine()) {
                String baris = sc.nextLine();
                System.out.println(baris);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
