public class Day039 {
    public static void main(String[] args) {
        int bulan = 11;
        String stringBulan;
        switch (bulan) {
            case 1:
                stringBulan = "January";
                break;
            case 2:
                stringBulan = "February";
                break;
            case 3:
                stringBulan = "March";
                break;
            case 4:
                stringBulan = "April";
                break;
            case 5:
                stringBulan = "May";
                break;
            case 6:
                stringBulan = "June";
                break;
            case 7:
                stringBulan = "July";
                break;
            case 8:
                stringBulan = "August";
                break;
            case 9:
                stringBulan = "September";
                break;
            case 10:
                stringBulan = "October";
                break;
            case 11:
                stringBulan = "November";
                break;
            case 12:
                stringBulan = "December";
                break;
            default:
                stringBulan = "Invalid";
                break;
        }
        System.out.println(stringBulan);
    }
}
