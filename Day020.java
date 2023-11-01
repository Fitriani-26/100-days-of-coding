class Hewan {
    public void suara () {
        System.out.println("mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    public void makan (){
        System.out.println("Kucing Pemakan Daging Ikan");
    }

}

public class Day020 {
    public static void main(String[] args) {
        Hewan objHewan = new Kucing(); // Upcasting 
        objHewan.suara();

        Kucing objKucing = (Kucing) objHewan; //Downcasting 
        objKucing.makan();
    }
}
    
