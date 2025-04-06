package applications;

import java.util.Arrays;
import java.util.List;

//PERMITE FAZER MÉTODOS QUE RECEBEM GENÉRICOS DE QUALQUER TIPO
//NÃO É POSSÍVEL ADICIONAR ITENS ÀS LISTAS CURINGA
public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3);
        printList(myInts);
        List<String> myStrings = Arrays.asList("Rafael", "Isa", "Cecília");
        printList(myStrings);

    }
    //SENDO CURINGA, INDEPENDE DO TIPO MANDADO PARA IMPRIMIR
    public static void printList(List<?> objects) {
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
    }
}