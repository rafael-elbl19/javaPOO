package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        //CRIA UMA LISTA IMUTÁVEL 1, 2, 3, 4, 5
        //TRANSFORMA ESSA LISTA EM STREAM POSSIBILITANDO SEU PROCESSAMENTO DE FORMA FUNCIONAL, map, filter...
        /*
         * toArray retorna um array com os elementos de uma stream, convertendo a Stream<Integer> para Object[]
         * arrays.tostring transforma esse object array em uma string [1, 2, 3, 4, 5]
         * */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> st1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> std2 = Stream.of("Rafael", "Isabella", "Cecília");
        System.out.println(Arrays.toString(std2.toArray()));

        //começa em 0 e aplica a regra x+2, precisando de um limitador para não dar OutOfMemory
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

    }
}