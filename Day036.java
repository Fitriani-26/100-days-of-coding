public class Day036 {
    public static void main(String[] args) {
        int [] bilangan = {8,3,5,6,2,3,9,10,43,44,23,56};
 
        for (int i = 0; i < bilangan.length ; i++){
            if (bilangan[i] % 2 == 0) {
                System.out.println(bilangan[i] + " Bilangan Genap");
            }else{
                System.out.println(bilangan[i] + " Bilangan Ganjil");
            }
        }
    }
    
}
