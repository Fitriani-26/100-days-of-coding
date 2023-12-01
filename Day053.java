public class Day053 {
    public static void main(String[] args) {
        String name = System.console().readLine("Input your name : ");
        System.out.println("Your name : "+name);

        String umurStr = System.console().readLine("Input your age : ");
        int umur = Integer.parseInt(umurStr);
        System.out.println("Your age : "+umur+" tahun");
    }    
}