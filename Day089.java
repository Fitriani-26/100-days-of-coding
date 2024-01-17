public class Day089 {
    public static void main(String[] args) {

        
        System.out.println("Hasil : "+luas(10, 20));
        System.out.println("Hasil : "+keliling(5, 2));
    }
    public static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;

    }
    public static int keliling(int panjang1, int lebar2){
        int keliling = 2 * panjang1 *lebar2;
        return keliling;

    }
    
}
