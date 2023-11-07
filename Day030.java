public class Day030 {
    public static void main(String[] args) {
        int total;
        total = 0;
    
        int [] angka = new int[10];
    
        for(int i = 0, data = 10; i < 10; i++){
                angka[i] = data;
                data += 2;
        }

        System.out.println("Angka Genap yang ada dalam array : ");
        for(int data : angka){
                System.out.println(data + " ");
                total += data;
        }
            System.out.println("Total Hasil Penjumlahan "+total);
            
    }
}
    

