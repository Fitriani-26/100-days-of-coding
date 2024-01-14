import java.util.ArrayList;

public class Day076 {
    public static void main(String[] args) {
        ArrayList <String> nama = new ArrayList<>();

        System.out.println("Bahan Makanan");
        nama.add("Masako") ;
        nama.add("Lada Bubuk") ;
        nama.add("Garam") ;
        nama.add("Gula") ;
        nama.add("Bawang Merah") ;
        nama.add("Lombok") ;

        System.out.println(nama);
        System.out.println("Banyaknya bahan makanan yang ditampung =  "+ nama.size());
        System.out.println("Bahan makanan yang ada pada urutan ke-3 = " + nama.get(2));
    }   
}
