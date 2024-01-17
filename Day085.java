import java.util.Scanner;

public class Day085 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Masukkan Nilai a = ");
        a = input.nextInt();
        System.out.println("Masukkan Nilai b = ");
        b = input.nextInt();
        c = a * b;
        if (c % 2 == 0) {
            d = c + 2;  
        }else{
            d = c * 2;
        }
        System.out.println(d);
    }
    
}
