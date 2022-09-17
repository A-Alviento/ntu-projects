package q2;

public class Dice {
	
	int valueOfDice;
	
	public Dice() {}
	
	public void setDiceValue(int a) {
		this.valueOfDice = a;
	}
	
	public int getDiceValue() {
		return this.valueOfDice;
	}
	
	public void printDiceValue() {
		System.out.println("Dice value: " + this.valueOfDice);
	}

}
