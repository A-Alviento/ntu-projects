package q4;
import java.util.Scanner;

public class CalculatorEx {
	private double result;
	
	// constructor to initialise the starting
	// value of result to 0.0
	public CalculatorEx() {
		this.result = 0.0;
	}
	
	// accessor method to current result
	public double resultValue() {
		return this.result;
	}
	
	// evaluate computation
	public double evaluate(char op, double n1, double n2) throws UnknownOperatorException {
		
		switch(op) {
		case '+':
			this.result = n1 + n2;
			break;
		case '-':
			this.result = n1 - n2;
			break;
		case '*':
			this.result = n1 * n2;
			break;
		case '/':
			this.result = n1 / n2;
			break;
		default:
			throw new UnknownOperatorException(op);
		}
		
		return this.result;
	}
	
	// handle unknown operator exception 
	// and ask user to reenter data again
	public double handleUnknownOpException() {
		System.out.println("Please reenter:");
		return this.result;
	}
	
	public static void main(String[] args) {
		
		CalculatorEx calc = new CalculatorEx();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculator is on");
		System.out.println("result = " + calc.resultValue());
		
		char op = sc.next().charAt(0);
		double val = sc.nextDouble();
		
		while (true) {
			try {
				calc.evaluate(op, calc.resultValue(), val);
				System.out.println("result " + op + " = " + calc.resultValue());
			} catch (UnknownOperatorException e) {
				System.out.println(e.getMessage());
				calc.handleUnknownOpException();
			}
			
			System.out.println("updated result = " + calc.resultValue());
			op = sc.next().charAt(0);
			
			if (op == 'q' || op == 'Q') {
				break;
			}
			val = sc.nextDouble();
		}
		
		System.out.println("Final result = " + calc.resultValue());
		System.out.println("End of Program");
		
	}
}
