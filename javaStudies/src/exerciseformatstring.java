public class exerciseformatstring {

    public static void main(String[] args) {

        String original = "STRING DE TESTE";

        String o1 = original.toLowerCase();
        String o2 = original.substring(2);
        String o3 = original.substring(2, 5);
        String o4 = original.replace('S', '5');
        String o5 = original.replace("ST", "57");
        int i = original.indexOf("RI"); //PRIMEIRA POSIÇÃO DO "RI"

        System.out.println("toLowerCase " + o1);
        System.out.println("substring 1arg " + o2); // PEGA A PARTIR DO CARACTERE DO INDEX
        System.out.println("substring 2arg " + o3); // PEGA DE UM CARACTERE AO OUTRO
        System.out.println("replace 'S' por '5' " + o4);
        System.out.println("replace 'ST' por '57' " + o5);
        System.out.println("Na posição: " + i);


        String phrase = "the elephant is grey";
        String[] vetor = phrase.split(" ");
        /*
        * 1. Criou uma string vetor usando [] e deu o nome de "vetor"
        * 2. Usou o .split para separar o que estiver entre o separador (espaço)
        */
        String word0 = vetor[0];
        String word1 = vetor[1];
        String word2 = vetor[2];
        String word3 = vetor[3];
        System.out.println(word3);
        /*
        * 3. Separa os vetores em novas variáveis strings
        */


    }

}
