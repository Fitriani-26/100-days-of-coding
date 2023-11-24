import java.util.Scanner;

public class Day047{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input bilangan positif dari pengguna
        System.out.print("Masukkan bilangan positif: ");
        int bilangan = sc.nextInt();

        // Memanggil fungsi dan menampilkan hasil
        System.out.println("Jumlah kuadrat: " + hitungJumlahKuadrat(bilangan));

    }

    // Fungsi untuk menghitung jumlah kuadrat bilangan positif hingga n
    public static int hitungJumlahKuadrat(int n) {
        if (n <= 0) {
            System.out.println("Masukkan bilangan positif.");
            return 0; // Mengembalikan 0 jika input tidak positif
        }

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i * i;
        }

        return jumlah;
    }
}