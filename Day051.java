public class Day051 {
    public static void main(String[] args) {
        String [] [] myfriends = {{"Pia","Hasmi","Keiza","Faras"}, {"Farhan","Aan","Fadly"}};
        // menampilkan elemen kedua pada array kedua
        System.out.println("Elemen kedua pada array kedua = " + myfriends[1][1]);
        // menampilkan elemen terakhir pada array pertama
        System.out.println("Elemen terakhir pada array pertama = " + myfriends[0][3] + "\n");
    

        // mengubah elemen kedua pada array pertama
        myfriends[0][1] = "Amelia";
        System.out.println("Setelah diubah : ");
        for (int i = 0; i < myfriends.length; i++){
            for (int j = 0; j <myfriends[i].length;j++){
                System.out.println(myfriends[i][j]);
            }

        }
    }

    
}