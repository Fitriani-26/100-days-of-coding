public class Day056 {
    public static void main(String[] args) {
        String username = "fitriani";
        String password = "";
        String hasilUser = (username.isEmpty()) ? "DefaultName" : username;
        String hadilPass = (password.isEmpty()) ? "DefaultPassword" : password;
       
        System.out.println("Username : " + hasilUser);
        System.out.println("Password : " + hadilPass);
    }
    
}
