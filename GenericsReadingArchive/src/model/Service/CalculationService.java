package model.Service;

import model.Entities.Product;

import java.util.List;

public class CalculationService {
    //VAI TRABALHAR COM QUALQUER TIPO "T"
    //DESDE QUE ESSE TIPO "T" SEJA SUBTIPO DE COMPARABLE<T>
    public static <T extends Comparable> T max(List<T> list) {
        T max = list.get(0);
        for (T item : list) {
            if(item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

}
