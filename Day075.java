public class Day075 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Halo");
        printData(builder);
        System.out.println("\n");

        // append
        builder.append(" semuanya");
        printData(builder);
        System.out.println("\n");

        builder.append(" warga Polewali");
        printData(builder);
        System.out.println("\n");

        // insert
        builder.insert(19," Kota");
        printData(builder);
        System.out.println("\n");

        // delete
        builder.delete(19,24);
        printData(builder);
        System.out.println("\n");

        // rubah character pada index tertentu
        builder.setCharAt(14,'W');
        printData(builder);
        System.out.println("\n");

        // replace
        builder.replace(20,28,"Majene");
        printData(builder);
        System.out.println("\n");

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());
    }
}
