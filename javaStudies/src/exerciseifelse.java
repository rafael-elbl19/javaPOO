import java.util.Scanner;
public class exerciseifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the minutes on gaming");
        Integer time = sc.nextInt();
        Double paybill = 50.00;

        if (time > 0 && time <= 100) {
            System.out.println("Total $" + paybill);
        } else if (time > 100) {
            paybill = paybill + ((time - 100) * 3);
            System.out.println("Total " + paybill);
        } else {
            System.out.println("wrong value, insert it again!");
        }
    }
}
