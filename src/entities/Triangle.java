package entities;

public class Triangle {
    //PUBLIC INDICA QUE A FUNÇÃO PODE SER USADA EM OUTRO ARQUIVO
    public double a;
    public double b;
    public double c;

    public double area () {
        //NÃO RECEBE PARÂMETROS POIS ELES JÁ ESTÃO CONTIDOS NA CLASSE(a,b,c)

        double w = (a+b+c)/2.0;
        return Math.sqrt ( w * ( w - a ) * ( w - b ) * ( w - c ));
    }
}
