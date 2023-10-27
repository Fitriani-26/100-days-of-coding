public class Day018 {
    public static void main(String[] args) {
        int angkaInt = 56;
        double angkaDouble = 5.90;
        float angkaFloat = 3.14f;
        boolean Benar = true;

        String strInt = String.valueOf(angkaInt);
        String strDob = String.valueOf(angkaDouble);
        String strFloat = String.valueOf(angkaFloat);
        String strBol = String.valueOf(Benar);

        System.out.println("Int ke String = " +strInt);
        System.out.println("Double ke String = " +strDob);
        System.out.println("Float ke String = " +strFloat);
        System.out.println("Boolean ke String = " +strBol);

    }
}
