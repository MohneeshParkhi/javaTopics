package exceptions;


class NotFoundException extends Throwable {
	NotFoundException(String message){
		super(message);
	}
}


public class CustomExceptionDriver {

	public static void main(String args[]) throws NotFoundException {
		String msg = "Not Null";
		
		if(msg.equals(null)) {
			throw new NotFoundException("String is Null");
		} else
		{
			System.out.println("Message is:"+ msg);
		}
	}
}
