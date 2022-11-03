package studio7;

public class Fraction {

	private int n;
	private int d; 
	
	public Fraction(int instn, int instd) {
		n = instn;
		d = instd;
	}
	
	public String toString() {
		return (n + "/" + d);
	}
	
	public int getN () {
		return n; 
	}
	
	public int getD() {
		return d; 
	}
	
	public String fractionMultiplication(Fraction fraction1, Fraction fraction2) {
		int newN = fraction1.getN()*fraction2.getN(); 
		int newD = fraction1.getD()*fraction2.getD();
		
		int q = newN; 
		int p = newD; 
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		
		
		return(newN/p + "/" + newD/p); 
	}
	
	public String fractionAddition(Fraction fraction1, Fraction fraction2) {
		int newN = (fraction1.getN()*fraction2.getD()) + (fraction2.getN()*fraction1.getD());
		int newD = fraction1.getD()*fraction2.getD();
		
		int q = newN; 
		int p = newD; 
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		
		
		return(newN/p + "/" + newD/p); 
	}
	
	public String reciprocal(Fraction fraction1) {
		int newN = (fraction1.getD());
		int newD = fraction1.getN();
		
		return (newN + "/" + newD);
	}
	

}
