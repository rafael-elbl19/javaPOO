import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newList = list1.stream()
                .filter(x -> x % 2 == 0) //FILTRA OS PARES
                .map(x -> x * 10) //OS PARES AGORA SÃO MULTIPLICADOS POR DEZ
                .toList(); //TRANSFORMA A STREAM EM LISTA NOVAMENTE

        System.out.println(newList); //USA O MÉTODO IMPLÍCITO toString() da newList
        System.out.println(Arrays.toString(newList.toArray())); //TRANSFORMA A LIST EM ARRAY E A ARRAY EM STRING

    }
}