public class Day052 {
    public static void main(String[] args) {
        int [] [] age = {{20,19,18,21,22,17}, {15,12,13,12,11,10}};
        // menampilkan elemen keempat pada array kedua
        System.out.println("Elemen kedua pada array kedua = " + age[1][3]);
        // menampilkan elemen terakhir pada array pertama
        System.out.println("Elemen terakhir pada array pertama = " + age[0][5] + "\n");

    

        // mengubah elemen kedua pada array kedua
        age[1][1] = 14;
        System.out.println("Setelah diubah : ");
        for (int i = 0; i < age.length; i++){
            for (int j = 0; j <age[i].length;j++){
                System.out.println(age[i][j]);
            }

        }
    }

    
}