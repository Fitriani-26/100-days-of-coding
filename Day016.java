import java.util.Scanner;

public class Day016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int pilih;

        System.out.println("Pilih jenis konversi:");
        System.out.println("1. String ke Integer");
        System.out.println("2. String ke Boolean");
        System.out.println("3. String ke Float");
        System.out.println("4. String ke Double");
        System.out.println("5. String ke Long");
        System.out.println("6. String ke Byte");

        pilih = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline setelah nextInt()

        System.out.print("Masukkan string: ");
        input = scanner.nextLine();

        switch (pilih) {
            case 1:
                int angkaInt = Integer.parseInt(input);
                System.out.println("String ke Integer = " + angkaInt);
                break;
            case 2:
                boolean angkaBoolean = Boolean.parseBoolean(input);
                System.out.println("String ke Boolean = " + angkaBoolean);
                break;
            case 3:
                float angkaFloat = Float.parseFloat(input);
                System.out.println("String ke Float = " + angkaFloat);
                break;
            case 4:
                double angkaDouble = Double.parseDouble(input);
                System.out.println("String ke Double = " + angkaDouble);
                break;
            case 5:
                long angkaLong = Long.parseLong(input);
                System.out.println("String ke Long = " + angkaLong);
                break;
            case 6:
                byte angkaByte = Byte.parseByte(input);
                System.out.println("String ke Byte = " + angkaByte);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

