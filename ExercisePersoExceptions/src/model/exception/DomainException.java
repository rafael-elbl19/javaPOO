package model.exception;

public class DomainException extends Exception{
    /*COMENTÁRIOS IMPORTANTES:
    * 1) CLASSE EXCEÇÃO COLOCAMOS GERALMENTE O SUFIXO Exception
    * 2) "Toda exceção deve ser tratada ou propagada, e usando o throws propagamos ela a todo o método"
    * 3) Existem: Exception e RuntimeException
    *   - A RuntimeException não requer que a exceção seja tratada no código fonte, podendo apagar o "throws", mas ela não vai apontar      um erro caso haja quebra do código. Como se você tratasse a exceção e ao mesmo tempo seu programa nao veja mais o erro, nem        mesmo antes de ser tratada.
    *   - A Exception requer o tratamento da exceção, obrigando o método "throws" e indicando o erro no código.
    * */

    //PERMITE QUE A EXCEÇÃO TENHA UMA MENSAGEM
    public DomainException(String message) {
        super(message);
    }
}
