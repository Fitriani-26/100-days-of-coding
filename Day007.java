public class Day007 {
    public static void main(String[] args) {
        int umur = 100;
        String nama = "Fitriani";

        System.out.println("Data Golongan umur : ");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : "+umur + " " + "Tahun");
        if (umur >= 30) {
            System.out.println("Termasuk Golongan Orangtua");   
        }else if (umur >= 14) {
            System.out.println("Termasuk Golongan Remaja");
        } else {
            System.out.println("Termasuk Golongan anak-anak");  
        }
    }   
}