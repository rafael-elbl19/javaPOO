import java.util.Scanner;

public class exercisewhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 9) {
            number = sc.nextInt();
        }
    }
}
