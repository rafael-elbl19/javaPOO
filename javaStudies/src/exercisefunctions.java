import java.util.Scanner;

public class exercisefunctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write three integer numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int higher = max(n1, n2, n3); //Chama uma função max passando os números recolhidos como parâmetros e passa o resultado para uma variável "higher"

        showResult(higher); //Outra função que passa higher como parâmetro

    }

    public static int max (int x, int y, int z) {
        int aux;
        if (x > z && x > y) {
            aux = x;
        } else if (y > x && y > z) {
            aux = y;
        } else{
            aux = z;
        }
        return aux;
    }

    public static void showResult (int valueHigher) {
        System.out.println("Higher = " + valueHigher);
        /*Quando uma função vai meramente realizar uma operação sem retornar nada, declaramos como void*/
    }
}
