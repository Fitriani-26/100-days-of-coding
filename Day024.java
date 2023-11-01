public class Day024 {
    public static void main(String[] args) {
        Boolean [] trfs = {true, false};
        Double [] dbl = {23.4, 3.14, 89.0, 54.0, 10.0}; 

        System.out.println("Panjang data = " + trfs.length);
        System.out.println("Panjang data = " + dbl.length);
        System.out.println("Hasil = " + (dbl[0]+3));
        System.out.println("Hasil = " + (dbl[3]+9.3));
        System.out.println(trfs[0] + " or " + trfs[1] + " menghasilkan = " + (trfs[0] || trfs[1]));
        System.out.println(trfs[0] + " or " + trfs[0] + " menghasilkan = " + (trfs[0] || trfs[0]));
        System.out.println(trfs[1] + " or " + trfs[0] + " menghasilkan = " + (trfs[1] || trfs[0]));
        System.out.println(trfs[1] + " or " + trfs[1] + " menghasilkan = " + (trfs[1] || trfs[1]));
        System.out.println(trfs[0] + " and " + trfs[1] + " menghasilkan = " + (trfs[0] & trfs[1]));
        System.out.println(trfs[0] + " and " + trfs[0] + " menghasilkan = " + (trfs[0] & trfs[0]));
        System.out.println(trfs[1] + " and " + trfs[0] + " menghasilkan = " + (trfs[1] & trfs[0]));
        System.out.println(trfs[1] + " and " + trfs[1] + " menghasilkan = " + (trfs[1] & trfs[1]));

    }
    
}
