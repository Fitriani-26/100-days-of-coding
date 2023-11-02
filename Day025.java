import java.util.ArrayList;
import java.util.List;
public class Day025 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();

        nilai.add(90);
        nilai.add(80);
        nilai.add(70);
        nilai.add(85);
        nilai.add(79);

        System.out.println("Daftar Nilai : ");
        for (int i = 0; i < nilai.size(); i++) {
            System.out.println(nilai.get(i));
        }
    }
}
