import java.util.Scanner;

public class Day081 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double diameter, radius, luas, phi;
        System.out.println("Masukkan Diameter = ");
        diameter = input.nextInt();
        phi = 3.14;
        radius = diameter/2;
        luas = phi * radius * radius;
        System.out.println("Diameter = " + luas);
        
    }
    
}
