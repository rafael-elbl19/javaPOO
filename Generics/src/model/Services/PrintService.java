package model.Services;

import java.util.ArrayList;
import java.util.List;


//GENERALIZADA COM O TIPO T PARA RECEBER MAIS DE UM TIPO DE VARIÁVEL
public class PrintService<T>{

    private final List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("ERRO: A lista estávazia!");
        }
        return list.get(0);
    }

    public String print() {
        return list.toString();
    }
}
