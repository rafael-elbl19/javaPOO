import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    /*O problema é o seguinte:
    * 1) Eu tenho uma lista de inteiros e uma lista de doubles, e quero copiar os dois para dentro de uma lista de um tipo mais genérico.
    * */

    public static void main(String[] args) {

        List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(1.2, 3.3, 4.6, 4.9);
        List<Object> myObjects = new ArrayList<Object>();

        //COPIAR MINHA ORIGEM INTEIROS PARA MEU DESTINO OBJECTS
        copy(myIntegers, myObjects);
        System.out.print("Lista com inteiros: ");
        print(myObjects);
        copy(myDoubles, myObjects);
        System.out.print(" -  Lista com inteiros e doubles: ");
        print(myObjects);

    }

    //PEGA QUALQUER LISTA ORIGEM SUBCLASSE DE NUMBER E QUALQUER LISTA ACIMA DE NUMBER (OBJECT)
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        //PARA CADA NÚMERO ADICIONADO À MINHA LISTA DE ORIGEM
        for (Number number : source) {
            //ADICIONA NÚMERO À MINHA LISTA DE DESTINO
            destiny.add(number);
        }
    }

    public static void print(List<Object> obj) {
        for (Object o : obj) {
            System.out.print(o + " ");
        }
    }


}