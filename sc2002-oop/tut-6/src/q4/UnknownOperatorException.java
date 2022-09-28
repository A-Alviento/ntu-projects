package q4;

public class UnknownOperatorException extends Exception{
	
	public UnknownOperatorException(char s) {
		
		super(s + " is an unknown operator");
	}
}
