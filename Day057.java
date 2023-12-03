public class Day057 {
    public static void main(String[] args) {
         int bil1 = 5, bil2 = 10, hasil;
 
         System.out.println("Bilangan Pertama : " + bil1);
         System.out.println("Bilangan Kedua : " + bil2);
         hasil = (bil1 > bil2) ? (bil1 / bil2) : (bil1 * bil2);
  
         // Print the largest number
         System.out.println("Hasil = " +hasil);
    }
    
}
