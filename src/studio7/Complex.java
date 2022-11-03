package studio7;

public class Complex {

	private double real; 
	private double imaginary; 
	
	public Complex (double instreal, double instimaginary) {
		real = instreal; 
		imaginary = instimaginary; 
	}
	
	public String toString() {
		return (real + " + " + imaginary + "i" );
	}
	
	public double getReal() {
		return real; 
	}
	
	public double getImaginary() {
		return imaginary; 
	}
	
	public String addComplexNumber(Complex complex1, Complex complex2) {
		double newReal = complex1.getReal() + complex2.getReal();  
		double newImaginary = complex1.getImaginary() + complex2.getImaginary();
		return (newReal + " + " + newImaginary + "i"); 
	}
	
	public String multiplyComplexNumber(Complex complex1, Complex complex2) {
		double newReal = (complex1.getReal()*complex2.getReal()) - (complex2.getImaginary()*complex2.getImaginary());
		double newImaginary = (complex1.getReal()*complex2.getImaginary()) + (complex2.getReal()*complex1.getImaginary());
		return (newReal + " + " + newImaginary + "i"); 
	}
	

	
}
