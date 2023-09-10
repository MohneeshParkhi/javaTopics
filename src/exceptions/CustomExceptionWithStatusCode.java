package exceptions;

public class CustomExceptionWithStatusCode extends Exception{
	
	private Integer statusCode;
	
	CustomExceptionWithStatusCode(String message, Integer statusCode){
		super(message);
		this.statusCode = statusCode;
	}
}
