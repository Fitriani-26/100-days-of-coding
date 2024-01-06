public class Day073 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Smart Phones");
 
        s.delete(0, 6);
        System.out.println(s);
 
        s.deleteCharAt(5);
        System.out.println(s);

    }
}
