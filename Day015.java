import java.math.BigInteger;

public class Day015 {
    public static void main(String[] args) {
       BigInteger bigInteger1 = new BigInteger("946475896095857463542243564758697979");
       BigInteger bigInteger2 = new BigInteger("980796887646355243284984958570780980");

       BigInteger jumlah = bigInteger1.add(bigInteger2);
       BigInteger kurang = bigInteger1.subtract(bigInteger2);
       BigInteger perkalian = bigInteger1.multiply(bigInteger2);

       System.out.println("BigIneteger1 = " +bigInteger1);
       System.out.println("BigIneteger3 = " +bigInteger2);
       System.out.println("Hasil Penjumlahan = " +jumlah);
       System.out.println("Hasil Pengurangan   = " +kurang);
       System.out.println("Hasil Perkalian  = " +perkalian);
    }
    
}
