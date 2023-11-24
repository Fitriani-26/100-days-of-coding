import java.util.Scanner;

public class Day046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai dari pengguna
        System.out.print("Masukkan nilai Anda: ");
        int nilai = sc.nextInt();

        // Memanggil fungsi dan menampilkan hasil
        System.out.println("Grade: " + tentukanGrade(nilai));

    }

    // Fungsi untuk menentukan grade berdasarkan nilai
    public static String tentukanGrade(int nilai) {
        if (nilai >= 90) {
            return "A";
        } else if (nilai >= 80) {
            return "B";
        } else if (nilai >= 70) {
            return "C";
        } else if (nilai >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}
