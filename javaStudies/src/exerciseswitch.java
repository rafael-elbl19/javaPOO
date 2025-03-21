import java.util.Scanner;

public class exerciseswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("write the number of the day");
        Integer day = sc.nextInt();
        String dayWeek = "";

        if (day > 0 && day <= 7) {
            switch (day) {
                case 1:
                    dayWeek = "monday";
                    break;
                case 2:
                    dayWeek = "tuesday";
                    break;
                case 3:
                    dayWeek = "wednesday";
                    break;
                case 4:
                    dayWeek = "thursday";
                    break;
                case 5:
                    dayWeek = "friday";
                    break;
                case 6:
                    dayWeek = "saturday";
                    break;
                case 7:
                    dayWeek = "sunday";
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
        }
        System.out.println(dayWeek);
    }
}
