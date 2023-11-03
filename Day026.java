import java.util.ArrayList;

public class Day026 {
    public static void main(String[] args) {
        ArrayList <String> nama = new ArrayList<>();

        nama.add("Fitriani") ;
        nama.add("Berlian") ;
        nama.add("Fajra") ;
        nama.add("Sofia") ;
        nama.add("Amel") ;
        nama.add("Ryan") ;

        System.out.println("Daftar Nama Peminjaman Uang: ");
        for(String daftarnama : nama){
            System.out.println(daftarnama);
        }

    }

    
}