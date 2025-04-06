import java.sql.SQLOutput;
import java.util.*;
/*INTERFACE Set<T>
 * - inserção, remoção e acesso muito mais rápido
 * - elementos não possuem posição
 * - oferece interseção, união e diferença
 * - não adimite repetição
 * 1) HashSet = muito rapido mas nao garante ordenação
 * 2) TreeSet = mais lento, mas ordenado pelo comparador do objeto
 * 3) LinkeHashSet = médio, elementos na ordem em q são adicionados
 * */

public class Main {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Car");
        set.add("Tshirt");

        set.removeIf(x -> x.length()>3);

        System.out.println("Contém TV: " + set.contains("TV"));
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("----------------------------------------------");
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //UNIÃO
        //Crio uma nova coleção igual a "a"
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //INTERSEÇÃO
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //DIFERENÇA
        Set<Integer> e = new TreeSet<>(a);
        //Tira do A tudo que for igual ao B e printa o A
        e.removeAll(b);
        System.out.println(e);




    }
}