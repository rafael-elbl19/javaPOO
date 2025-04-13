package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        //CRIA UMA LISTA IMUTÁVEL 1, 2, 3, 4, 5
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //TRANSFORMA ESSA LISTA EM STREAM POSSIBILITANDO SEU PROCESSAMENTO DE FORMA FUNCIONAL, map, filter...
        Stream<Integer> st1 = list.stream();

        /*
        * toArray retorna um array com os elementos de uma stream, convertendo a Stream<Integer> para Object[]
        * arrays.tostring transforma esse object array em uma string [1, 2, 3, 4, 5]
        * */
        System.out.println(Arrays.toString(st1.toArray()));

    }
}