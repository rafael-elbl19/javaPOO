package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //Adicionando elementos à lista
        list.add("Rafael");
        list.add("João");
        list.add("Maria");
        list.add("Mário");
        list.add("José");

        //Percorrer a lista agregando cada string à variável "x"
        System.out.println("Primeira lista");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------");
        //Tamanho da lista
        System.out.println("O tamanho da lista é: " + list.size());
        System.out.println("------------------------");

        //Remoção de elementos
        //list.remove(0);
        list.removeIf(x -> x.charAt(0) == 'J');
        /*Pega um valor x e retorna se esse x no caractere 0 é igual a J
         * Chamado expressão lambda*/

        System.out.println("Segunda lista");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------");
        //Index
        System.out.println("Local de Maria: " + list.indexOf("Maria"));
        /*Virou 0 pois todo o resto foi retirado*/
        System.out.println("------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        /*
        * Pega uma lista que cumpra os requisitos da funcao lambda char0 == M
        * stream permita que use a função lambda e a list, para usar o filtro
        * Retorna um stream filtrado, porém este não é compativel com list, entao usamos o collectors.toList
        * */
        System.out.println("Terceira lista");
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------");

        //Encontrar um elemento da lista que atenda um predicado
        System.out.println("Quarta lista");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("------------------------");



    }

}
