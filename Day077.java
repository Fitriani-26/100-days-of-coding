import java.util.ArrayList;

public class Day077 {
    public static void main(String[] args) {
        ArrayList <Integer> nama = new ArrayList<>();

        System.out.println("Umur Lansia");
        nama.add(83) ;
        nama.add(70) ;
        nama.add(98) ;
        nama.add(69) ;

        System.out.println(nama);
        System.out.println("Banyaknya Umur yang ditampung =  "+ nama.size());
        System.out.println("Umur lansia yang ada pada urutan terkahir adalah = " + nama.get(3));
    }
}
