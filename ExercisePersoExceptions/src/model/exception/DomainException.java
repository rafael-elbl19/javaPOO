package model.exception;

public class DomainException extends Exception{
    //CLASSE EXCEÇÃO COLOCAMOS GERALMENTE O SUFIXO Exception

    //PERMITE QUE A EXCEÇÃO TENHA UMA MENSAGEM
    public DomainException(String message) {
        super(message);
    }
}
