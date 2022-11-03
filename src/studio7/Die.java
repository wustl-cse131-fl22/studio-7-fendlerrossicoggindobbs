package studio7;

public class Die {

	private int n;
	
	public Die (int instn) {
		n = instn;
	}
	
	public String toString() {
		return n +"";
	}
	
	public int throwDice() {
		return (int)(Math.random()*n)+1;
	}
	
	
}
