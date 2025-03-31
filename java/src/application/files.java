package application;

import java.io.File;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * LEITURA DE CAMINHO DE PASTAS
        * */
        System.out.print("Digite o caminho da pasta: ");
        String path = sc.nextLine();

        File file = new File(path);

        //CRIA UM VETOR FOLDERS QUE LISTA OS ARQUIVOS QUE FOREM DIRETÓRIOS, VALIDADOS PELO "::"
        File[] folders = file.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }


        /*
        * CRIAÇÃO DE UMA NOVA PASTA
        * */
        boolean success = new File(path + "\\pastaCriadaComJava").mkdir();
        System.out.println("Diretório criado: " + success);

        sc.close();
    }
}
