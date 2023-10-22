
public class Day014 {
    public static void main(String[] args) {
        int [] angka = {80, 90, 65, 70, 89,};

        int total = 0;
        for (int i = 0; i < angka.length; i++){
            total += angka[i];
        }

        double rata_rata = (double) total / angka.length;

        System.out.println("Bilangan dalam array:");
        for (int number : angka) {
            System.out.print(number + " ");
        }
        System.out.println("\nJumlah dari semua bilangan: " + total);
        System.out.println("Rata-rata: " + rata_rata);

        
    }
    
}
