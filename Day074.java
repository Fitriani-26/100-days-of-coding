public class Day074 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("I don't like this");
 
        s.delete(0, 7);
        System.out.println(s);
 
        s.deleteCharAt(7);
        System.out.println(s);
    }
    
}
