package exceptions;

public class DbIntegrityException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	
	/*Se tentar apagar o departamento e tiver dependentes/participantes desse departamento, você tem uma falha de integridade referencial*/
	public DbIntegrityException (String msg) {
		super(msg);
	}
	
}
